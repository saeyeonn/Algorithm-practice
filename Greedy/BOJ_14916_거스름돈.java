package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14916_거스름돈 {
    static int N, five, two = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (five = N / 5; five >= 0; five--) {
            two = (N - five * 5);
            System.out.println(two);
            if (two % 2 == 0) {
                two /= 2;
                System.out.println(two);
                break;
            };
        }
        if ((five == 0 && two == 0) || five < 0 || two < 0) {
            System.out.println(-1);
        } else {
            System.out.println(five + two);
        }
    }
}
