// counting the number of even number from 1 to 10 using for loop

public class forEven {
    public static void main(String args[])
    {
        int evencount=0;
        for(int i=1;i<=20; i++)
        {
            //print only even numbers

            if(i%2==0)
            {
                evencount=evencount+1;
            }
        }
        System.out.println("even numbers:" + evencount);
    }

}
