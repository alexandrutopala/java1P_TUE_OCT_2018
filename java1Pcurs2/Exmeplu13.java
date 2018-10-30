import java.nio.file.*;
import java.io.*;

public class Exmeplu13 {
        
    public static void main(String [] args) throws IOException {
        Path p = Paths.get(".");
        
        Files.list(p)
             .filter(x -> x.getFileName().toString().endsWith(".java"))
             .forEach(x -> System.out.println(x));
    }
}