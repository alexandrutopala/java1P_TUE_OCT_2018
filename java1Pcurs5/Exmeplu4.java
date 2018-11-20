import java.util.concurrent.*;

public class Exmeplu4 {
    public static void main(String [] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Runnable task = new Runnable1();
        
        
        
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        service.submit(task);
        
        service.shutdown();
        
    }
}