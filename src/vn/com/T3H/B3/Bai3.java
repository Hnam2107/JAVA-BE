package vn.com.T3H.B3;

import java.util.Scanner;

public class Bai3
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        do{
            System.out.println ("Nhập số n: ");
            n=sc.nextInt();
            if (n < 0)
            {
                System.out.println ("Nhập lại số n để thỏa mãn n dương!");
            }
        }while (n <= 0);
        System.out.println ("Dãy của S(n) là: ");
        for (int i = 1; i < n+1; i++)
        {
            sum = (n*(n+1)/2) * (n*(n+1)/2);
            if (i < n)
            {
                System.out.println (i + " ^3+ ");
            }else {
                System.out.println (i + " ^3");
            }
        }
        System.out.println ("Tổng của dãy S(" +n+ ") là: " + sum);
    }
}
