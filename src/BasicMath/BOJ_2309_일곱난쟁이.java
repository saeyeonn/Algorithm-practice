package BasicMath;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309_일곱난쟁이 {
    public static int[] find(int[] arr) {
        int sum = 0;
        int[] fake = new int[2];
        for (int k : arr) {
            sum += k;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    fake[0] = i;
                    fake[1] = j;
                    break;
                }
            }
        }
        return fake;
    }

    public static void print(int[] arr, int[] fake) {
        for (int i = 0; i < 9; i++)
            if (i != fake[0] && i != fake[1]) {System.out.println(arr[i]);}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++) {arr[i] = scanner.nextInt();}
        scanner.close();
        Arrays.sort(arr);
        print(arr, find(arr));
    }
}
