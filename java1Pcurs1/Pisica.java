import java.io.*;

public class Pisica extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    public transient String nume = "Tom";
    public int varsta;
    public String culoare;
    //public int greutate;
    
    {
        System.out.println("Bloc anonim non-static");
    }
    
    public Pisica(String nume, int varsta, String culoare) {
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
        System.out.println("c-tor pisica");
    }
    
    
    
    public Pisica() {
        System.out.println("c-tor pisica");
    }
    
    @Override
    public String toString() {
        return nume + " " + varsta + " " + culoare + " ";
    }
    
    
    
    
    
    
    
    
    
    
    
}