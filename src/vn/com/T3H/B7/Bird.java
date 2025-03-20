package vn.com.T3H.B7;

import java.util.Scanner;

public class Bird extends Animal
{
    private String WingSpan; // Sải cánh

    @Override
    public void intputInfo()
    {
        super.intputInfo();
        System.out.println(" Nhập Sải cánh: ");
        this.WingSpan = new Scanner(System.in).nextLine();
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println(" Sải cánh: " + WingSpan);
    }

    public void makeSound()
    {
        super.makeSound();
        System.out.println("Chim: Tweet! Tweet! Tweet! Tweet! Tweet!" );
    }

    public void fly()
    {
        System.out.println( getName() + " đang bay trên bầu trời!");
    }
    public String getWingSpan() {
        return WingSpan;
    }

    public void setWingSpan(String wingSpan) {
        this.WingSpan = wingSpan;
    }
}
