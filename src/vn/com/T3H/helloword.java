package vn.com.T3H;

import java.util.Scanner;

public class helloword
{
    public static void main(String[] args)
    {
        String hoten, quequan, truonghoc, ngaysinh;
        Scanner sc = new Scanner(System.in);
        System.out.println ("\n Nhập Họ và tên: ");
        hoten = sc.nextLine();
        System.out.println ("\n Nhập Quê quán: ");
        quequan = sc.nextLine();
        System.out.println ("\n Nhập Ngày sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println ("\n Nhập Trường học: ");
        truonghoc = sc.nextLine();
        System.out.println ("\n Xin chào " + hoten + " đến từ " + quequan + " ,sinh ngày " + ngaysinh + " trường " + truonghoc);
    }
}
