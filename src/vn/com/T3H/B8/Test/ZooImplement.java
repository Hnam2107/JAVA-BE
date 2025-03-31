package vn.com.T3H.B8.Test;

public class ZooImplement implements IZoo
{
    @Override
    public void addAnimal (Animal animal)
    {
        System.out.println("Adding animal " );
    }
    @Override
    public void makeSounds ()
    {
        System.out.println("Making Sounds ");
    }
    public void dissAllInfo()
    {
        System.out.println("Dissing all info");
    }
}
