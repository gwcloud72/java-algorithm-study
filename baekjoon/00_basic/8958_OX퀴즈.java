import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < T; t++) {
            String s = br.readLine().trim();

            int total = 0;
            int score = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    score++;
                    total += score;
                } else {
                    score = 0;
                }
            }

            System.out.println(total);
        }
    }
}