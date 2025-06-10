import java.util.Scanner;
public class ternary {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value for num1:");
        int num1=scan.nextInt();
        System.out.println("Enter the value for num2:");
        int num2=scan.nextInt();
        System.out.print(num1>num2||num1<num2?"num1 is greater":"num2isgreater");

    }
}
