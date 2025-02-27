package vn.com.T3H.B2;

import java.util.Scanner;

public class cau2
{
    public static void main(String[] args)
    {
        float a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print ("Nhập cạnh a: ");
        a=sc.nextFloat();
        System.out.print ("Nhập cạnh b: ");
        b=sc.nextFloat();
        System.out.print ("Nhập cạnh c: ");
        c=sc.nextFloat();
        if (a+b>c && a+c>b && b+c>a)
        {
            if (a == b && b == c)
            {
                System.out.println ("\n Tam giác đều");
            }else if (a == b || a == c || b == c)
            {
                if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
                {
                    System.out.println ("\n Tam giác vuông cân");
                }else {
                    System.out.println ("\n Tam giác cân");
                }
            }else if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
            {
                System.out.println ("\n Tam giá vuông");
            }else{
                System.out.println ("\n tam giác thường");
            }
        }else {
            System.out.println("\n không phải tam giác");
        }
    }
}