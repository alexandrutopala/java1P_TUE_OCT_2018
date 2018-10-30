import java.nio.file.*;
import java.io.*;

    
public class Exemplu14 {
    public static void main(String [] args) throws IOException {
        Path p = Paths.get("./A");
        
        Files.walk(p)
             .forEach(x -> System.out.println(x));
    }
}