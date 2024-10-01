import java.util.*;
import java.io.*;

public class WhyDidTheCowCrossTheRoadII {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new FileReader("circlecross.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("circlecross.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String crossings = st.nextToken();
        int[] start = new int[26];
        int[] end = new int[26];


        for (int i =0; i < crossings.length(); i++) {
            if (start[crossings.charAt(i)-'A'] == 0) {
                start[crossings.charAt(i)-'A'] = i + 1;
            }
            else {
                end[crossings.charAt(i)-'A'] = i + 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (start[i] < start[j] && start[j] < end[i] && end[i] < end[j]) {
                    result++;
                }
            }

        }
        pw.println(result);
        pw.close();
    }

}
