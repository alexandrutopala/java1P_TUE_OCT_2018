import java.nio.file.*;
import java.io.*;

public class Exemplu12 {
    public static void main(String [] args) throws IOException {
        Path p = Paths.get("./Exemplu12.java");
        
        Files.lines(p)
             .forEach(s -> System.out.println(s));
    }
}