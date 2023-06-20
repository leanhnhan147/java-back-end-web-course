package FinalAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SalariedEmployee extends Employee{

    private double commissionRate;
    private double grossSalary;
    private double basicSalary;

    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FinalAssignment;" +
            "encrypt=true;trustServerCertificate=true;integratedSecurity=true;";
    Connection connection = null;

    public SalariedEmployee(String ssn,String firstName,String lastName, double commissionRate, double grossSalary,double basicSalary) {
        super(ssn,firstName,lastName);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;
        this.basicSalary = basicSalary;
    }
    public SalariedEmployee( ) {}

    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    public double getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    @Override
    public void display() {

        System.out.println("SalariedEmployee [commissionRate=" + commissionRate + ", grossSalary=" + grossSalary + ", basicSalary="
                + basicSalary + ", getSsn()=" + getSsn() + ", getFirstName()=" + getFirstName() + ", getLastName()="
                + getLastName() + "]");
    }
    @Override
    public String toString() {
        return "SalariedEmployee [commissionRate=" + commissionRate + ", grossSalary=" + grossSalary + ", basicSalary="
                + basicSalary + ", getSsn()=" + getSsn() + ", getFirstName()=" + getFirstName() + ", getLastName()="
                + getLastName() + "]";
    }

    private Connection getConnection() {
        if (connection != null) {
            return connection;
        } else {
            try {
                connection = DriverManager.getConnection(dbURL);
                return connection;
            } catch (Exception e) {
                System.out.println("get connection get error: " + e);
                System.exit(0);
            }
        }
        return null;
    }

    private void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public int addEmployeeWithSalariedEmployee() {
        getConnection();
        PreparedStatement preparedStatement = null;
        int generatedId = -1; // Giá trị mặc định của ID nếu không thành công
        Scanner scanner = new Scanner(System.in);
        try {
            String sqlQuery = "INSERT INTO Employee (ssn, firstName, lastName, birthDate, phone, email, SalariedEmployeeId) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sqlQuery , Statement.RETURN_GENERATED_KEYS);

            System.out.println("Hãy nhập ssn: ");
            preparedStatement.setString(1, scanner.nextLine());
            System.out.println("Hãy nhập firstName: ");
            preparedStatement.setString(2, scanner.nextLine());
            System.out.println("Hãy nhập lastName: ");
            preparedStatement.setString(3, scanner.nextLine());
            System.out.println("Hãy nhập birthDate: ");
            String birthdateStr = scanner.nextLine();
            while (!isValidBirthdate(birthdateStr)) {
                System.out.println("Ngày sinh không đúng định dạng (dd/mm/yyyy). Vui lòng nhập lại: ");
                birthdateStr = scanner.nextLine();
            }
            preparedStatement.setString(4, birthdateStr);
            System.out.println("Hãy nhập phone: ");
            String phoneNumber = scanner.nextLine();
            while (!isValidPhoneNumber(phoneNumber)) {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại: ");
                phoneNumber = scanner.nextLine();
            }
            preparedStatement.setString(5, phoneNumber);
            System.out.println("Hãy nhập email: ");
            String email = scanner.nextLine();
            while (!isValidEmail(email)) {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại: ");
                email = scanner.nextLine();
            }
            preparedStatement.setString(6, email);
            int salariedEmployeeId = addSalariedEmployee();
            preparedStatement.setInt(7, salariedEmployeeId);

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedId = generatedKeys.getInt(1); // Lấy giá trị ID
                }
            } else {
                System.out.println("Thêm nhân viên mới không thành công");
            }
        } catch (Exception e) {
            System.err.println("Add Employee With Salaried Employee Error: " + e);
        }finally {
            closeConnection();
        }
        return generatedId;
    }

    private int addSalariedEmployee() {
        getConnection();
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);
        int generatedId = -1; // Giá trị mặc định của ID nếu không thành công
        try {
            String sqlQuery = "INSERT INTO SalariedEmployee VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);

            System.out.println("Hãy nhập commissionRate: ");
            preparedStatement.setFloat(1, scanner.nextFloat());
            System.out.println("Hãy nhập grossSalary: ");
            preparedStatement.setFloat(2, scanner.nextFloat());
            System.out.println("Hãy nhập basicSalary: ");
            preparedStatement.setFloat(3, scanner.nextFloat());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedId = generatedKeys.getInt(1); // Lấy giá trị ID
                }
            } else {
                System.out.println("Thêm nhân viên mới không thành công");
            }
        } catch (Exception e) {
            System.err.println("Add Salaried Employee Error: " + e);
        }
        return generatedId;
    }

    public static boolean isValidEmail(String email) {
        // Regex pattern cho email hợp lệ
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Tạo đối tượng Pattern từ pattern string
        Pattern pattern = Pattern.compile(emailPattern);

        // Kiểm tra email bằng pattern
        Matcher matcher = pattern.matcher(email);

        // Kiểm tra xem email có khớp với pattern hay không
        return matcher.matches();
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Regex pattern cho số điện thoại hợp lệ
        String phonePattern = "^(\\+\\d{1,3})?\\s?\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}$";

        // Tạo đối tượng Pattern từ pattern string
        Pattern pattern = Pattern.compile(phonePattern);

        // Kiểm tra số điện thoại bằng pattern
        Matcher matcher = pattern.matcher(phoneNumber);

        // Kiểm tra xem số điện thoại có khớp với pattern hay không
        return matcher.matches();
    }
    public static boolean isValidBirthdate(String birthdateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        dateFormat.setLenient(false);

        try {
            // Parse birthdate từ string thành đối tượng Date
            Date birthdate = dateFormat.parse(birthdateStr);

            // Kiểm tra xem birthdate có bằng với string ban đầu không (đảm bảo định dạng và giá trị ngày tháng năm hợp lệ)
            return dateFormat.format(birthdate).equals(birthdateStr);
        } catch (ParseException e) {
            return false;
        }
    }
}

