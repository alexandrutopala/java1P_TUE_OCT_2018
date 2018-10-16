import java.io.*;

public class Exemplu4 {
    public static void main(String [] args) {
        Pisica p = new Pisica("Mitzi", 6, "alb");
        
        try (FileOutputStream fos = new FileOutputStream("pisica.seri");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                 
            oos.writeObject(p);     
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}