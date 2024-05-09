package BasicMath;

import java.util.Scanner;

public class BOJ_1978_소수찾기 {
    public static int judgePrime(int[] arr, int count) {
        int flag, result = 0;
        for (int i = 0; i < count; i++) {
            flag = 0;
            for (int j = 2; j < arr[i]; j++)
                if (arr[i] % j == 0) flag = 1;
            if (flag == 0 && arr[i] > 1) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {arr[i] = scanner.nextInt();}
        System.out.println(judgePrime(arr, count));
        scanner.close();
    }
}
