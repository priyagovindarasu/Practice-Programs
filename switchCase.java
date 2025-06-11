// Java program demonstrates how to use switch-case
public class switchCase {
    public static void main(String args[]){
        int day=6;
        switch (day)        //switch (expression)
                            //if day(given expression) matches with anyone of the given cases ,then printing the given statement
        {
            //case
            case 1:
                System.out.println("Monday");
                break;

            //case
            case 2:
                System.out.println("Tuesday");
                break;

            //case
            case 3:
                System.out.println("Wednesday");
                break;

            //case
            case 4:
                System.out.println("Thursday");
                break;

            //case
            case 5:
                System.out.println("Friday");
                break;

            //case
            case 6:
                System.out.println("Saturday");
                break;

            //case
            case 7:
                System.out.println("Sunday");
                 break;

            //default case statement
            default:
                System.out.println("Invalid Day");   //if no one(case) is matching with the above cases then the default value is printed

        }
    }
}
