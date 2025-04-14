package vn.com.T3H.BaiKiemTraModule2;

import java.util.*;

public class Company
{
    private List<Employee> employees = new ArrayList<>();
    private Map<String, Double> salaryMap = new HashMap<>();
    private Set<String> departments = new HashSet<>();

    public Company()
    {
        employees.add(new Employee("Nguyễn Văn A",22,8000));
        employees.add(new Employee("Đinh Văn B", 19,5000));
        employees.add(new Employee("Võ Thị C", 30,12000));
        employees.add(new Manager("Trần Văn D",21,7000,"IT"));

        departments.add("IT");
        departments.add("HR");
        departments.add("Sports");
        departments.add("Makerting");

        for (Employee employee : employees)
        {
            salaryMap.put(employee.getName(), employee.getSalary());
        }
    }

    public void addEmploye(Employee employee)
    {
        employees.add(employee);
        salaryMap.put(employee.getName(), employee.getSalary());
        if (employee instanceof Manager)
        {
            departments.add(((Manager)employee).getDepartment());
        }
    }

    public void displayAllEmployees()
    {
        System.out.println("Danh sách nhân viên: ");
        for (Employee employee : employees)
        {
            employee.disolayInfo();
        }
    }

    public void updateSalary(String name, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                try {
                    employee.updateSalary(employee, newSalary);
                    salaryMap.put(name, newSalary);
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Employee not found");
    }

    public void findSalaryByName(String name) {
        if (salaryMap.containsKey(name)) {
            System.out.println("Salary of " + name + " is " + salaryMap.get(name));
        }else {
            System.out.println("Employee not found");
        }
    }

    public void addDepartment(String department) {
        departments.add(department);
    }

    public void displayDepartment()
    {
        for (String department : departments) {
            System.out.println("Department: " + department);
        }
    }

    public void sortEmployeesBySalaryDesc()
    {
        employees.sort((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
    }

    public void searchEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                System.out.println("Employee found: ");
                employee.disolayInfo();
                return;
            }
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
