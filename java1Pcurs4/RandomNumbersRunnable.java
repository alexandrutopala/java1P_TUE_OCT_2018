import java.util.*;
import java.util.stream.*;

public class RandomNumbersRunnable implements Runnable {
    
    @Override
    public void run() {
        Random r = new Random();
        Stream<Integer> stream = Stream.generate(() -> r.nextInt(100));
        stream.limit(50).forEach(System.out::println);
        
    }
}