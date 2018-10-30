import java.nio.file.*;
import java.io.*;

public class Exemplu8 {
    public static void main(String [] args) throws IOException {
        Path p1 = Paths.get("./G");
        
        if (Files.notExists(p1)) {
            Files.createDirectory(p1);
        }
        
        Path p2 = Paths.get("./G/test.txt");
        
        Files.createFile(p2);
    }
}