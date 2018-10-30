import java.util.*;

public class Exemplu11 {
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(4, 2, 6, 1, 1, 4);
        
        list.stream()
            .filter(x -> x%2 == 0)
            .distinct()
            .forEach(x -> System.out.println(x));
    }
}