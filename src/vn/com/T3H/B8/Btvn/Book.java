package vn.com.T3H.B8.Btvn;

import java.util.Scanner;

public abstract class Book
{
    private int id; //Mã sách
    private String title; // Tên sách
    private int year; // Năm sản xuất
    private String author; // Tên tác giả

    public Book(){

    }

    public Book(int id, String title, int year, String author)
    {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public void intputInfo() //Nhập thông tin sách
    {
        System.out.println("Nhập ID: ");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("Nhập Tên sách: ");
        this.title = new Scanner(System.in).nextLine();
        System.out.println("Nhập Năm sản xuất: ");
        this.year = new Scanner(System.in).nextInt();
        System.out.println("Nhập Tên tác giả: ");
        this.author = new Scanner(System.in).nextLine();
    }

    public void dispalyInfo() // Hiện thông tin sách
    {
        System.out.println("--------------");
        System.out.println("ID: " + id);
        System.out.println("Tên sách: " + title);
        System.out.println("Năm sản xuất: " + year);
        System.out.println("Tác giả: " + author);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
