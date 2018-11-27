import java.util.*;

public class GigelBday {
    private List<Listener> listeners = new ArrayList<>();
    
    public void addListener(Listener l) {
        listeners.add(l);
    }
    
    public void removeListener(Listener l) {
        listeners.remove(l);
    }
    
    public void esteZiuaLuiGigel() {
        listeners.forEach(Listener::notifica);
    }
    
    
    
    
    
    
    
    
    
    
}