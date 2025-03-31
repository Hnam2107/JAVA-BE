package vn.com.T3H.B10.Btvn;

import java.util.Scanner;

public class KySu extends NhanVien
{
    private String chuyenMon;

    public KySu(){

    }

    public KySu(String maNV, String hoTen, int tuoi, double luongCoBan, String chuyenMon)
    {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.chuyenMon = chuyenMon;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("Nhập chuyên môn: ");
        this.chuyenMon = new Scanner(System.in).nextLine();
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + 2000000;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
}
