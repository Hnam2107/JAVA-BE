package vn.com.T3H.B8.Test1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Nhaajp a: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Nhaajp b: ");
        int y = new Scanner(System.in).nextInt();
        IChiaHaiSo thuong = new ChiaHaiSoImplement()
        {
            @Override
            public int chiaHaiSo(int a, int b) {
                return super.chiaHaiSo(a, b);
            }
        };
        System.out.println(thuong.chiaHaiSo(x,y));
        //Lambda expression
        IChiaHaiSo thuong2 = (a,b) ->{
            return a/b;
        };
        System.out.println(thuong2.chiaHaiSo(x,y));
    }
}
