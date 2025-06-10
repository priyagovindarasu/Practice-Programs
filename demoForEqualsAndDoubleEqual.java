class DemoForEqualsAndDoubleEquals{
    public static void main(String args[])
    {
        String f1=new String("apple");
        String f2=new String("apple");
        String a1="orange";
        String a2="orange";
        String a3="apple";
        String a4="apple";
        System.out.println(f1.equals(f2));
        System.out.print(a1==a2);
    }
}
