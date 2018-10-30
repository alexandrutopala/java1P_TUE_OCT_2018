import java.io.*;

public class Exemplu2 {
    public static void main(String [] args) {
        File f1 = new File("./A/b");
        
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        File f2 = new File("./A/X/C");
        
        System.out.println(f2.mkdirs());
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}