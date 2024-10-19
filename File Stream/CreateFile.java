import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }
}
