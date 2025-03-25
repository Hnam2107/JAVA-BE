package vn.com.T3H.B9.Btvn;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Student
{
    private int id;
    private String tenHS;
    private String[] khoaHoc;
    private int soKhoaHoc;
    private static String[] danhSachMonHocDangKy = {"Math", "English", "History", "Science"};

    public Student()
    {
        this.khoaHoc = new String[10];
        this.soKhoaHoc = 0;
    }

    public void nhapThongTinHocVien()
    {
        System.out.println("Nhập mã học viên: ");
        this.id = nhapID(id);
        System.out.println("Nhập tên học viên: ");
        this.tenHS = new Scanner(System.in).nextLine();
    }

    public void hienThongTinHocVien()
    {
        System.out.println("ID: " + id);
        System.out.println("Tên học viên: " + tenHS);
        System.out.println("Môn học đăng ký: " + Arrays.toString(dsMonHocHocVienDangKy()));
    }

    public void dangKyKhoaHoc(String tenKhoaHoc) throws CourseAlreadyRegisteredException, IllegalArgumentException
    {
        kiemTraMonHoc(tenKhoaHoc);
        kiemTraDangKy(tenKhoaHoc);
        if (soKhoaHoc == khoaHoc.length)
        {
            khoaHoc = Arrays.copyOf(khoaHoc, khoaHoc.length * 2);
        }
        khoaHoc[soKhoaHoc++] = tenKhoaHoc;
    }

    private static void kiemTraMonHoc(String tenKhoaHoc) throws IllegalArgumentException {
        for (String khoaHoc : danhSachMonHocDangKy)
        {
            if (khoaHoc.equals(tenKhoaHoc))
            {
                return;
            }
        }
        throw new IllegalArgumentException(tenKhoaHoc, "Môn học " + tenKhoaHoc + " đăng ký không hợp lệ ");
    }

    private void kiemTraDangKy(String tenKhoaHoc) throws CourseAlreadyRegisteredException {
        for (int i = 0; i < soKhoaHoc; i++)
        {
            if (this.khoaHoc[i].equals(tenKhoaHoc))
            {
                throw new CourseAlreadyRegisteredException(tenKhoaHoc, "Học viên đã đăng ký môn này!");
            }
        }
    }

    public String[] dsMonHocHocVienDangKy()
    {
        return Arrays.copyOfRange(khoaHoc, 0, soKhoaHoc);
    }

    private static int nhapID(int id)
    {
        while(true)
        {
            try
            {
                 id = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e)
            {
                System.out.println("Vui lòng nhập lại mã học viên!");
            }
        }
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String[] getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String[] khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public int getSoKhoaHoc() {
        return soKhoaHoc;
    }

    public void setSoKhoaHoc(int soKhoaHoc) {
        this.soKhoaHoc = soKhoaHoc;
    }
}
