public class Facebook {
    public static void main(String [] args) {
        GigelBday subject = new GigelBday();
        
        Listener Maria = () -> System.out.println("O sa ii pregatesc un tort");
        Listener Costel = () -> System.out.println("O sa-l scot la o bere");
        Listener Florica = () -> System.out.println("O sa-i o urare");
        
        subject.addListener(Maria);
        subject.addListener(Costel);
        subject.addListener(Florica);
        
        System.out.println("*inainte de ziua lui gigel*");
        subject.esteZiuaLuiGigel();
    }
}