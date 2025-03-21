package vn.com.T3H.B8.Btvn;

import java.util.Scanner;

public class ScienceBook extends Book //Sách khoa học
{

    private String researchSubject; // Đối tượng nghiên cứu khoa học

    public ScienceBook() {
    }

    public ScienceBook(int id, String title, int year, String author, String researchSubject) {
        super(id, title, year, author);
        this.researchSubject = researchSubject;
    }

    @Override
    public void intputInfo()
    {
        super.intputInfo();
        System.out.println("Nhập Đối tượng nghiên cứu:  ");
        this.researchSubject = new Scanner(System.in).nextLine();
    }

    @Override
    public void dispalyInfo()
    {
        super.dispalyInfo();
        System.out.println("Đối tượng nghiên cứu khoa học: " + researchSubject);
    }

    public String getResearchSubject() {
        return researchSubject;
    }

    public void setResearchSubject(String researchSubject) {
        this.researchSubject = researchSubject;
    }
}
