package vn.com.T3H.B4;

import java.util.Arrays;
import java.util.Scanner;

/**
 Bài 3: Xử lý mảng số nguyên

 Mô tả bài toán: Viết chương trình Java thực hiện các tác vụ:

 1. Nhập một mảng các số nguyên.

 2. Tính tổng các phần tử chẵn và tổng các phần tử lẻ trong mảng.

 3. Tìm và in ra các số nguyên tố có trong mảng.

 4. Sắp xếp mảng sao cho:

 o Các phần tử chẵn được sắp xếp theo thứ tự giảm dần.

 o Các phần tử lẻ được sắp xếp theo thứ tự tăng dần.

 5. Chia mảng thành 2 mảng con:

 o Mảng 1: Chứa tất cả các phần tử có giá trị nhỏ hơn hoặc bằng trung bình của mảng.

 o Mảng 2: Chứa tất cả các phần tử có giá trị lớn hơn trung bình của mảng.

 6. Tìm số lượng phần tử trùng lặp trong mảng và in ra các phần tử trùng lặp.

 7. Thêm một phần tử vào mảng tại vị trí chỉ định (index).

 8. Xoá một phần tử khỏi mảng.
 */
public class Btvn3
{
    public static void main (String[] args)
    {
        System.out.println ("Nhập mảng số nguyên: ");
        int n = new Scanner(System.in).nextInt();
        int[] arrayNumber = new int[n];
        for (int i=0; i<arrayNumber.length; i++)
        {
            System.out.println ("Nhập số thứ " + i + " = ");
            int number = new Scanner(System.in).nextInt();
            arrayNumber[i] = number;
        }

        System.out.println ("Mảng số nguyên : ");
        hienMang(arrayNumber);

        int tongC = tongChan(arrayNumber);
        System.out.println ("\n Tổng số chẵn trong mảng là: " + tongC);

        int tongL = tongLe(arrayNumber);
        System.out.println ("\n Tổng số lẻ trong mảng là: " + tongL);

        System.out.println ("Các số nguyên tố trong mảng: ");
        for (int number : arrayNumber)
        {
            if (timSoNguyenTo(number))
            {
                System.out.printf (" %5d ", number);
            }
        }

        chanGiamDan(arrayNumber);
        hienMangChan(arrayNumber);

        leTangDan(arrayNumber);
        hienMangLe(arrayNumber);

        System.out.println ("\n Mảng 1: ");
        giaTriNhoBang(arrayNumber);

        System.out.println ("\n Mảng 2: ");
        giaTriLonBang(arrayNumber);

        soLuongTrunglap(arrayNumber);

        arrayNumber = themPhanTu(arrayNumber,n);
        System.out.println ("Mảng sau khi thêm phần tử là: " + Arrays.toString(arrayNumber));

        System.out.println("Nhập phần tử cần xóa: ");
        int deleteArrayNumbers = new Scanner(System.in).nextInt();
        arrayNumber = xoaPhanTu(arrayNumber,deleteArrayNumbers);
        System.out.println("Mảng sau khi xóa phần tử là: " + Arrays.toString(arrayNumber));
    }

    //hiện mảng số nguyên
    public static void hienMang(int[] arrayNumber)
    {
        for (int i=0; i<arrayNumber.length; i++)
        {
            int phanTuMang = arrayNumber[i];
            System.out.printf (" %5s ", phanTuMang);
        }
    }

    //Tính tổng các phần tử chẵn và phần tử lẻ trong mảng
    public static int tongChan(int[] arrayNumber)
    {
        int sum=0;
        for (int i=0; i<arrayNumber.length; i++ )
        {
            if (arrayNumber[i] % 2 == 0)
            {
                sum += arrayNumber[i];
            }
        }
        return sum;
    }

    public static int tongLe(int[] arrayNumber)
    {
        int sum=0;
        for (int i=0; i<arrayNumber.length; i++ )
        {
            if ( arrayNumber[i] % 2 != 0)
            {
                sum += arrayNumber[i];
            }
        }
        return sum;
    }

