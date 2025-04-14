package vn.com.T3H.BaiKiemTraModule2;

public class Manager extends Employee
{
    private String department;

    public Manager(String name,int age, double salary, String department)
    {
        super(name,age,salary);
        this.department = department;
    }

    @Override
    public void disolayInfo() {
        super.disolayInfo();
        System.out.println("Phòng ban: " + department);
    }

    public void displayInfo(String format)
    {
        if (format.equalsIgnoreCase("JSON"))
        {
            System.out.println("{ \"name\": \"" + getName() + "\", \"age\": " + getAge() + ", \"salary\": " + getSalary() + ", \"department\": \"" + department + "\" }");
        }else{
            disolayInfo();
        }
    }

    @Override
    public void work() {
        System.out.println("Managing department: " + department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
