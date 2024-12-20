import java.util.*;
import java.io.*;
public class RecoordManagment {

    public void WriteData(String fileName,String data) throws IOException {
        Scanner reader = new Scanner(System.in);
        FileWriter write = null;
        File file = new File(fileName);
        try {
            write = new FileWriter(fileName + ".tx");
            write.write(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            write.close();
        }

    }public void appendData(String fileName,String data){


        try(FileWriter write = new FileWriter(fileName,true)){

            write.write(data);
        }catch(IOException e){
            System.out.println("we can't write this ");
        }
    }
    public void deleteFile (String fileName) throws IOException {
        File file = new File(fileName);
        if (file.delete()){
            System.out.println("File created");
        }
        else{
            System.out.println("File not Created");
        }
    }
    public void readFile(String fileName) {
        File file = new File(fileName);
        try(Scanner reader = new Scanner(System.in)) {

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("file not found");
        }

    }
}
