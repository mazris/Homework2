import javax.print.Doc;
import java.util.ArrayList;
import java.util.LinkedList;

public class Array_Try {
    public static void main(String[] args) {
        //Array
        String[] name = new String[4];

        name[0] = "Sonia"; name[1] = "Rosh"; name[2] = "Nesrine"; name[3] = "Nihad";
        System.out.println("---Displaying Array---");
        for(int i = 0; i< name.length;i++)
        {
            System.out.println(name[i]);
        }
        name[0]="Amine";
        //Array 2D
        int number[][] = {{10,12,13},{0,2,4},{1,3,5}};
        System.out.println("---Displaying Array 2D---");
        //this is the inner for loop
        for(int i =0; i < 3 ; i++)
        {
            for(int j =0; j<3 ; j++)
            {
                System.out.print(number[i][j]+" - ");
            }
            System.out.println(" ");
        }








    }
}
