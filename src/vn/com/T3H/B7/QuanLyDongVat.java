package vn.com.T3H.B7;

import java.util.Scanner;

public class QuanLyDongVat
{
    public static void main(String[] args)
    {
        Zoo zoo = new Zoo();
        ZooAdvanced zooAdvanced = new ZooAdvanced();

        // Tạo các đối tượng động vật (Dog, Cat, Bird).
        Dog dog = new Dog();
        dog.intputInfo();
        zoo.addAnimal(dog);

        Cat cat = new Cat();
        cat.intputInfo();
        zoo.addAnimal(cat);

        Bird bird = new Bird();
        bird.intputInfo();
        zoo.addAnimal(bird);

        // Hiển thị thông tin
        System.out.println("Hiển thị thông tin động vật: ");
        zoo.displayInfo();
        //phát ra âm thanh
        System.out.println("Âm thanh của các động vật");
        zoo.makeSounds();

        zooAdvanced.addAnimal();
        System.out.println("Danh sách động vật sau khi nhập");
        zooAdvanced.displayInfo();

        zooAdvanced.sapXepTuoiDongVat();
        System.out.println("Danh sách động vật sau khi sắp xếp: ");
        zooAdvanced.displayInfo();

        System.out.println("Âm thanh của các động vật");
        zooAdvanced.makeSounds();
    }
}