    //Tìm và in ra các số nguyên tố trong mảng
    public static boolean timSoNguyenTo (int number)
    {
        if (number < 2)
        {
            return false;
        }
        for (int i=2; i<=Math.sqrt(number); i++ )
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    //Các phần tử chẵn được sắp xếp theo thứ tự giảm dần.
    public static void chanGiamDan (int[] arrayNumber)
    {
        int i, j, hoanDoi;
        System.out.println ("\n Chẵn : ");
        for ( i=0; i<arrayNumber.length - 1; i++){
            for ( j=i+1; j<arrayNumber.length; j++){
                if (arrayNumber[i] < arrayNumber[j] && arrayNumber[i] % 2 == 0 && arrayNumber[j] % 2 == 0)
                {
                    hoanDoi = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[j];
                    arrayNumber[j] = hoanDoi;
                }
            }
        }
    }

    public static void hienMangChan (int[] arrayNumber)
    {
        for (int i=0; i<arrayNumber.length; i++)
        {
            if (arrayNumber[i] % 2 == 0) {
                int phanTuMang = arrayNumber[i];
                System.out.printf(" %5s ", phanTuMang);
            }
        }
    }

    //Các phần tử lẻ được sắp xếp theo thứ tự tăng dần.
    public static void leTangDan (int[] arrayNumber)
    {
        int i, j, hoanDoi;
        System.out.println ("\n Lẻ : ");
        for ( i=0; i<arrayNumber.length - 1; i++){
            for ( j=i+1; j<arrayNumber.length; j++){
                if (arrayNumber[i] > arrayNumber[j] && arrayNumber[i] % 2 != 0 && arrayNumber[j] % 2 != 0)
                {
                    hoanDoi = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[j];
                    arrayNumber[j] = hoanDoi;
                }
            }
        }
    }

    public static void hienMangLe (int[] arrayNumber)
    {
        for (int i=0; i<arrayNumber.length; i++)
        {
            if (arrayNumber[i] % 2 != 0) {
                int phanTuMang = arrayNumber[i];
                System.out.printf(" %5s ", phanTuMang);
            }
        }
    }

    //Chia mảng thành 2 mảng con
    public static int trungBinhMang (int[] arrayNumber)
    {
        int sum = 0;
        for (int i=0; i<arrayNumber.length; i++)
        {
            sum += arrayNumber[i];
        }
        double tb = sum / arrayNumber.length;
        return (int) tb;
    }
    //Mảng 1: Chứa tất cả các phần tử có giá trị nhỏ hơn hoặc bằng trung bình của mảng.
    public static void giaTriNhoBang (int[] arrayNumber)
    {
        int trungBinh  = trungBinhMang(arrayNumber);
        for (int i=0; i<arrayNumber.length; i++)
        {
            if ( arrayNumber[i] <= trungBinh )
            {
                int phanTuMang = arrayNumber[i];
                System.out.printf(" %5s ", phanTuMang);
            }
        }
    }
    //Mảng 2: Chứa tất cả các phần tử có giá trị lớn hơn trung bình của mảng.
    public static void giaTriLonBang (int[] arrayNumber)
    {
        int trungBinh  = trungBinhMang(arrayNumber);
        for (int i=0; i<arrayNumber.length; i++)
        {
            if ( arrayNumber[i] > trungBinh )
            {
                int phanTuMang = arrayNumber[i];
                System.out.printf(" %5s ", phanTuMang);
            }
        }
    }

    //Tìm số lượng phần tử trùng lặp trong mảng và in ra các phần tử trùng lặp.
    public static void soLuongTrunglap (int[] arrayNumber)
    {
        int cout = 0;
        int i, j;
        for (i=0; i<arrayNumber.length; i++){
            for ( j=i+1; j<arrayNumber.length; j++){
                if (arrayNumber[i] == arrayNumber[j])
                {
                    cout++;
                    System.out.println ("\n" + arrayNumber[j] + " trùng lặp.");
                }
            }
        }
        System.out.println ("\n Số lượng phần tử trùng lặp trùng lặp: " + cout);
    }

    //Thêm một phần tử vào mảng tại vị trí chỉ định .
    public static int[] themPhanTu (int[] arrayNumber, int n)
    {
        System.out.println ("Nhập vị trí để thêm phần tử : ");
        int pos = new Scanner(System.in).nextInt();
        System.out.println ("Nhập phần tử cần chèn: " );
        int value = new Scanner(System.in).nextInt();

        int[] newArrayNumber = new int[arrayNumber.length + 1];
        for (int i=0; i<n; i++)
        {
            newArrayNumber[i] = arrayNumber[i];
        }
        for (int i=n; i>pos; i--)
        {
            newArrayNumber[i] = arrayNumber[i-1];
        }
        newArrayNumber[pos] = value;
        n++;
        arrayNumber = Arrays.copyOf(newArrayNumber, n);

        return arrayNumber;
    }

    //Xóa phần tử khỏi mảng
    public static int[] xoaPhanTu(int[] arrayNumber, int deleteArrayNumbers)
    {
        int[] tempArrayNumber = new int[arrayNumber.length];
        int newSize = 0;
        for (int num : arrayNumber)
        {
            if (num != deleteArrayNumbers)
            {
                tempArrayNumber[newSize++] = num;
            }
        }
        arrayNumber = Arrays.copyOf(tempArrayNumber, newSize);

        return arrayNumber;
    }
}
