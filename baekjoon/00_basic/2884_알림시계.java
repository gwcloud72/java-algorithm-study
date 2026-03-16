import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M >= 45) {
            M -= 45;
        } else {
            H--;
            M = M + 60 - 45;

            if (H < 0) {
                H = 23;
            }
        }

        System.out.println(H + " " + M);
    }
}