package vn.com.T3H.B4;

import java.util.Scanner;

/**
 Bài 1: Xử lý chuỗi

 Mô tả bài toán:

 1. Đếm số lượng từng từ trong đoạn văn (không phân biệt hoa thường).

 2. Viết hoa chữ cái đầu trong mỗi từ.

 3. Xóa các nguyên âm trong câu.

 Đầu vào: Chuỗi văn bản sau:

 "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động."

 Các bài toán con cần thực hiện:

 a) Đếm số lượng từng từ.

 b) Viết hoa chữ cái đầu trong mỗi từ.

 c) Xóa các nguyên âm trong câu.
 */

public class Btvn1
{
    public static void main(String[] args)
    {
        String data = "Tôi học lập trình, học lập trình rất hay";
        String[] arrayData = data.split(" ");
        for (int i = 0; i < arrayData.length; i++)
        {
            String chuoiCanDem = arrayData[i];
            boolean chuoiDaDuocKiemTra = false;
            for (int j = 0; j < i; j++){
                String chuoiDaDuocDem = arrayData[j];
                if (chuoiCanDem.equalsIgnoreCase(chuoiDaDuocDem)){
                    chuoiDaDuocKiemTra = true;
                    break;
                }
            }

            int demSoLAnXuatHien =0;
            for ( int j=i; j<arrayData.length; j++){
                String chuoiCuaMang = arrayData[i];
                if (chuoiCanDem.equalsIgnoreCase(chuoiCuaMang)){
                    demSoLAnXuatHien++;
                }
            }
        }
    }

    public static String chuanHoaChuoi (String data, String cacKyTuDacBiet){
        for (int i=0; i < cacKyTuDacBiet.length(); i++){
            String kyTuDacBiet = cacKyTuDacBiet.substring(i);
            if (data.contains(kyTuDacBiet)){
                continue;
            }
        }
    }
}
