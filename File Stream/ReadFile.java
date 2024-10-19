import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
