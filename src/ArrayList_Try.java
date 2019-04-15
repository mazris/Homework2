import java.util.ArrayList;

public class ArrayList_Try {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> Doctors = new ArrayList<String>();
        Doctors.add("Sonia");
        Doctors.add("Nihad");
        Doctors.add("Mounia");

        String bestDoctor = Doctors.get(1);
        System.out.println("---Displaying ArrayList---");
        System.out.println(Doctors);
        System.out.println("Best doctor is "+bestDoctor);
        Doctors.remove(0);
        System.out.println(Doctors);
        Doctors.clear();
        System.out.println(Doctors);
    }
}
