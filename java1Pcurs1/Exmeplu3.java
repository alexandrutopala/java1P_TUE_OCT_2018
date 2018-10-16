import java.io.*;

public class Exmeplu3 {
    public static void main(String [] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             PrintWriter pw = new PrintWriter("date.txt")) {
                 
            String line;
            while (!(line = br.readLine()).equals("exit")) {
                pw.println(line);
                //pw.flush();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}