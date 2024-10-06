import java.util.*;
import java.io.*;

public class DistinctNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> distinct = new HashSet<>();
        for (int i =0; i <N; i++) {
            distinct.add(Integer.parseInt(st.nextToken()));
        }

        pw.println(distinct.size());
        pw.close();
    }


}
