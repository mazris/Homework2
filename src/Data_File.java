import java.io.*;

public class Data_File {
    public static void Read_File(String path)
    {
       String a ;
       String text = null;
        FileReader file_Reader = null;
        try {
            file_Reader = new FileReader(path);
            BufferedReader buffered = new BufferedReader(file_Reader);
            while((a=buffered.readLine())!=null)
            {
                text=a;
            }
            System.out.println(text);
            buffered.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }


    }
    public static void WriteFile(String path , String text)
    {
        try {
            FileWriter file_Writer = new FileWriter(path , true);
            BufferedWriter buffered  = new BufferedWriter(file_Writer );
            buffered.write(text);
            buffered.close();
            Read_File(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
                   Read_File("src/FileToRead.txt");
                   WriteFile("src/FileToWrite.txt","we are writing into this file using java");
    }


}
