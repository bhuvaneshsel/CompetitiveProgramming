import java.io.*;
import java.util.StringTokenizer;

public class Censoring {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new FileReader("censor.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));

        String s = br.readLine();
        String t = br.readLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            if (result.length() >=t.length()) {
                String check = result.substring(result.length()-t.length(), result.length());
                if (check.equals(t)) {
                    result.delete(result.length()-t.length(), result.length());
                }
            }
        }
        pw.println(result);
        pw.close();

    }
}
