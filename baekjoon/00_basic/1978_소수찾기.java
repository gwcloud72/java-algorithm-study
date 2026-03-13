import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (isPrime(x)) {
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}