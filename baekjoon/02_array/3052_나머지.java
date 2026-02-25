import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] visited = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(br.readLine().trim());
            int r = x % 42;
            visited[r] = true;
        }

        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (visited[i]) count++;
        }

        System.out.println(count);
    }
}
