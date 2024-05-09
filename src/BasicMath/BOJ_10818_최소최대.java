package BasicMath;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10818_최소최대 {
    public static int find(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];

        for(int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print(find(arr) + " ");

        scanner.close();
    }
}
