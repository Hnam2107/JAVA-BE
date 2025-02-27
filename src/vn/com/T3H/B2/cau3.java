package vn.com.T3H.B2;

import java.util.Scanner;

public class cau3
{
    public static void main(String[] args)
    {
        int sodien, tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Nhập số điện : ");
        sodien = sc.nextInt();
        if (sodien >=0 && sodien <= 50)
        {
            tong = sodien * 1678;
        }else if (sodien >=51 && sodien <= 100)
        {
            tong = 50 * 1678 + (sodien - 50) * 1734;
        }
        else if (sodien >=101 && sodien <= 200)
        {
            tong = 50 * 1678 + 50 * 1734 + (sodien - 100) * 2014;
        }else if (sodien >=201 && sodien <= 300)
        {
            tong = 50 * 1678 + 50 * 1734 + 100 * 2014 + (sodien - 200) * 2536;
        }else if (sodien >=301 && sodien <= 400)
        {
            tong = 50 * 1678 + 50 * 1734 + 100 * 2014 + 200 * 2536 + (sodien - 300) * 2834;
        }else if (sodien>=401)
        {
            tong = 50 * 1678 + 50 * 1734 + 100 * 2014 + 200 * 2536 + 301 * 2834 + (sodien -400) * 2927;
        }
        System.out.println ("Tổng tiền điện là: " + tong);
    }
}
