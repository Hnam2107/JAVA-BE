package vn.com.T3H.B6;

public class Dongvat
{
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        for (int i = 0; i < 10; i++)
        {
            Animal animal = new Animal();
            animal.tenDongVat="Ten" + i;
            animal.loai="Loai" + i;
            animal.soLuong= + i;
            animal.run();
            animal.eat();
            animals[10]=animal;
        }
    }
}
