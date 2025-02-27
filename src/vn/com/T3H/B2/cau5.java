package vn.com.T3H.B2;

import java.util.Scanner;

public class cau5
{
    public static void main(String[] args)
    {
        int thang, nam;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập năm: ");
    nam = scanner.nextInt();
    System.out.print("Nhập tháng: ");
    thang = scanner.nextInt();
    int ngay;
    switch (thang)
    {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            ngay = 31;
            break;
        case 4: case 6: case 9: case 11:
            ngay = 30;
            break;
        case 2:
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
            {
                ngay = 29;
            } else {
                ngay = 28;
            }
            break;
        default:
            ngay = -1;
    }
    if (ngay == -1) {
        System.out.println("Tháng không hợp lệ.");
    } else {
        System.out.println("Số ngày trong tháng " + thang + " của năm " + nam + " là: " + ngay);
    }
    }
}
