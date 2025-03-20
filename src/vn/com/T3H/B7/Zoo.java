package vn.com.T3H.B7;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo
{
   ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal)
    {
        animals.add(animal);
    }


    public void displayInfo()
    {
        for (Animal animal : animals)
        {
            animal.displayInfo();
            System.out.println("-------------");
        }
    }

    public void makeSounds()
    {
        for(Animal animal : animals)
        {
            animal.makeSound(); 
        }
    }
}
