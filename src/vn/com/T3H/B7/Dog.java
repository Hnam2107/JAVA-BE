package vn.com.T3H.B7;

import java.util.Scanner;

public class Dog extends Animal
{
    private String breed; // Giống chó

    @Override
    public void intputInfo()
    {
        super.intputInfo();
        System.out.println(" Nhập Giống chó: ");
        this.breed = new Scanner(System.in).nextLine();
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println(" Giống chó: " + breed);
    }

    public void makeSound()
    {
        super.makeSound();
        System.out.println("Chó: Woof! Woof! Woof! Woof! Woof!" );

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
