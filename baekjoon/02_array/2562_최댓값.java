import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int idx = -1;

        for (int i = 1; i <= 9; i++) {
            int x = Integer.parseInt(br.readLine().trim());

            if (x > max) {
                max = x;
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
