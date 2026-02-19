import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {

        boolean[] blocked = new boolean[26];

        // skip 문자 체크
        for (int i = 0; i < skip.length(); i++) {
            blocked[skip.charAt(i) - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);
            int count = 0;

            while (count < index) {
                current = (char) ('a' + (current - 'a' + 1) % 26);

                if (!blocked[current - 'a']) {
                    count++;
                }
            }

            sb.append(current);
        }

        return sb.toString();
    }
}
