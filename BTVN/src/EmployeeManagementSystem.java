import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();


    public static void main(String[] args) {
        // Khởi tạo 10 nhân viên
        initializeEmployees();

        // Hiển thị danh sách nhân viên
        displayEmployees();

        // Thêm một nhân viên mới
        addNewEmployee();
        displayEmployees();
        // Xóa một nhân viên theo tên
        removeEmployee();
        displayEmployees();
    }

    private static void initializeEmployees() {
        employees.add(new Employee(1, "Hiền", 30, "IT", "E001", 50.0));
        employees.add(new Employee(2, "Khánh", 25, "HR", "E002", 45.0));
        employees.add(new Employee(3, "Hiếu", 35, "Finance", "E003", 55.0));
        employees.add(new Employee(4, "Duyên", 28, "Marketing", "E004", 48.0));
        employees.add(new Employee(5, "Xuân", 32, "IT", "E005", 52.0));
        employees.add(new Employee(6, "Trường", 27, "HR", "E006", 46.0));
        employees.add(new Employee(7, "Nhung", 40, "Finance", "E007", 58.0));
        employees.add(new Employee(8, "Phượng", 33, "Marketing", "E008", 50.0));
        employees.add(new Employee(9, "Uyên", 29, "IT", "E009", 47.0));
        employees.add(new Employee(10, "An", 31, "HR", "E010", 49.0));
    }

    private static void displayEmployees() {
        System.out.println("Danh sách nhân viên:");
        System.out.println("ID \t Name \t Age \t Department \t Code \t Salary Rate")   ;
        for (Employee employee : employees) {
            System.out.println(employee.getId()+"\t" + employee.getName()+"\t" + employee.getAge()+"\t" + employee.getDepartment()+"\t" + employee.getCode()+ "\t" + employee.getSalaryRate());
            System.out.println();
        }
    }

    private static void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nv mới: ");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng đầu tiên
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng đầu tiên
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = scanner.nextDouble();

        Employee newEmployee = new Employee(id, name, age, department, code, salaryRate);
        employees.add(newEmployee);
        System.out.println("Đã thêm nhân viên mới vào danh sách.");
    }

    private static void removeEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên nhân viên cần xóa: ");
        String nameToRemove = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(nameToRemove)) {
                employees.remove(i);
                System.out.println("Đã xóa nhân viên " + nameToRemove + " khỏi danh sách.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân viên " + nameToRemove + " trong danh sách.");
        }

    }
}