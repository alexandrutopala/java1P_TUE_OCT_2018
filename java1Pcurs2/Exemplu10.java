import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Exemplu10 {
    public static void main(String [] args) throws IOException {
        Path p1 = Paths.get("./Exemplu10.java");
        
        List<String> lines = Files.readAllLines(p1);
        lines.forEach(line -> System.out.println(line));
        
    }
}
