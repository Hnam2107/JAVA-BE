package vn.com.T3H.baiKiemTraModule1;

import java.util.Arrays;
import java.util.Scanner;

public class P4Cau1
{

    public static void main(String[] args)
    {
        System.out.println ("Nhập số lượng phần tử mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] arrayNumber = new int[n];
        for ( int i = 0; i < arrayNumber.length; i++ )
        {
            System.out.println ("Nhập số thứ: " + i + " = ");
            int number = new Scanner(System.in).nextInt();
            arrayNumber[i] = number;
        }

        //Hện mảng
        System.out.println ("Mảng số nguyên:   ");
        hienMang(arrayNumber);

        //Tìm giá trị lớn nhát
        int lonNhat = giaTriLonNhat(arrayNumber);
        System.out.println ("\n Giá trị lớn nhát là: " + lonNhat);

        //Tìm giá trị nhỏ nhất
        int nhoNhat = giaTriNhoNhat(arrayNumber);
        System.out.println ("Giá trị nhỏ nhất là: " + nhoNhat);

        //Tổng các giá trị trong mảng
        int tong = tongMang(arrayNumber);
        System.out.println ("Tổng các giá trị trong mảng là: " + tong);

        //Thêm 1 phần tử vào mảng với vị trí do người dùng nhập, nếu mảng không đủ ô nhớ sẽ tự động tăng thêm 100% ô nhớ hiện tại.
        arrayNumber = themPhanTu(arrayNumber, n);
        System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(arrayNumber));

        // Cho người dùng nhập vào 1 phần tử, xóa đi tất cả các phần tử đó trong mảng
        System.out.println ("Nhập phần tử cần xóa: ");
        int deleteArray = new Scanner(System.in).nextInt();
        arrayNumber = xoaPhanTu(arrayNumber,deleteArray);
        System.out.println ("Mảng sau khi xóa là: " + Arrays.toString(arrayNumber));

        //Tìm phần tử lớn thứ 3 trong mảng
        timGiaTriLonThu3(arrayNumber);
    }

    public static void hienMang(int[] arrayNumber)
    {
        for (int i = 0; i < arrayNumber.length; i++ )
        {
            int phanTuMang = arrayNumber[i];
            System.out.printf (" %5d", phanTuMang);
        }
    }

    public static int giaTriLonNhat (int[] arrayNumber)
    {
        int max = arrayNumber[0];
        for (int i = 1; i < arrayNumber.length; i++ )
        {
            if (arrayNumber[i] > max)
            {
                max = arrayNumber[i];
            }
        }
        return max;
    }

    public static int giaTriNhoNhat (int[] arrayNumber)
    {
        int min = arrayNumber[0];
        for (int i = 0; i < arrayNumber.length; i++ )
        {
            if (arrayNumber[i] < min)
            {
                min = arrayNumber[i];
            }
        }
        return min;
    }

    public static int tongMang (int[] arrayNumber)
    {
        int sum =0;
        for (int i = 0; i < arrayNumber.length; i++ )
        {
            sum += arrayNumber[i];
        }
        return sum;
    }

    public static int[] themPhanTu(int[] arrayNumber, int n )
    {
        System.out.println ("Nhập giá trị cần thêm vào mảng: ");
        int newValue = new Scanner(System.in).nextInt();
        System.out.println ("Nhập vị trí cần thêm ");
        int pos = new Scanner(System.in).nextInt();
        if ( pos < 0 || pos > n )
        {
            System.out.println ("Vị trí không hợp lệ!");
        }else
        {
            int[] newArrayNumber = new int[arrayNumber.length * 2];
            for (int i = 0; i < n; i++ )
            {
                newArrayNumber[i] = arrayNumber[i];
            }
            for (int i = n; i > pos; i--)
            {
                newArrayNumber[i] = newArrayNumber[i-1];
            }
            newArrayNumber[pos] = newValue;
            n++;
            arrayNumber = Arrays.copyOf(newArrayNumber, n);
        }
        return arrayNumber;
    }

    public static int[] xoaPhanTu(int[] arrayNumber, int deleteArray)
    {
        int[] tempArr = new int[arrayNumber.length];
        int newSize = 0;
        for (int num : arrayNumber)
        {
            if ( num != deleteArray )
            {
                tempArr[newSize++] = num;
            }
        }
        arrayNumber = Arrays.copyOf(tempArr, newSize);

        return arrayNumber;
    }

    public static void timGiaTriLonThu3 (int[] arrayNumber)
    {
        if ( arrayNumber.length < 3)
        {
            System.out.println ("Mảng không đủ phần tử để tìm phần tử lớn thứ 3!");
        }
        int max1=0, max2=0, max3=0;
        for (int i = 0; i < arrayNumber.length; i++ )
        {
            if ( arrayNumber[i] > max1)
            {
                max2 = max1;
                max1 = arrayNumber[i];
            }else if ( arrayNumber[i] > max2)
            {
                max3 = max2;
                max2 = arrayNumber[i];
            }else if ( arrayNumber[i] > max3)
            {
                max3 = arrayNumber[i];
            }
        }
        System.out.println ("Phần tử lớn thứ 3 trong mảng là:  " + max3);
    }
}
