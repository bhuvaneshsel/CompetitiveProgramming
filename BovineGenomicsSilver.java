import java.io.*;
import java.util.StringTokenizer;


public class BovineGenomicsSilver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        //BufferedReader br = new BufferedReader(new FileReader("cownomics.in"));
        //PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));

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
        for (int i = 0; i < plain[0].length(); i++) {
            for (int j =i +1; j < plain[0].length(); j++) {
                for (int k = j + 1; k < plain[0].length(); k++) {
                    int[] plainIDs = new int[100];
                    boolean valid = true;
                    for (int l = 0; l < N; l++) {
                       String gene = "" + plain[l].charAt(i) + plain[l].charAt(j) +plain[l].charAt(k);
                       plainIDs[getID(gene)] =1;
                    }
                    for (int l = 0; l < N; l++) {
                        String gene = "" + spotty[l].charAt(i) + spotty[l].charAt(j) +spotty[l].charAt(k);
                        if (plainIDs[getID(gene)] ==1) {
                            valid = false;
                        }
                    }
                    if (valid) {
                        result++;
                    }
                }
            }
        }

        pw.println(result);
        pw.close();
    }

    public static int convertToInt(Character c) {
        if (c == 'A') {
            return 1;
        }
        else if (c =='G') {
            return 2;
        }
        else if (c == 'C') {
            return 3;
        }
        else if (c =='T') {
            return 4;
        }
        else {
            return -1;
        }
    }

    public static int getID(String s) {
        int ID = 0;
        ID += 16 *convertToInt(s.charAt(0));
        ID += 4 *convertToInt(s.charAt(1));
        ID += 1 *convertToInt(s.charAt(2));
        return ID;
    }
}
