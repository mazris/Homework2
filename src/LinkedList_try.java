import java.util.LinkedList;

public class LinkedList_try {
    public static void main(String[] args) {
        //LinkedList
        LinkedList<Object> Hospital= new LinkedList<Object>();
        Hospital.add("Flushing");
        Hospital.add(22);
        Hospital.add("Presbyterian");
        Hospital.add(23);
        System.out.println("---Displaying LinkedList---");
        System.out.println(Hospital);
        Hospital.addFirst("Mount Sinai");
        Hospital.addLast("NYC health");
        System.out.println("Displaying Hospital after addFirst and add Last");
        System.out.println(Hospital);
        Boolean b = Hospital.contains("Mount Sinai");
        if(b)System.out.println(" we have the hospital Mount Sinai in our linkedList");
        else System.out.println(" we don't have the hospital Mount Sinai in our linkedList");
        Object oF = Hospital.getFirst();
        Object oL = Hospital.getLast();
        System.out.println("First and Last element "+oF+"  , "+oL);
        System.out.println(" index of Mount Sinai is "+Hospital.indexOf("Mount Sinai"));
        // difference between offer and add is that offer returns a boolean false if it fails to insert the element on the queue and add will throw an exception
        Hospital.offer(24);
        Hospital.offerFirst("Long Island Hospital");
        Hospital.offerLast(25);
        System.out.println("---Using OfferFirst and OfferLast---");
        System.out.println(Hospital);
        Hospital.pollFirst();
        Hospital.pollLast();
        System.out.println("---Using pollFirst and PollLast---");
        System.out.println(Hospital);
    }
}
