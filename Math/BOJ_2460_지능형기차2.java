import java.util.Scanner;

public class Main {
    static int findMax(int[][] arr) {
        int max = arr[0][1], count = arr[0][1];
        for (int i = 1; i < 10; i++)
            if ((count = count - arr[i][0] + arr[i][1]) > max) max = count;
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[10][2];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        System.out.println(findMax(arr));
        scanner.close();
    }
}
