package BasicMath;

import java.io.*;
import java.math.BigInteger;

public class BOJ_4134_다음소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            BigInteger n = new BigInteger(br.readLine());
            if (n.isProbablePrime(100)) {
                System.out.println(n);
            } else {
                System.out.println(n.nextProbablePrime());
            }
        }
    }
}