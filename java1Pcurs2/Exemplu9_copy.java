import java.nio.file.*;
import java.io.*;

public class Exemplu9 {
    public static void main(String [] args) throws IOException {
        Path p1 = Paths.get("./Exemplu9.java");
        Path p2 = Paths.get("./Exemplu9_copy.java");
        
        Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
    }
}