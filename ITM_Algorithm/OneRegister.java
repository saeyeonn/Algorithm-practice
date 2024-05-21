package ITM_Algorithm;

import java.util.Scanner;
public class OneRegister {
    static int N;
    public static void main(String[] args) {
        Solution register = new Solution();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        System.out.println("Minimum number of registers:" + register.countRegisters(N));
    }

}

