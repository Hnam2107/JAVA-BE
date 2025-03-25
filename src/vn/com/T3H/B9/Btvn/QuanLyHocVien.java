package vn.com.T3H.B9.Btvn;

import java.util.Scanner;

public class QuanLyHocVien
{
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Student hocVien = new Student();
        int chon;
        do{
            System.out.println("----- MENU -----");
            System.out.println("1. Nhập thông tin học viên.");
            System.out.println("2. Hiển thị thông tin học viên.");
            System.out.println("3. Thêm học viên vào danh sách.");
            System.out.println("4. Dăng ký môn cho học viên.");
            System.out.println("0. Dừng chương trình.");
            System.out.println(" Mời bạn chọn: ");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    hocVien.nhapThongTinHocVien();
                    break;
                case 2:
                    hocVien.hienThongTinHocVien();
                    break;
                case 3:
                    manager.themHocVien(hocVien);
                    System.out.println("Thêm học viên vào danh sách thành công! ");
                    break;
                case 4:
                    manager.dangKyMon(hocVien);
                    break;
                case 0:
                    System.exit(chon);
                    break;
            }
        }while (chon != 0);
    }
}
