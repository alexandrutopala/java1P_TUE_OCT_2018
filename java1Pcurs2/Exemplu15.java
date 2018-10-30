import java.nio.file.*;
import java.io.*;

public class Exemplu15 {
    public static void main(String [] args) throws IOException {
        Path p = Paths.get(".");
        
        Files.find(p, Integer.MAX_VALUE, 
                  (x, fa) -> x.getFileName().toString().endsWith(".txt"))
             .forEach(x -> System.out.println(x));
    }
}
