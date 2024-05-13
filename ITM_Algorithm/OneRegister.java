package ITM_Algorithm;

import java.util.Scanner;
public class OneRegister {
    static int N;
    public static void main(String[] args) {
        OneRegisterSolution oneRegister = new OneRegisterSolution();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        System.out.println("Minimum number of registers:" + oneRegister.getCountOfRegisters(N));
    }

}

