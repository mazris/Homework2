public class Outer {
    private int i = 2;
    public String s = "Sonia";
    public final double d = 2.5;
    public void display()
    {
        System.out.println("Outer display");
        System.out.println("i is "+this.i);
        System.out.println("s is "+this.s);
    }

    class inner{
        public void display()
        {   System.out.println("Inner display");
            System.out.println("i is "+i);
            System.out.println("s is "+s);

        }

    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.inner i = o.new inner();
       o.display();
       i.display();
    }

}
