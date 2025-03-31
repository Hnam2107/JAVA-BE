package vn.com.T3H.B10.Test;

public class Person
{
    private Integer id;
    private String name;

    public  Person(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID = " + id + ", Name = " + name + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
