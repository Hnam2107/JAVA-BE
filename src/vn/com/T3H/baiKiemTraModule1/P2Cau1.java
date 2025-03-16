package vn.com.T3H.baiKiemTraModule1;

import java.util.Scanner;

public class P2Cau1
{
    public static void main(String[] args) {
        System.out.println ("Nhập sô nguyên: ");
        int n = new Scanner(System.in).nextInt();
        if (n % 2 == 0)
        {
            System.out.println ("Số " + n +" vừa nhập là số chẵn! ");
        }else{
            System.out.println ("Số " + n +" vừa nhập là sô lẻ! ");
        }
    }
}
