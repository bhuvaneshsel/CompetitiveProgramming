import java.util.*;
import java.io.*;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);


        long n = Integer.parseInt(br.readLine());
        pw.print(n + " ");
        while (n != 1) {
            if (n%2 == 0) {
                n = n/2;
            }
            else {
                n = n*3 + 1;
            }
            pw.print(n + " ");
        }
        pw.close();
    }
}