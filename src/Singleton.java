public class Singleton {
    private static Singleton single = null;
    public String s ;
    public static Singleton getInstance()
    {
        if(single == null)
        single = new Singleton();
        return single;

    }




    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.s="This is the first";
        s2.s="this is the second";
        System.out.println(s1.s);
        System.out.println(s2.s);
        //it should display This is the second twise because we have only one object
    }
}
