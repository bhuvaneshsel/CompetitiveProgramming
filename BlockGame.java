import java.io.*;
import java.util.StringTokenizer;

public class BlockGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        int[] characters = new int[26];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word1 = st.nextToken();
            String word2 = st.nextToken();
            int[] count1 = new int[26];
            for (int j = 0; j < word1.length(); j++) {
                count1[word1.charAt(j) - 'a'] += 1;
            }
            int[] count2 = new int[26];
            for (int j = 0; j < word2.length(); j++) {
                count2[word2.charAt(j) - 'a'] += 1;
            }

            for (int j = 0; j < characters.length; j++) {
                characters[j] += Math.max(count1[j], count2[j]);
            }
        }
        for (int i =0; i < characters.length; i++) {
            pw.println(characters[i]);
        }
        pw.close();
    }
}
