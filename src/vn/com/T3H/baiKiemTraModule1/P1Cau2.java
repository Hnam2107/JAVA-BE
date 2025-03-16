package vn.com.T3H.baiKiemTraModule1;

import java.util.Scanner;

public class P1Cau2
{
    public static void main(String[] args)
    {
        System.out.println ("Nhập bán kính hin tròn: ");
        int r = new Scanner(System.in).nextInt();
        double dienTich = Math.PI * Math.pow(r, 2);
        int dTInt =(int) dienTich;
        System.out.println ("Diện tích của hình tròn là: " + dienTich);
        if (dTInt %2 == 0)
        {
            System.out.println ("Diện tích là chẵn. ");
        }else{
            System.out.println ("Diện tích là lẻ.");
        }
    }
}
