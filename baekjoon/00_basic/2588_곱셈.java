import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());

        int ones = B % 10;
        int tens = (B / 10) % 10;
        int hundreds = B / 100;

        System.out.println(A * ones);
        System.out.println(A * tens);
        System.out.println(A * hundreds);
        System.out.println(A * B);
    }
}