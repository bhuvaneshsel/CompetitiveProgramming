import java.io.*;
import java.util.StringTokenizer;

public class Censoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String s = br.readLine();
        String t = br.readLine();

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < s.length()) {
            while (t.charAt(j) == s.charAt(i)) {
                i++;
                j++;
            }
        }
    }
}
