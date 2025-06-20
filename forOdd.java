// counting the number of odd numbers from 1 to 10 (using for loop)

public class forOdd {
    public static void main(String args[])
    {
        int oddcount=0;
        for(int i=1;i<=10;i++)
        {
            //print only odd numbers

            if(i%2==1)
            {
                oddcount=oddcount+1;
            }
        }
        System.out.println("odd numbers:" +oddcount);
    }
}
