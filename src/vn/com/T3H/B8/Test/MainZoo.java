package vn.com.T3H.B8.Test;

public class MainZoo
{
    public static void main(String[] args) {
        IZoo zoo = new ZooImplement();
        zoo.addAnimal(null);
        zoo.makeSounds();
        zoo.dissAllInfo();
    }
}
