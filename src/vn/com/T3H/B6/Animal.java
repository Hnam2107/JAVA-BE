package vn.com.T3H.B6;

public class Animal
{
    public String tenDongVat;
    public String loai;
    public int soLuong;


    public void run()
    {
        System.out.println("Con " + tenDongVat + " đang chạy");
    }

    public void eat()
    {
        System.out.println("Con " + tenDongVat + " đang ăn");
    }
}
