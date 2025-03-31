package vn.com.T3H.B10.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1
{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        for (int i = 0; i < 5; i++) {
            
        }
        people.add(new Person(1,"An"));
        people.add(new Person(2,"Ba"));
        people.add(new Person(3,"Tứ"));
        people.add(new Person(4,"Hùng"));
        people.add(new Person(5, "Mạnh"));

        // Hiện thị thông tin
        System.out.println("Danh sách Person: ");
        people.stream().forEach(data -> System.out.println(data));
        //Nhập và tìm kiếm person
        System.out.println("Nhập tên cần tìm: ");
        String search = new Scanner(System.in).nextLine();
        System.out.println("Hiện danh sách tên cần tìm: ");
        people.stream().filter(data -> data.getName().equals(search)).forEach(data -> System.out.println("tìm thấy"));
        //Nhạp tên cần xóa
        System.out.println("Nhập tên cần xóa: ");
        String delete = new Scanner(System.in).nextLine();
    }


}
