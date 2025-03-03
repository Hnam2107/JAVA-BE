package vn.com.T3H.B3;

import java.util.Scanner;

public class Bai5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int i, j, k;
        int tong=0;
        for (i=0; i<200; i++){
            for (j=0; j<100; j++){
                for (k=0; k<40; k++){
                    if (i * 1000 + j * 2000 + k * 5000 == 200000){
                        System.out.println (i + " x 1000đ + " + j + " x 2000đ + " + k + " x 5000đ = 200000đ");
                        tong++;
                    }
                }
            }
        }
        System.out.println ("Có tất cả " + tong + " phương án có thể để có tổng 200.000đ từ 3 loại giấy bạc 1000đ, 2000đ, và 5000đ");
    }
}
