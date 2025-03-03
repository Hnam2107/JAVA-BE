package vn.com.T3H.B3;

import java.util.Scanner;

public class Bai6
{
    public static void convertBinary(int n)
    {
        int binary[] = new int[40];
        int index = 0;
        while(n > 0)
        {
            binary[index++] = n%2;
            n = n/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Nhập số n: ");
        n=sc.nextInt();
        System.out.println ("Số nhị phân của " + n + " là: " );
        convertBinary(n);
    }
}
