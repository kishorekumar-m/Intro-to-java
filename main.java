class Biriyani 
{
    void rice()
    {
        System.out.println("Rice is the Main ingredient added");
    }
    void spices()
    {
        System.out.println("Spices are added to enchace the taste");
    }
    void veg()
    {
        System.out.println("Tomato and Onion added");
    }
}
class ChickenBiriyani extends Biriyani
{
    void Chicken()
    {
        System.out.println("Chicken is added to enhance the taste");
    }
}
class MuttonBiriyani extends Biriyani
{
    void mutton()
    {
        System.out.println("Mutton is added to the Taste");
    }
}
class FishBiriyani extends Biriyani
{
    void fish()
    {
        System.out.println("Fish is added to enhance the tatse");
    }
}
public class main {
public static void main(String args[])
{
    System.out.println("Making Chicken Biriyani");
    ChickenBiriyani cb = new ChickenBiriyani();
    cb.rice();
    cb.spices();
    cb.veg();
    cb.Chicken();

    System.out.println("Making Mutton Biriyani");
    MuttonBiriyani mb = new MuttonBiriyani();
    mb.rice();
    mb.spices();
    mb.veg();
    mb.mutton();

}
}