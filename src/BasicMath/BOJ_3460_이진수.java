package BasicMath;

import java.util.Scanner;

public class BOJ_3460_이진수 {
    static void find_Bit(int n) {
        int loc = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                System.out.print(loc);
                if (n > 1) {
                    System.out.print(" ");
                }
            }
            n /= 2;
            loc++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n;

        for (int i = 0; i < t; i++)
        {
            n = scanner.nextInt();
            find_Bit(n);
            if (i != t - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
