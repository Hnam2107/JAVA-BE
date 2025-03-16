package vn.com.T3H.baiKiemTraModule1;

import java.util.Scanner;

public class P3Cau1
{
    public static void main(String[] args) {
        System.out.println ("Nhập vào chuỗi: ");
        String intput = new Scanner(System.in).nextLine();
        StringBuilder chuoiDaoNguoc = new StringBuilder(intput);
        chuoiDaoNguoc.reverse();
        System.out.println ("Chuỗi đảo ngược là: " + chuoiDaoNguoc);
    }
}
