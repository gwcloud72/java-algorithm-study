import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < T; t++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];
            int sum = 0;

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            double avg = (double) sum / N;

            int count = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > avg) {
                    count++;
                }
            }

            double ratio = (double) count / N * 100;
            System.out.printf("%.3f%%
", ratio);
        }
    }
}
