import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int original = n;
        int count = 0;

        do {
            int tens = n / 10;
            int ones = n % 10;
            int sum = tens + ones;

            n = ones * 10 + (sum % 10);
            count++;

        } while (n != original);

        System.out.println(count);
    }
}