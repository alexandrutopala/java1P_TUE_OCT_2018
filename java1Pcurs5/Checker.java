import java.nio.file.*;

public class Checker implements Runnable {
    @Override
    public void run() {
        System.out.println("checking");
        Path p = Paths.get("nu_sterge.txt");
        //while (true) {
            
        if (Files.notExists(p)) {
            try {
                Files.createFile(p);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
            
        //}
        
        
        
    }
}