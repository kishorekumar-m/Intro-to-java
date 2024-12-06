class VegRice
{
    void veg()
    {
        System.out.println("Vegatables added");
    }
    void vegFriedRice()
    {
        veg();
        System.out.println("Veg Fried Rice");
    }
}
class EggRice extends VegRice
{
    void egg()
    {
        System.out.println("Egg added");
    }
    void eggFriedRice()
    {
        veg();
        egg();
        System.out.println("Egg Fried Rice");
    }
}

class NonVegRice extends EggRice
{
    void chicken()
    {
        System.out.println("Chicken Added");
    }
    void prawn()
    {
        System.out.println("Prawn Added");
    }
    void chickenFriedRice()
    {
        veg();
        egg();
        chicken();
        System.out.println("Chicken Fried Rice");
    }

    void  prawnFriedRice()
    {

        prawn();
        veg();
        egg();
        System.out.println("Prawn Fried Rice");
    }
}
public class FriedRice {
    public static void main(String args[])
    {
        NonVegRice r1 = new NonVegRice();
        System.out.println("\nOrdering Prawn Fried Rice");
        r1.prawnFriedRice();
        System.out.println("\nOrdering Chicken Fried Rice");
        r1.chickenFriedRice();

        EggRice r2 = new EggRice();

        System.out.println("\nOrdering Egg Fried Rice");
        r2.eggFriedRice();

    }
    
}
