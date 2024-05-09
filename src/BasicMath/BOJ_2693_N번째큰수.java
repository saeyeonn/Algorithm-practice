package BasicMath;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2693_N번째큰수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] arr = new int[count][10];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < count; i++){
            Arrays.sort(arr[i]);
            System.out.println(arr[i][7]);
        }

        scanner.close();
    }
}
