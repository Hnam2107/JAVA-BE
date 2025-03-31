package vn.com.T3H.B10.Btvn;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien
{
    private int soNgayLamViec;

    public NhanVienVanPhong(){

    }

    public NhanVienVanPhong(String maNV, String hoTen, int tuoi, double luongCoBan, int soNgayLamViec)
    {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("Số ngày làm việc: ");
        this.soNgayLamViec = new Scanner(System.in).nextInt();
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soNgayLamViec * 10000;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }
}
