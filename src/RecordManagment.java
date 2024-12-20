import java.util.*;
import java.io.*;
public class RecordManagment{
    public static void main(String[] args) {
        File file = new File("record.txt");
        FileWriter writer=null;
        try{
            writer = new FileWriter(file,true);
            writer.append("this is a test");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    }

