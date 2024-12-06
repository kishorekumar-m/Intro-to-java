class S23Ultra
{
    int cam = 200;
    int batt = 4700;
    void camera()
    {
        System.out.println("Camera : "+cam);
    }
    void battery()
    {
        System.out.println("Battery: "+batt);
    }
}
class S24Ultra extends S23Ultra
{
    void ai()
    {
        System.out.println("AI Features Added");
    }
}
public class samsung
{
    public static void main(String[] args)
    {
        S24Ultra p1 = new S24Ultra();
        p1.camera();
        p1.battery();
        p1.ai();
        System.out.println("S23Ultra");
        S23Ultra p2 = new S23Ultra();
        p2.battery();
    }
}