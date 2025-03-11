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

public class Btvn1 {
    public static void main(String[] args)
    {
        System.out.println ("Nhập chuỗi: ");
        String data = new Scanner(System.in).nextLine();
        String[] dsKyTuDacBiet = {"\\.",":","!","-",","};
        data = chuanHoaChuoi(data, dsKyTuDacBiet);
        String[] arrayData = data.split(" ");
        for (int i = 0; i < arrayData.length; i++)
        {
            String chuoiCanDem = arrayData[i];
            boolean chuoiDaDuocKiemTra = false;
            for (int j = 0; j < i; j++)
            {
                String chuoiDaDem = arrayData[j];
                if (chuoiCanDem.equalsIgnoreCase(chuoiDaDem))
                {
                    chuoiDaDuocKiemTra = true;
                    break;
                }
            }
            if (chuoiDaDuocKiemTra){
                continue;
            }

            int cout =0;
            for (int j=i; j<arrayData.length; j++)
            {
                String chuoiCuaMang = arrayData[j];
                if (chuoiCanDem.equalsIgnoreCase(chuoiCuaMang))
                {
                    cout++;
                }
            }
            System.out.println("Chuỗi |" + chuoiCanDem + "| xuất hiện: |" + cout);
        }

        System.out.println(vietHoa(data));

        System.out.println(vietHoa(xoaNguyenAm(data)));
    }

    public static String chuanHoaChuoi (String data, String[] dsKyTuDacBiet)
    {
        for (int i=0; i < dsKyTuDacBiet.length; i++)
        {
            String kyTuDacBiet = dsKyTuDacBiet[i];
            if (!data.contains(kyTuDacBiet))
            {
                continue;
            }
            data = data.replaceAll(kyTuDacBiet, "");
        }
        return data;
    }

    public static String vietHoa (String data) {
        char[] chars = data.toCharArray();
        boolean vietHoa = true;
        for (int i = 0; i < chars.length; i++)
        {
            if (vietHoa && Character.isLetter(chars[i]))
            {
                chars[i] = Character.toUpperCase(chars[i]);
                vietHoa = false;
            } else if (chars[i] == ' ') {
                vietHoa = true;
            }
        }
        return new String(chars);
    }

    public static String xoaNguyenAm (String data)
    {
        char[] nguyenam = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',
                'à', 'á', 'ạ', 'ả', 'ã', 'ă', 'ắ', 'ằ', 'ặ', 'ẳ', 'ẵ',
                'â', 'ấ', 'ầ', 'ậ', 'ẩ', 'ẫ', 'è', 'é', 'ẹ', 'ẻ', 'ẽ',
                'ê', 'ế', 'ề', 'ệ', 'ể', 'ễ', 'ì', 'í', 'ị', 'ỉ', 'ĩ',
                'ò', 'ó', 'ọ', 'ỏ', 'õ', 'ô', 'ố', 'ồ', 'ộ', 'ổ', 'ỗ',
                'ơ', 'ớ', 'ờ', 'ợ', 'ở', 'ỡ', 'ù', 'ú', 'ụ', 'ủ', 'ũ',
                'ư', 'ứ', 'ừ', 'ự', 'ử', 'ữ'};
        char[] chars = data.toCharArray();
        String ketqua = " ";
        for (char c : chars)
        {
            boolean laNguyenAm = false;
            for (char ng : nguyenam)
            {
                if (c == ng)
                {
                    laNguyenAm = true;
                    break;
                }
            }

            if (!laNguyenAm)
            {
                ketqua += c;
            }
        }
        return ketqua;
    }
}

