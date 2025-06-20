class GrandFather
{
    int a=20;
    void grandfather()
    {
        System.out.println("Grand Father");
    }
}

class Father extends GrandFather{
    int b=10;
    void father()
    {
        System.out.println("Father");
    }
}

class Me extends Father{
    void me()
    {
        System.out.println("My Method");
    }
}


public class InheritanceExample
{
    public static void main(String args[])
    {
        Me m=new Me();
        m.me();
        m.father();
        m.grandfather();
    }
}
