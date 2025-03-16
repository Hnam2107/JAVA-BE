package vn.com.T3H.baiKiemTraModule1;

import java.util.Scanner;

public class P3Cau2
{
    public static void main(String[] args) {
        System.out.println ("Nhập vào chuỗi: ");
        String intput = new Scanner(System.in).nextLine();
        StringBuilder chuoiDaoNguoc = new StringBuilder(intput);
        chuoiDaoNguoc.reverse();
        if (intput.equalsIgnoreCase(chuoiDaoNguoc.toString()))
        {
            System.out.println ("Chuỗi " + chuoiDaoNguoc + " là chuỗi Palindrome");
        }else{
            System.out.println ("Chuỗi " + chuoiDaoNguoc + " không là chuỗi Palindrome");
        }
    }
}
