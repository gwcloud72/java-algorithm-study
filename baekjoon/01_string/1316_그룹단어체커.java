import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int answer = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine().trim();
            if (isGroupWord(s)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static boolean isGroupWord(String s) {
        boolean[] seen = new boolean[26];

        char prev = 0; // 이전 문자
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            // 새 문자로 바뀐 순간만 체크
            if (cur != prev) {
                int idx = cur - 'a';

                // 이미 나온 문자면 그룹 단어 아님
                if (seen[idx]) {
                    return false;
                }

                seen[idx] = true;
                prev = cur;
            }
        }

        return true;
    }
}