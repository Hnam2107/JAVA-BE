package vn.com.T3H.B3;

import java.util.Scanner;

public class Bai4
{
    public static long giaiThua(int n)
    {
        if (n == 0)
        {
            return 1;
        }else
        {
            return n * giaiThua(n-1);
        }
    }
    public static void main(String[] args)
    {
        System.out.println ("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        if (n < 0 )
        {
            System.out.println ("Vui lòng nhập lại n!");
        }else{
            long tong = giaiThua(n);
            System.out.println ("Giai thừa của " +n+ " là: " + tong);
        }
    }
}
