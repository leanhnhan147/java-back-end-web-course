package FinalAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Department {
    private String departmentName;

    String url = "jdbc:sqlserver://localhost:1433;databaseName=FinalAssignment;" +
            "encrypt=true;trustServerCertificate=true;integratedSecurity=true;";
    Connection connection = null;

    private Connection getConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            return connection;
        } else {
            try {
                connection = DriverManager.getConnection(url);
                return connection;
            } catch (SQLException e) {
                System.out.println("getConnection error: " + e);
                System.exit(0);
            }
        }
        return null;
    }

    private void closeConnection() {
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void addEmployee() throws SQLException {
        Scanner s = new Scanner(System.in);
        String a;
        System.out.println("Nhập tên phòng ban");
        a = s.nextLine();
        System.out.println("Hãy chọn kiểu SalariedEmployee(1) hay HourlyEmployee(2)");
        do {
            String t;
            t= s.nextLine();
            if( t.equals("1")) {
                SalariedEmployee e = new SalariedEmployee();
                addDepartment(e.addEmployeeWithSalariedEmployee(),a);
                break;
            }else if(t.equals("2")) {
                HourlyEmployee h = new HourlyEmployee();
                addDepartment(h.addEmployeeWithHourlyEmployee(), a);
                break;
            }else {
                System.out.println("Bạn nhập sai rồi.Hãy nhập lại!");
            }
        }while(true);
    }

    private void addDepartment(int paramId, String paramString) throws SQLException {
        PreparedStatement preparedStatement = null;
        getConnection();
        try {
            String sqlQuery = "INSERT INTO Department VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, paramString);
            preparedStatement.setInt(2, paramId);

            int affectedRows = preparedStatement.executeUpdate();
            System.out.println("Thêm nhân viên mới " + (affectedRows > 0 ? "thành công" : "không thành công"));
        } catch (Exception e) {
            System.err.println("Add Department Error: " + e);
        } finally {
            closeConnection();
        }
    }

    public void showEmployees() throws SQLException {
        getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            String sqlQuery = "SELECT e.employeeId, e.ssn, e.firstName, e.lastName, " +
                    "e.birthDate, e.phone, e.email, e.SalariedEmployeeId, e.HourlyEmployeeId, d.departmentName " +
                    "FROM Employee e, Department d " +
                    "WHERE e.employeeId = d.employeeId";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);

            System.out.println("Thông tin nhân viên:");
            System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                    "EmployeeID", "SSN", "First Name", "Last Name", "Birth Date", "phone", "email","Salaried/Hourly ID","DepartmentName");
            while (resultSet.next()) {

                int salariedEmployeeId = resultSet.getInt("SalariedEmployeeId");
                int hourlyEmployeeId = resultSet.getInt("HourlyEmployeeId");
                if (salariedEmployeeId != 0) {

                    // Hiển thị thông tin của SalariedEmployee dựa trên salariedEmployeeId
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            resultSet.getInt(1), resultSet.getString(2),
                            resultSet.getString(3), resultSet.getString(4),
                            resultSet.getString(5), resultSet.getString(6),
                            resultSet.getString(7), salariedEmployeeId, resultSet.getString(10));

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                }
                if (hourlyEmployeeId != 0) {

                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            resultSet.getInt(1), resultSet.getString(2),
                            resultSet.getString(3), resultSet.getString(4),
                            resultSet.getString(5), resultSet.getString(6),
                            resultSet.getString(7), hourlyEmployeeId, resultSet.getString(10));

                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                }
            }
        } catch (Exception e) {
            System.err.println("Show List Employee Error: " + e);
        } finally {
            closeConnection();
        }
    }

    public void searchEmployeesByDepartment() throws SQLException {
        getConnection();
        boolean foundFlag = false;
        Scanner s=new Scanner(System.in);
        String departmentName;
        System.out.println("Nhập tên phòng ban bạn muốn tìm");

        departmentName = s.nextLine();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sqlQuery =  "SELECT e.employeeId, e.ssn, e.firstName, e.lastName, e.birthDate, " +
                    "e.phone, e.email, e.SalariedEmployeeId, e.HourlyEmployeeId, d.departmentName " +
                    "FROM Employee e, Department d " +
                    "WHERE e.employeeId = d.employeeId and d.departmentName =?";

            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, departmentName);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int salariedEmployeeId = resultSet.getInt("SalariedEmployeeId");
                int hourlyEmployeeId = resultSet.getInt("HourlyEmployeeId");

                if (salariedEmployeeId != 0) {
                    foundFlag = true;
                    System.out.println("Thông tin SalariedEmployee:");
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            "EmployeeID", "SSN", "First Name", "Last Name", "Birth Date", "phone",
                            "email","SalariedID","DepartmentName");
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            resultSet.getInt(1), resultSet.getString(2),
                            resultSet.getString(3), resultSet.getString(4),
                            resultSet.getString(5), resultSet.getString(6),
                            resultSet.getString(7), salariedEmployeeId, resultSet.getString(10));

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                }

                if (hourlyEmployeeId != 0) {
                    foundFlag = true;
                    System.out.println("Thông tin HourlyEmployee:");
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            "EmployeeID", "SSN", "First Name", "Last Name", "Birth Date", "phone", "email","Hourly ID","DepartmentName");
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            resultSet.getInt(1), resultSet.getString(2),
                            resultSet.getString(3), resultSet.getString(4),
                            resultSet.getString(5), resultSet.getString(6),
                            resultSet.getString(7), hourlyEmployeeId, resultSet.getString(10));

                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                }
            }

            if (!foundFlag) {
                System.out.println("Không tìm thấy kết quả.");
            }
        } catch (Exception e) {
            System.err.println("Search Employees By Department Error: " + e);
        } finally {
            closeConnection();

        }
    }

    public void searchEmployeesByName() throws SQLException {
        getConnection();
        boolean foundFlag = false;
        Scanner s=new Scanner(System.in);
        String firstname, lastname;
        System.out.println("Nhập firstname: ");
        firstname = s.nextLine();
        System.out.println("Nhập lastname: ");
        lastname = s.nextLine();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sqlQuery =  "SELECT e.employeeId, e.ssn, e.firstName, e.lastName, e.birthDate, " +
                    "e.phone, e.email, e.SalariedEmployeeId, e.HourlyEmployeeId, d.departmentName " +
                    "FROM Employee e, Department d " +
                    "WHERE e.employeeId = d.employeeId and e.firstName =? and e.lastname =?";

            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int salariedEmployeeId = resultSet.getInt("SalariedEmployeeId");
                int hourlyEmployeeId = resultSet.getInt("HourlyEmployeeId");

                if (salariedEmployeeId != 0) {
                    foundFlag = true;
                    System.out.println("Thông tin nhân viên làm việc theo lương:");
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            "EmployeeID", "SSN", "First Name", "Last Name", "Birth Date", "phone", "email","SalariedID","DepartmentName");
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            resultSet.getInt(1), resultSet.getString(2),
                            resultSet.getString(3), resultSet.getString(4),
                            resultSet.getString(5), resultSet.getString(6),
                            resultSet.getString(7), salariedEmployeeId, resultSet.getString(10));

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                }

                if (hourlyEmployeeId != 0) {
                    foundFlag = true;
                    System.out.println("Thông tin nhân viên làm việc theo giờ:");
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            "EmployeeID", "SSN", "First Name", "Last Name", "Birth Date", "phone", "email","Hourly ID","DepartmentName");
                    System.out.printf("%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-15s|%-20s|%-10s\n",
                            resultSet.getInt(1), resultSet.getString(2),
                            resultSet.getString(3), resultSet.getString(4),
                            resultSet.getString(5), resultSet.getString(6),
                            resultSet.getString(7), hourlyEmployeeId, resultSet.getString(10));

                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                }
            }

            if (!foundFlag) {
                System.out.println("Không tìm thấy kết quả.");
            }
        }catch (Exception e) {
            System.err.println("Search Employees By Name Error: " + e);
        } finally {
            closeConnection();
        }
    }

    public void statistic() throws SQLException {
        getConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            String sqlQuery = "SELECT d.departmentName, COUNT(*) AS employeeCount " +
                    "FROM Department d " +
                    "GROUP BY d.departmentName";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);

            System.out.printf("%-24s|%-20s|\n","Tên phòng ban","Số lượng nhân viên");
            System.out.println("----------------------------------------------");
            while (resultSet.next()) {
                System.out.printf("%-24s|%-20s|\n",resultSet.getString(1),resultSet.getString(2) );
                System.out.println("----------------------------------------------");
            }

        }catch (Exception e) {
            System.err.println("Statistic Error: " + e);
        } finally {
            closeConnection();

        }
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void display() {
        System.out.println("Department [departmentName=" + getDepartmentName() +"]");
    }
}
