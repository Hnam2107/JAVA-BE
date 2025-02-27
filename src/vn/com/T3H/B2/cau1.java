package vn.com.T3H.B2;

import java.util.Scanner;

public class cau1
{
    public static void main(String[] args)
    {
        float dChuyencan, dgiuaKy, dCuoiKy;
        Scanner sc = new Scanner(System.in);
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
    }
}
