package vn.com.T3H.B10.Btvn;

import vn.com.T3H.B9.Btvn.CourseAlreadyRegisteredException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyImpl implements IQuanLy {
    ArrayList<NhanVien> danhsachnhanvien = new ArrayList<>();

    @Override
    public void khoiTaoNhanVienMacDinh() {
        danhsachnhanvien.add(new NhanVienVanPhong("NV001", "Nguyen Van A", 30, 5000000, 20));
        danhsachnhanvien.add(new QuanLy("QL003", "Le Quang C", 35, 10000000, 1.5));
        danhsachnhanvien.add(new KySu("KS002", "Tran Thi B", 28, 7000000, "CNTT"));
    }

    @Override
    public void themNhanVienMoi() {
        System.out.println("Nhập số nhân viên muốn thêm: ");
        int n = new Scanner(System.in).nextInt();
        NhanVien nhanvien = null;
            for (int i = 0; i < n; i++) {
                System.out.println("Chọn bộ phận: ");
                System.out.println("1. Nhân viên văn phòng.");
                System.out.println("2. Kỹ sư.");
                System.out.println("3. Quản lý.");
                int chon = new Scanner(System.in).nextInt();
                if (chon == 1) {
                    nhanvien = new NhanVienVanPhong();
                } else if (chon == 2) {
                    nhanvien = new KySu();
                } else if (chon == 3) {
                    nhanvien = new QuanLy();
                }
            }
            for (NhanVien nv : danhsachnhanvien) {
                if ( nv.getMaNV().equals(nhanvien.getMaNV()) ) {
                    try{
                        throw new EmployeeException("Lõi: Mã nhân viên đã tồn tại!");
                    }catch (EmployeeException e){
                        System.out.println(e.getMessage());
                        return;
                    }
                }
            }
            nhanvien.nhapThongTin();
            danhsachnhanvien.add(nhanvien);
        }


        @Override
        public void hienThiDanhSach ()
        {
            for (NhanVien nv : danhsachnhanvien) {
                nv.hienThongTin();
            }
        }

        @Override
        public double tinhTongLuong ()
        {
        /*
        System.out.println("Tổng lương: ");
            return danhsachnhanvien.stream().mapToDouble(NhanVien::tinhLuong).sum();
         */
            double sum =0;
            for ( NhanVien nv : danhsachnhanvien )
            {
                sum = sum + nv.tinhLuong();
            }
            System.out.println("Tổng lương : " + sum);
            return sum;
        }

        @Override
        public void timLuongCaoNhat ()
        {
        /*
        danhsachnhanvien.stream().max(Comparator.comparingDouble(NhanVien::tinhLuong)).ifPresent(NhanVien::hienThongTin);
         */
            double max =0;
            for ( NhanVien nv : danhsachnhanvien )
            {
                if (nv.tinhLuong() > max)
                {
                    max = nv.tinhLuong();
                }
                nv.hienThongTin();
            }
            danhsachnhanvien.stream().max(Comparator.comparingDouble(NhanVien::tinhLuong)).ifPresent(NhanVien::hienThongTin);
        }

        @Override
        public void timNhanVienTheoMaNhanVien (String maNV){
            System.out.println("Nhập mã nhân viên cần tìm: ");
            maNV = new Scanner(System.in).nextLine();
            for (NhanVien nv : danhsachnhanvien) {
                if (nv.getMaNV().equals(maNV)) {
                    nv.hienThongTin();
                }
            }
        }

        @Override
        public void sapXepTheoTen () {
            danhsachnhanvien.sort(Comparator.comparing(nv -> nv.getHoTen()));
        }

        @Override
        public void sapXepTheoLuongGiamDan () {
        danhsachnhanvien.sort((o1, o2) -> Double.compare(o1.tinhLuong(), o2.tinhLuong()));
        }
    }
