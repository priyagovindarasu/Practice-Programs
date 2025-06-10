import java.util.Scanner;
public class colorComparision{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String color=scan.nextLine();
        if(color.equals("Red"))
        {
            System.out.print("Stop");
        }
        else if(color.equals("Yellow"))
        {
            System.out.print("Get Ready");
        }
        else{
            System.out.print("Go");
        }

    }
}
