package vn.com.T3H.baiKiemTraModule1;

import java.util.Scanner;

public class P2Cau2
{
    public static void main(String[] args) {
     System.out.println ("Nhập số nguyên: ");
     int n = new Scanner(System.in).nextInt();
     String tenThu = "";
     switch (n)
     {
         case 1:
             tenThu = "Chủ nhật";
             break;
         case 2:
             tenThu = "Thứ 2";
             break;
         case 3:
             tenThu = "Thứ 3";
             break;
         case 4:
             tenThu = "Thứ 4";
             break;
         case 5:
             tenThu = "Thứ 5";
             break;
         case 6:
             tenThu = "Thứ 6";
             break;
         case 7:
             tenThu = "Thứ 7";
             break;
         default:
             System.out.println ("Số không hợp lệ vui lòng nhập từ 1 đến 7!");
     }
     System.out.println ("Ngày tương ứng: " + tenThu);
    }
}
