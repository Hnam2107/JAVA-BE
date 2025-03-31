package vn.com.T3H.B10.Btvn;

import java.util.Scanner;

public class QuanLy extends NhanVien
{
    private double heSoChucVu;

    public QuanLy(){

    }

    public QuanLy(String maNV, String hoTen, int tuoi, double luongCoBan, double heSoChucVu)
    {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.heSoChucVu = heSoChucVu;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("Nhập hệ số chức vụ: ");
        this.heSoChucVu = new Scanner(System.in).nextDouble();
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() * heSoChucVu;
    }

    public double getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(double heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }
}
