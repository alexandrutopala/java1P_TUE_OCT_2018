import java.io.*;

public class Exemplu3 {
    public static void main(String [] args) {
        File f1 = new File("./A/X/C");
        
        System.out.println(f1.delete());
        
        File f2 = new File("./A");
        File[] files = f2.listFiles();
        
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
        
        
    }
}