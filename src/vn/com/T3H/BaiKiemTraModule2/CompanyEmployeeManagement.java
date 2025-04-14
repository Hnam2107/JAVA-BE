package vn.com.T3H.BaiKiemTraModule2;

import java.util.Scanner;

public class CompanyEmployeeManagement {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Hiển thị tất cả nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Cập nhật lương nhân viên");
            System.out.println("4. Tìm kiếm lương theo tên");
            System.out.println("5. Thêm phòng ban");
            System.out.println("6. Hiển thị phòng ban");
            System.out.println("7. Sắp xếp nhân viên theo lương giảm dần");
            System.out.println("8. Tìm kiếm nhân viên theo tên");
            System.out.println("9. Tính lương bằng lambda");
            System.out.println("0. Thoát");
            System.out.print("Enter your choice: ");

            // Đọc lựa chọn và xử lý dòng newline còn sót lại
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    company.displayAllEmployees();
                    break;
                case 2:
                    System.out.print("Nhập tên: ");
                    String newname = sc.nextLine();

                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();

                    System.out.print("Nhập lương: ");
                    double salary = sc.nextDouble();
                    sc.nextLine(); // Ăn newline còn lại sau nextDouble

                    System.out.print("Có phải quản lý? (y/n): ");
                    String answer = sc.nextLine();

                    if (answer.equalsIgnoreCase("y")) {
                        System.out.print("Nhập phòng ban: ");
                        String dept = sc.nextLine();
                        company.addEmploye(new Manager(newname, age, salary, dept));
                    } else {
                        company.addEmploye(new Employee(newname, age, salary));
                    }
                    break;
                case 3:
                    System.out.print("Tên nhân viên: ");
                    String nameSalary = sc.nextLine();

                    System.out.print("Lương mới: ");
                    double salary1 = sc.nextDouble();
                    sc.nextLine(); // Ăn newline

                    company.updateSalary(nameSalary, salary1);
                    break;
                case 4:
                    System.out.print("Tên nhân viên: ");
                    String searchName = sc.nextLine();
                    company.findSalaryByName(searchName);
                    break;
                case 5:
                    System.out.print("Phòng ban: ");
                    String newDept = sc.nextLine();
                    company.addDepartment(newDept);
                    break;
                case 6:
                    company.displayDepartment();
                    break;
                case 7:
                    company.sortEmployeesBySalaryDesc();
                    company.displayAllEmployees();
                    break;
                case 8:
                    System.out.print("Tên nhân viên: ");
                    String nameNV = sc.nextLine();
                    company.searchEmployeeByName(nameNV);
                    break;
                case 9:
                    SalaryCalculation calc = emp -> emp.getSalary() + 500;
                    System.out.print("Tên nhân viên: ");
                    String nameNV2 = sc.nextLine();

                    for (Employee e : company.getEmployees()) {
                        if (e.getName().equalsIgnoreCase(nameNV2)) {
                            System.out.println("Tổng lương sau tính toán: " + calc.calculateSalary(e));
                        }
                    }
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (choice != 0);
    }
}
