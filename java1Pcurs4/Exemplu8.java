import java.util.*;
import java.util.stream.*;

public class Exemplu8 {
    public static void main(String [] args) {
        List<Produs> produse = Arrays.asList(
            new Produs("telefon", 1500, 40),
            new Produs("frigider", 2500, 20),
            new Produs("laptop", 1500, 50),
            new Produs("masina de spalat", 2500, 10),
            new Produs("microunde", 400, 10),
            new Produs("frigider", 2000, 20)
        );
        
        Map<String, Double> map = 
                produse.stream()
                       .collect(Collectors.toMap(
                            Produs::getNume, //p -> p.getNume(),
                            Produs::getPret, //p -> p.getPret()
                            Double::max //(pret1, pret2) -> pret2
                       ));
        
        System.out.println(map);
        
        
        
    }
}