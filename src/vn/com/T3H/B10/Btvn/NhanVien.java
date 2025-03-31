package vn.com.T3H.B10.Btvn;

import java.util.Scanner;

public abstract class NhanVien
{
    private String maNV;
    private String hoTen;
    private int tuoi;
    private double luongCoBan;

    public NhanVien(){

    }

    public NhanVien(String maNV, String hoTen, int tuoi, double luongCoBan)
    {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
    }

    public void nhapThongTin()
    {
        System.out.println("Nhập mã sinh viên: ");
        this.maNV = new Scanner(System.in).nextLine();
        System.out.println("Nhập họ và tên: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập tuổi: ");
        this.tuoi = new Scanner(System.in).nextInt();
        System.out.println("Nhập lương cơ bản: ");
        this.luongCoBan = new Scanner(System.in).nextDouble();
    }

    public void hienThongTin()
    {
        System.out.println("----Nhân Viên----");
        System.out.println("Mã nhân viên: " + maNV);
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Lương : " + tinhLuong());
    }

    public abstract double tinhLuong();

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
}
