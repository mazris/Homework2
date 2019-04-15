public class Outer_Class {
    static int i=1;
    private static String s = "Sonia";
    static class StaticNestedClass
    {
        public void display()
        {
            System.out.println("Outer s "+s);
            System.out.println("Outer i "+i);
        }

    }

    public static void main(String[] args) {
        Outer_Class.StaticNestedClass o = new Outer_Class.StaticNestedClass();
        o.display();
    }

}
