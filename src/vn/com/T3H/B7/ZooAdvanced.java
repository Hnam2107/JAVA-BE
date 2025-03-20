package vn.com.T3H.B7;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooAdvanced extends Zoo
{
     public void addAnimal()
     {
         System.out.println("Nhập số lượng động vật muốn thêm: ");
         int n = new Scanner(System.in).nextInt();
         for (int i = 0; i < n; i++)
         {
             System.out.println("Chọn động vật muốn thêm");
             System.out.println("1. Dog");
             System.out.println("2. Cat");
             System.out.println("3. Bird");
             int chon = new Scanner(System.in).nextInt();
             Animal animal = null;
             switch (chon)
             {
                 case 1:
                     animal = new Dog();
                     break;
                 case 2:
                     animal = new Cat();
                     break;
                 case 3:
                     animal = new Bird();
                     break;
                 default:
                     System.out.println("Lựa chọn không hợp lệ!");
                     i--;
                     continue;
             }
             animal.intputInfo();
             addAnimal(animal);
         }
     }

     public void sapXepTuoiDongVat()
     {
         int n = animals.size();
         for (int i = 0; i < n-1; i++){
             for (int j = 0; j < n-i-1; j++){
                 if (animals.get(j).getAge() > animals.get(j+1).getAge())
                 {
                     Animal temp = animals.get(j);
                     animals.set(j, animals.get(j+1));
                     animals.set(j+1, temp);
                 }
             }
         }
     }

    @Override
    public void makeSounds() {
        super.makeSounds();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
