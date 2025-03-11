package vn.com.T3H.B4;

import java.util.Scanner;

/**
 Bài 2: Kiểm tra số điện thoại

 Mô tả bài toán: Viết hàm kiểm tra một chuỗi nhập vào có phải là số điện thoại hợp lệ hay không?

 Điều kiện:

 · Số điện thoại có 9 chữ số (không bao gồm số 0 ở đầu).

 · Có thể có ký tự như "-" hoặc ".".

 · Các dạng hợp lệ:

 o +84xxxxxxxxx

 o 0xxxxxxxxx

 o 84xxxxxxxxx

 o 0xxx.xxx.xxx

 o 0xxx-xxx-xx
 */
public class Btvn2
{
    public static void main(String[] args) {
        System.out.println("Nhập số điện thoai kiểm tra: ");
        String soDienThoai = new Scanner(System.in).nextLine();
        kiemTraSDT(soDienThoai);
    }

     public static void kiemTraSDT (String soDienThoai)
     {
         System.out.println ("Bắt đầu kiểm tra SDT: " + soDienThoai);
         String[] dsKyTuDacBiet = {"+84","0","84"};
         boolean kyTuBatDauHopLe = false;
         String kyTuBatDauCuaSdt = "";
         for (int i = 0; i< dsKyTuDacBiet.length; i++)
         {
             String kyTuBatDau = dsKyTuDacBiet[i];
             if (soDienThoai.startsWith(kyTuBatDau))
             {
                 kyTuBatDauHopLe = true;
                 kyTuBatDauCuaSdt = kyTuBatDau;
                 break;
             }
         }

         if (!kyTuBatDauHopLe){
             System.out.println ("Số điện thoại không hợp lệ!");
             return;
         }

         soDienThoai = soDienThoai.replaceAll("-","").replaceAll("\\.","");
         soDienThoai = soDienThoai.substring(kyTuBatDauCuaSdt.length(),soDienThoai.length());
         if (soDienThoai.length() != 9)
         {
             System.out.println ("Số điện thoại phải có 9 chữ số. ");
             return;
         }
         for (int i=0; i < soDienThoai.length(); i++)
         {
             char data = soDienThoai.charAt(i);
             try {
                 Integer.parseInt(String.valueOf(data));
             }catch (NumberFormatException e){
                 System.out.println ("Tồn Tại 1 ký tự không phải là số!");
                 return;
             }
         }
         System.out.println("Số điện thoại hợp lệ");
         return;
     }
}
