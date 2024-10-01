import java.util.*;
import java.io.*;

public class BovineGenomicsBronze {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new FileReader("cownomics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] spotty = new String[N];
        String[] plain = new String[N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            spotty[i] = st.nextToken();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            plain[i] = st.nextToken();
        }



        int result = 0;
        boolean diff = true;
        for (int i = 0; i < plain[0].length(); i++) {
            int[] spottyCount = new int[4];
            int[] plainCount = new int[4];
            for (int j = 0; j < N; j++) {
                spottyCount[convertToInt(spotty[j].charAt(i))]++;
                plainCount[convertToInt(plain[j].charAt(i))]++;
            }
            for (int k = 0; k < spottyCount.length; k++) {
                if (spottyCount[k] > 0 && plainCount[k] > 0) {
                    diff = false;
                }
            }
            if (diff) {
                result++;
            }
            diff = true;
        }
        pw.println(result);
        pw.close();
    }

    public static int convertToInt(Character c) {
       if (c == 'A') {
           return 0;
       }
       else if (c =='G') {
           return 1;
       }
       else if (c == 'C') {
           return 2;
       }
       else if (c =='T') {
           return 3;
       }
       else {
           return -1;
       }
    }
}
