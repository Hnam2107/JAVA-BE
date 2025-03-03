package vn.com.T3H.B3;

import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
{
    System.out.println("Nhap vao so: ");
    int data = new Scanner(System.in).nextInt();
    int soDaoNguoc =0;
    while (data != 0)
    {
        int soDu= data % 10;
        soDaoNguoc = soDaoNguoc * 10 + soDu;
        data = data / 10;
    }
    System.out.println("So dao nguoc la: " + soDaoNguoc);
    }
}
