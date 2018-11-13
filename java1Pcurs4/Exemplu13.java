public class Exemplu13 {
    public static void main(String [] args) throws InterruptedException{
        Object mon1 = new Object();
        Object mon2 = new Object();
        Thread t1 = new Thread(() -> m1(mon1, mon2));
        Thread t2 = new Thread(() -> m2(mon1, mon2));
        
        t1.start();
        t2.start();
        
        t1.join(); t2.join();
        
        System.out.println("end main");
    }
    
    
    
    private static void m1(Object mon1, Object mon2) {
        synchronized (mon1) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
            synchronized (mon2) {
                System.out.println("m1");
            }
        }
    }    
    private static void m2(Object mon1, Object mon2) {
        synchronized (mon2) {
            
            synchronized (mon1) {
                System.out.println("m1");
            }
        }        
    }
    
    
    
    
    
    
    
    
    
    
    
}