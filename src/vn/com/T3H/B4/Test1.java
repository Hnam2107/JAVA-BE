package vn.com.T3H.B4;

import java.util.Scanner;

public class Test1
{
    public static void main(String[] args)
    {
        // Nhập mảng
        System.out.println("Nhập vào n:  ");
        int n = new Scanner(System.in).nextInt();
        int[] arrayNumber = new int[n];
        for (int i = 0; i < arrayNumber.length; i++)
        {
            System.out.println("Nhập số thứ: " + i + " = ");
            int number = new Scanner(System.in).nextInt();
            arrayNumber[i] = number;
        }
        hienMang(arrayNumber);

        int tong = tinhTong(arrayNumber);
        System.out.println("\n Tổng các số: " + tong);
        int soLonNhat = timSoLonNhat(arrayNumber);
        System.out.println("Số lớn nhất: " + soLonNhat);
        int soNhoNhat = timSoNhoNhat(arrayNumber);
        System.out.println("Số nhỏ nhất: " + soNhoNhat);
    }

    //hiện
    public static void hienMang(int[] arrayNumber)
    {
        System.out.println("Số tự nhiên vừa nhập: ");
        for (int i = 0; i < arrayNumber.length; i++) {
            int phanTuCuaMang = arrayNumber[i];
            System.out.printf(" %5s", phanTuCuaMang);
        }
    }

    //Tổng
    public static int tinhTong(int[] arrayNumber){
        int tong = 0;
        for(int i = 0;i< arrayNumber.length;i++){
            // lấy ra giá trị phần tử có index thứ i của mảng
            int giaTriPhanTu = arrayNumber[i];
            // cộng giá trị đó vào tổng
            tong = tong + giaTriPhanTu;
        }
        return tong;
    }

    //Tìm số lớn nhất
    public static int timSoLonNhat(int[] arrayNumber){
        int soLonNhat = 0;
        for(int i = 0;i< arrayNumber.length;i++){
            // lấy ra giá trị phần tử thứ i của mảng
            int giaTriPhanTuThuI  = arrayNumber[i];
            // so sánh giá trị tại từng phần tử với giá trị lớn nhất
            if(giaTriPhanTuThuI > soLonNhat){
                // nếu giá trị tại phần tử đấy > phần tử max => gán nó làm giá trị max
                soLonNhat = giaTriPhanTuThuI;
            }
        }
        return soLonNhat;
    }

    //Tìm số nhỏ nhất
    public static int timSoNhoNhat(int[] arrayNumber){
        int soNhoNhat = arrayNumber[0];
        for(int i = 1;i< arrayNumber.length;i++){
            // lấy ra giá trị phần tử thứ i của mảng
            int giaTriPhanTuThuI  = arrayNumber[i];
            // so sánh giá trị tại từng phần tử với giá trị min
            if(giaTriPhanTuThuI < soNhoNhat){
                // nếu giá trị tại phần tử đấy < phần tử min => gán giaTriPhanTuThuI làm giá trị min cho soNhoNhat
                soNhoNhat = giaTriPhanTuThuI;
            }
        }
        return soNhoNhat;
    }
}
