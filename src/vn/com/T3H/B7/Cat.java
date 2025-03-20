package vn.com.T3H.B7;

import java.util.Scanner;

public class Cat extends Animal
{
    private String breed; // Giống mèo

    @Override
    public void intputInfo()
    {
        super.intputInfo();
        System.out.println(" Nhập Giống mèo: ");
        this.breed = new Scanner(System.in).nextLine();
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println(" Giống mèo: " + breed);
    }

    public void makeSound()
    {
        super.makeSound();
        System.out.println("Mèo: Meow! Meow! Meow! Meow! Meow! Meow!" );
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
