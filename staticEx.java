class human{
    static String a="finzly";
     String name;
     int g;
    void test()
    {
        System.out.println("The company is "+ human.a);
    }
    human(String name,int g)
    {
        this.name= name;
        this.g=g;

    }
}


public class staticEx {
    public static void main(String[] args) {
        human h=new human("priya",12);
        human i=new human("Indhu",23);
        System.out.println(h.a);
        //System.out.println(h.b);
        //human.a="Google";
        h.test();
    }
}
