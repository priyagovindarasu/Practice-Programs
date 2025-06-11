import java.util.ArrayList;

//wrapper class

public class wrapper {
    public static void main(String args[])throws Exception
    {
        int i=2;
        Integer i2 = i;  //Boxing
        Integer j1 = i;             //Auto boxing
        int j = j1.intValue();      //Unboxing
        int k = j1;

        ArrayList<Integer>values=new ArrayList<Integer>();  //only support Integer values
        values.add(5);               //Boxing the value using the Autoboxing concept
        values.add(7);               //Boxing the value using the Autoboxing concept
        System.out.println(j);       //printing the value of j (in j we using the intValue()
        System.out.print(values);

    }
}
