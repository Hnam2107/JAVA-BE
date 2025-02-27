package vn.com.T3H.B2;

import java.util.Scanner;

public class cau4
{
    public static void main(String[] args)
    {
        int chon;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println ("+............................+");
        System.out.println ("\n 1.Tính điểm sinh viên.");
        System.out.println ("\n 2.Kiểm tra loại tam giác.");
        System.out.println ("\n 3.Tính tin điện.");
        System.out.println ("\n 4.Kết thúc!");
        System.out.println ("\n Mời lựa chọn: ");
        chon = sc.nextInt();
        switch (chon) {
            case 1:
                float dChuyencan, dgiuaKy, dCuoiKy;
                System.out.println ("\n Nhập điểm chuyên cần: ");
                dChuyencan = sc.nextFloat();
                System.out.println ("\n Nhập điểm giữa kỳ: ");
                dgiuaKy = sc.nextFloat();
                System.out.println ("\n Nhập điểm cuối kỳ: ");
                dCuoiKy = sc.nextFloat();
                float dtb = (dChuyencan + dgiuaKy + dCuoiKy)/3;
                char loai = 0;
                if (dtb >=9 )
                {
                    loai = 'A';
                }else if (dtb>=7 && dtb <9)
                {
                    loai = 'B';
                }else if (dtb>=5 && dtb <7)
                {
                    loai = 'C';
                }else if (dtb<5)
                {
                    loai = 'D';
                }
                System.out.println ("\n Điểm trung bình là: " + dtb);
                System.out.println ("\n Xếp loại: " + loai);
                break;

            case 2:
                float a,b,c;
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
                break;

            case 3:
                int sodien, tong = 0;
                System.out.print("Nhập số điện : ");
                sodien = sc.nextInt();
                if (sodien >= 0 && sodien <= 50) {
                    tong = sodien * 1678;
                } else if (sodien >= 51 && sodien <= 100) {
                    tong = 50 * 1678 + (sodien - 50) * 1734;
                } else if (sodien >= 101 && sodien <= 200) {
                    tong = 50 * 1678 + 50 * 1734 + (sodien - 100) * 2014;
                } else if (sodien >= 201 && sodien <= 300) {
                    tong = 50 * 1678 + 50 * 1734 + 100 * 2014 + (sodien - 200) * 2536;
                } else if (sodien >= 301 && sodien <= 400) {
                    tong = 50 * 1678 + 50 * 1734 + 100 * 2014 + 200 * 2536 + (sodien - 300) * 2834;
                } else if (sodien >= 401) {
                    tong = 50 * 1678 + 50 * 1734 + 100 * 2014 + 200 * 2536 + 301 * 2834 + (sodien - 400) * 2927;
                }
                System.out.println("Tổng tiền điện là: " + tong);
                break;
                case 4: System.exit(chon);
        }
        }while (chon!=0);
    }
}