import java.util.Scanner;
public class income {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int income=scan.nextInt();
        if(income>6999)
        {
            System.out.print("Scholorship is available");
        }
        else{
            System.out.print("Not eligible for schlorship");
        }
    }

}
