import java.io.*;

public class Exemplu1 {
    public static void main(String [] args) {
        InputStreamReader reader = null;
        BufferedReader br = null;
        try {
            reader = new InputStreamReader(System.in);
                    
            br = new BufferedReader(reader);
                    
            String line = br.readLine();
            System.out.println("Buna," + line);
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            
        }
        
    }
}