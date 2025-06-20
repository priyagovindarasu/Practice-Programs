class vehicle
{
    int a=5;
    int b=5;
    String s="Car";

    int run()
    {
        System.out.println("This is a car");
        return a+b;
    }
}

public class jackAkkaEx
{
    public static void main(String[] args)
    {
        vehicle i=new vehicle();
        int c= i.run();
        System.out.println(c);

    }

}
