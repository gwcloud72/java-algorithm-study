import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int count = 1;  // 지나가는 방 개수
        int range = 1;  // 현재 범위의 마지막 방 번호

        while (N > range) {
            range += 6 * count;
            count++;
        }

        System.out.println(count);
    }
}