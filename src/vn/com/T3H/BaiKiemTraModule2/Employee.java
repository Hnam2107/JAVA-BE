package vn.com.T3H.BaiKiemTraModule2;

public class Employee implements Workable
{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        work();
    }

    public void disolayInfo()
    {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Lương: " + salary);
    }

    @Override
    public void work() {
        System.out.println("Working as an employee.");
    }

    public void updateSalary (Employee employee,double newSalary)
    {
        if (newSalary < 0)
        {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = newSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
