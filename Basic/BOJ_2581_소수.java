import java.util.Scanner;

public class Main {
    public static void prime(int start, int end) {
        int flag, min = 0, sum = 0;
        for (int i = start; i <= end; i++) {
            flag = 0;
            for(int j = 2; j < i; j++)
                if (i % j == 0) flag = 1;
            if (flag == 0 && i > 1) {
                if (min == 0) min = i;
                sum += i;
            }
        }
        print(sum, min);
    }
    public static void print(int sum, int min) {
        if (sum == 0) {
            System.out.println(-1);
            return ;
        }
        System.out.println(sum + "\n" + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        prime(start, end);
        scanner.close();
    }
}
