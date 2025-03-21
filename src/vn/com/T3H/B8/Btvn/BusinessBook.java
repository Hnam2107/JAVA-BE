package vn.com.T3H.B8.Btvn;

import java.util.Scanner;

public class BusinessBook extends Book // Sách kinh doanh
{

    public BusinessBook() {

    }

    public BusinessBook(int id, String title, int year, String author, String businessField) {
        super(id, title, year, author);
        this.businessField = businessField;
    }

    private String businessField; // Lĩnh vực kinh doanh

    @Override
    public void intputInfo()
    {
        super.intputInfo();
        System.out.println("Nhập Lĩnh vực kinh doanh của sách: ");
        this.businessField = new Scanner(System.in).nextLine();
    }

    @Override
    public void dispalyInfo()
    {
        super.dispalyInfo();
        System.out.println("Lĩnh vực kinh doanh: " + businessField);
    }

    public String getBusinessField() {
        return businessField;
    }

    public void setBusinessField(String businessField) {
        this.businessField = businessField;
    }
}
