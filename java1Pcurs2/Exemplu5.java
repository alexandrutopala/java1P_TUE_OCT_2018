import java.nio.file.*;

public class Exemplu5 {
    public static void main(String [] args) {
        Path p1 = Paths.get("./A");
        
        System.out.println(p1.getClass());
        
        System.out.println("Numele fisierului : " +p1.getFileName());
        System.out.println("Cale absoluta : " + p1.toAbsolutePath());
        
        
        Path p2 = Paths.get("C:/", ".", "A/B", "C/D/E");
        System.out.println(p2);
        
        for (int i = 0; i < p2.getNameCount(); i++) {
            System.out.println(i + " : " + p2.getName(i));
        }
        
        System.out.println(p2.getRoot());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}