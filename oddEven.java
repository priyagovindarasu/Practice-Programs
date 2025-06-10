import java.util.Scanner;
public class oddEven {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        if(number%2==0)
        {
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}
