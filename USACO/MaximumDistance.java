import java.io.*;
import java.util.*;

public class MaximumDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] x = new int[N];
        int[] y = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            y[i] = Integer.parseInt(st.nextToken());
        }
        int max =0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                int dx = x[j] - x[i];
                int dy = y[j] - y[i];
                int res = (int)Math.pow(dx, 2) + (int)Math.pow(dy, 2);
                max = Math.max(max, res);
            }
        }
        pw.println(max);
        pw.close();
    }
}
