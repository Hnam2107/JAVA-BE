package vn.com.T3H;

import java.util.Scanner;

public class toan
{
    public static void main(String[] args)
    {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Nhập a: ");
        a = sc.nextFloat();
        System.out.println("\n Nhập b: ");
        b = sc.nextFloat();


    }

        public void Tong( float a, float b)
        {
            float tong = a + b;
            System.out.println("\n tổng hai số là: " + tong);
        }

        public void Tich( float a, float b)
        {
        float tich = a * b;
        System.out.println("\n Tích hai số là: " + tich);
        }

        public void Thuong(float a,float b)
        {
            float thuong = a / b;
            System.out.println("\n Thương hai số là: " + thuong);
        }

        public void thuong(float a,float b)
        {
            float soDu = a % b;
            System.out.println("\n Số dư của thương là: " + soDu);
        }

}
