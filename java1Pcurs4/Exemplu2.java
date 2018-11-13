import java.util.*;

public class Exemplu2 {
    public static void main(String [] args) {
        List<String> list = Arrays.asList(
            "aaa",
            "abc",
            "xy",
            "g"
        );
        
        Optional<Integer> sum = 
            list.stream()
                .map(s -> s.split("\\s*")) // String -> String[]
                .map(sa -> Arrays.asList(sa)) // String[] -> List<String>
                .flatMap(ls -> ls.stream()) // List<String> -> Stream<String>
                
                .map(l -> l.charAt(0)) // String -> Character
                .map(c -> (int) c) // Character -> Integer
                .reduce((a, b) -> a+b);
                
        System.out.println(sum);
        System.out.println(sum.isPresent());
        
        
        
        
        
        
        
        
        
        
        
        
    }
}