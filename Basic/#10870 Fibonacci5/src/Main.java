import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        int i1 = 0, i2 = 1, result = 0;
        if (n == 1) result = i2;
        else while (n-- > 1) {
            result = i1 + i2;
            i1 = i2;
            i2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
        scanner.close();
        }
}
