package BasicMath;

import java.util.Scanner;

public class BOJ_2501_약수구하기 {
    public static int get_divisor(int num, int order) {
        int divisior = 0;
        while (order > 0 && divisior < num) {
            divisior++;
            if (num % divisior == 0)
                order--;
        }
        if (order != 0)
            return 0;

        return divisior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int order = scanner.nextInt();
        int answer = get_divisor(num, order);
        System.out.println(answer);
        scanner.close();
    }
}
