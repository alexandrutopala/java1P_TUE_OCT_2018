public class Exemplu12 {
    public static void main(String [] args) throws InterruptedException {
        Thread t = new Thread(new RandomNumbersRunnable());
        
        //t.run();
        t.start();
        
        t.join(); // main asteapta pana la finalul executiei lui t
        
        System.out.println("end main");
        
        
        Thread mainThread = Thread.currentThread();
        
    }
}