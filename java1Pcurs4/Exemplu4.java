import java.util.*;
import java.util.stream.*;

public class Exemplu4 {
    public static void main(String [] args) {
        List<String> list = Arrays.asList("ana", "are", "bere");
        
        String rez = 
            list.stream()
                .collect(Collectors.joining(","));
                
                
        System.out.println(rez);
    }
}