import java.io.*;

public class Exemplu4 {
    public static void main(String [] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {
                 
             String line;
             String [] input;
             
             while (true) {
                 line = br.readLine();
                 input = line.split("\\s+");
                 
                 if (input[0].equalsIgnoreCase("EXIT")) {
                     System.exit(0);
                 }
                 
                 String path = parsePath(input);
                 File f = new File(path);
                 
                 switch (input[0].toUpperCase()) {
                     case "CD" : 
                        f.mkdirs();   
                        break;
                     case "CF" : 
                        f.createNewFile();
                        break;
                     case "INFO" : 
                        System.out.println("Size: " + f.length());
                        System.out.println("Kinde of file: " + 
                            (f.isFile() ? "Regular file" : "Directory"));
                        System.out.println("Parent: " + f.getParent());
                        break;
                     case "DELETE" : 
                        f.delete();
                        break;
                     //case "EXIT" : break;
                     default : System.err.println("Comanda invalida");
                 }
                 
             }
             
                 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    private static String parsePath(String [] input) {
        StringBuilder path = new StringBuilder("");
        
        for (int i = 1; i < input.length; i++) {
            path.append(input[i]);
        }
        
        return path.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
}