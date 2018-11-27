import java.util.*;

public class Mancare {
    public String nume;
    
    public static enum Fel {
        DULCE, IUTE
    }
    
    private static Map<Fel, Mancare> registry = new HashMap<>();
    
    private Mancare() {
    }
    
    public static Mancare getInstance(Fel key) {
        if (registry.get(key) == null) {
            registry.put(key, new Mancare());
        }
        
        return registry.get(key);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}