package vn.com.T3H.baiKiemTraModule1;

import java.util.Scanner;

public class P2Cau3
{
    public static void main(String[] args) {
        System.out.println ("Nhập số chuyến đi: ");
        int n = new Scanner(System.in).nextInt();
        int giaVe = 10000;
        double giam5 = 0.10;// Đi trên 5 chuyến giảm 10%
        double giam10 = 0.20;// Đi trên 10 chuyến giảm 20%
        float sum = n * giaVe;
        double giamGia = 0;
        if ( n > 5 )
        {
            giamGia = (sum * giam5);
        }else if ( n > 10 )
        {
            giamGia = (sum * giam10);
        }

        double tongPhaiTra = sum - giamGia;
        System.out.println ("Tổng tiền: " + sum + " vnd");
        System.out.println ("Giảm giá: " + giamGia + " vnd");
        System.out.println ("Tiền phải trả: " + tongPhaiTra + " vnd");
    }
}
