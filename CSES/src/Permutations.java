import java.util.*;
import java.io.*;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        if (n==1) {
            pw.println(1);
            pw.close();
            return;
        }
        if (n == 2 || n ==3) {
            pw.println("NO SOLUTION");
            pw.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i%2 ==0) {
                pw.print(i + " ");
            }
        }

        for (int i = 0; i <= n; i++) {
            if (i%2 !=0) {
                pw.print(i + " ");
            }
        }
        pw.close();
    }
}
