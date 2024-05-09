package BasicMath;

import java.util.Scanner;

public class BOJ_2609_최소공배수와최대공약수 {
    public static int getLCM(int small, int num1, int num2) {
        int i;
        for (i = small; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) break;
        }

        return i;
    }

    public static int getGCD(int small, int big) {
        int i;
        for (i = 1; i <= big; i++) {
            if (small * i % big == 0) {
                break;
            }
        }
        return small * i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int small = num1, big = num2;

        if (num1 > num2) {
            small = num2;
            big = num1;
        }

        System.out.println(getLCM(small, num1, num2));
        System.out.println(getGCD(small, big));

        scanner.close();
    }
}
