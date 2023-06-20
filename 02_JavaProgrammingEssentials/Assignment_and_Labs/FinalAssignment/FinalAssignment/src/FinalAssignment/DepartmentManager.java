package FinalAssignment;

import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentManager {
    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Tạo danh sách nhân viên");
        System.out.println("2. Xem danh sách nhân viên");
        System.out.println("3. Tìm kiếm nhân viên theo tên phòng ban");
        System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
        System.out.println("5. Thống kê");
        System.out.println("6. Thoát");
        System.out.print("Mời bạn lựa chọn chức năng: ");
    }

    public static void main(String[] args) throws SQLException {
        DepartmentManager departmentManager = new DepartmentManager();
        Department department = new Department();
        Scanner scanner = new Scanner(System.in);
        int options = -1;
        do {
            departmentManager.menu();
            options = scanner.nextInt();

            switch (options) {
                case 1: {
                    department.addEmployee();
                    break;
                }
                case 2:{
                    department.showEmployees();
                    break;
                }
                case 3:
                    department.searchEmployeesByDepartment();
                    break;
                case 4:
                    department.searchEmployeesByName();
                    break;
                case 5:
                    department.statistic();
                    break;
                case 6:
                    options = 0;
                    break;
                default:
                    System.out.println("Bạn nhập sai rồi!");
            }
        }while(options != 0 );
    }
}
