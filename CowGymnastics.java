import java.util.*;
import java.io.*;

public class CowGymnastics {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] cows = new int[N][N];
        int[][] sessions = new int[K][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
               int cow = Integer.parseInt(st.nextToken());
               sessions[i][j] = cow;
            }
        }

        int pairs = 0;
        for (int i = 0; i < sessions.length; i++) {
            for (int j = 0; j < sessions[0].length; j++ ) {
                int cowOne = sessions[i][j]-1;
                for (int k = j +1; k < sessions[0].length; k++) {
                    int cowTwo = sessions[i][k]-1;
                    cows[cowOne][cowTwo] +=1;
                    if (cows[cowOne][cowTwo] >= K) {
                        pairs++;
                    }
                }
            }
        }
        pw.println(pairs);
        pw.close();
    }
}
