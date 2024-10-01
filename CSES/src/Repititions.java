import java.util.*;
import java.io.*;

public class Repititions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String gene = br.readLine();
        int length = 1;
        int maxLength = 1;
        for (int i =0; i < gene.length()-1; i++) {
           if (gene.charAt(i) == gene.charAt(i+1)) {
               length++;
           }
           else {
               length = 1;
           }
           maxLength = Math.max(maxLength, length);

        }
        pw.println(maxLength);
        pw.close();
    }
}
