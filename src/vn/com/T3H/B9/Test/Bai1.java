package vn.com.T3H.B9.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args)
    {
        int n=5;
        int[] number = new int[n];
        for(int i=0;i<n;i++)
        { 
            System.out.println("Nhập vào số thứ " + i);
            number[i] = nhapSo(i);
        }

        for (int i=0;i< number.length;i++)
        {
            System.out.println(number[i]);
        }
    }

    private static int nhapSo( int i) {
        int n=0;
        do{
            try{
                int a = new Scanner(System.in).nextInt();
            }catch(Exception e)
            {
                System.out.println("Nhập lại số thứ " + i);
            }
        }while (n == 0);
        return n;
    }
}

