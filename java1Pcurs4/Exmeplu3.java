import java.util.*;

public class Exmeplu3 {
    public static void main(String [] args) {
        Optional<String> o1 = Optional.empty();
        Optional<String> o2 = Optional.of("Hello");
        Optional<String> o3 = Optional.ofNullable(null);
        
        String s1 = o1.orElse("world");
        System.out.println(s1);
        System.out.println(o1);
        
        String s2 = o2.orElseThrow(() -> new NoSuchElementException());
        System.out.println(s2);
        System.out.println(o2);
        
        o2.ifPresent(System.out::println); 
                    // s -> System.out.println(s)
        
        
        
        
        
    }
}