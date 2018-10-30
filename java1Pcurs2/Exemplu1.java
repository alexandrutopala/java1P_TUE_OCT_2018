import java.io.*;

public class Exemplu1 {
    public static void main(String [] args) {
        File f1 = new File("./A");
        
        boolean rez = f1.mkdir();
        System.out.println(rez);
        
        System.out.println("Fisierul exista: " + f1.exists());
    }
}