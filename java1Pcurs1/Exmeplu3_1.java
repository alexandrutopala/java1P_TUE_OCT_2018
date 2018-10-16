import java.io.*;

public class Exmeplu3_1 {
    public static void main(String [] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter("date.txt", true);
             //BufferedWriter bw = new BufferedWriter(fw)
             PrintWriter pw = new PrintWriter(fw)) {
                 
            String line;
            while (!(line = br.readLine()).equals("exit")) {
                //bw.write("\n" + line, 0, line.length() + 1);
                pw.println(line);
                //pw.flush();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}