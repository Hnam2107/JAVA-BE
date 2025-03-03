package vn.com.T3H.B3;

import java.util.Scanner;

public class Bai1
{
    public static void main(String[] args)
    {
        int soAm=0, tongAm = 0;
        int soDuong=0, tongDuong=0;
        for (int i=1; i<=10; i++)
        {
            System.out.println ("Nhập số thứ : " + i);
            int data = new Scanner(System.in).nextInt();
            System.out.println ("Số thứ " +i+ " là: " + data);
            if (data <0)
            {
                soAm++;
                tongAm = tongAm - data;
            }
            if (data > 0)
            {
                soDuong++;
                tongDuong = tongDuong + data;
            }
            System.out.println ("So luong so âm: " + soAm);
            System.out.println ("So luong so dương: " + soDuong);
            System.out.println ("Tổng số lượng dương là: " + tongDuong);
            System.out.println ("Tổng số lượng âm là: " + tongDuong);
        }
    }
}
