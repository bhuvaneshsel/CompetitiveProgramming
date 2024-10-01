import java.util.*;
import java.io.*;
public class IncreasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] nums = new long[n];

        for (int i = 0; i < n; i++) {
           nums[i] = Long.parseLong(st.nextToken());
        }

        long count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                count += nums[i-1] -nums[i];
                nums[i] = nums[i-1];
            }
        }

        pw.println(count);
        pw.close();

    }
}
