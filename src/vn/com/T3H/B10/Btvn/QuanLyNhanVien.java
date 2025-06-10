package vn.com.T3H.B10.Btvn;

import java.util.Scanner;

public class QuanLyNhanVien {
    public static void main(String[] args) {
        QuanLyImpl ql = new QuanLyImpl();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Khởi tạo mặc định 3 nhân viên>");
            System.out.println("2. Thêm nhân viên mới.");
            System.out.println("3. Hiện thị danh sách");
            System.out.println("4. Tính tổng lương.");
            System.out.println("5. Tìm nhân viên lương cao nhất.");
            System.out.println("6. Tìm nhân viên theo mã.");
            System.out.println("7. Sắp xếp theo tên.");
            System.out.println("8. Sắp xếp theo lương giảm dần.");
            System.out.println("0. Thoát chương trình!");
            System.out.println("Mời bạn chọn: ");
            chon = new Scanner(System.in).nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    ql.khoiTaoNhanVienMacDinh();
                    break;
                case 2:
                    ql.themNhanVienMoi();
                    break;
                case 3:
                    ql.hienThiDanhSach();
                    break;
                case 4:
                    ql.tinhTongLuong();
                    break;
                case 5:
                    ql.timLuongCaoNhat();
                    break;
                case 6:

                    break;
                case 7:
                    ql.sapXepTheoTen();
                    break;
                case 8:
                    ql.sapXepTheoLuongGiamDan();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (chon != 0);
    }
}
