package vn.com.T3H.baiKiemTraModule1;

import java.util.Scanner;

public class P1Cau1
{
    public static void main(String[] args)
    {
        System.out.println ("Nhập số a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println ("Nhập số b: ");
        int b = new Scanner(System.in).nextInt();
        int sum = a + b;
        System.out.println ("Tổng của hai số nguyên là : " + sum);
    }
}
