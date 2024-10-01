import java.util.*;
import java.io.*;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n+1];
        for (int i = 0; i < n-1; i++) {
            int num = Integer.parseInt(st.nextToken());
            numbers[num] = 1;
        }
        for (int i = 1; i < n+1; i++) {
            if (numbers[i] == 0) {
                pw.println(i);
            }
        }
        pw.close();
    }
}
