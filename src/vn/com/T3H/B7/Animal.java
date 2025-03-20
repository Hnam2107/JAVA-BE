package vn.com.T3H.B7;

import java.util.Scanner;

public class Animal
{

    private String name; // Tên động vật
    private int age; // Tuổi động vật
    private String species; // Loài động vật
    private String color; // Màu sắc

    // Nhập thông tin của động vật
    public void intputInfo()
    {
        System.out.println(" Nhập Tên động vật: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println(" Nhập Tuổi đông vật: ");
        this.age = new Scanner(System.in).nextInt();
        System.out.println(" Nhập Loài động vật: ");
        this.species = new Scanner(System.in).nextLine();
        System.out.println(" Nhập Màu sắc: ");
        this.color = new Scanner(System.in).nextLine();
    }

    // Hiển thị thông tin của động vật
    public void displayInfo()
    {
        System.out.println("---------------------------");
        System.out.println(" Tên động vật: " + name);
        System.out.println(" Tuổi động vật: " + age);
        System.out.println(" Loài động vật: " + species);
        System.out.println(" Màu sắc: " + color);
    }

    public void makeSound()
    {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
