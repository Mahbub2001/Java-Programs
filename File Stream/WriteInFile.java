import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        try{
            FileWriter filewriter = new FileWriter("myFile.txt");
            filewriter.write("This is write by mahbub ahmed turza\ndate: 23/2/3334");
            filewriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
