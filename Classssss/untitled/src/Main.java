import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File f = new File("test9.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("vsem horoshego dnya");
        }
        catch (FileNotFoundException e){
            System.out.println("bil poiman Exception:  "+ e);
        }  finally {

            System.out.println(" eto finally block");
        }
        System.out.println("kod ne imeet otnoshenie k Exception");
    }
}