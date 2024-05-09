package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9934_완전이진트리 {
    static  int N;
    static  int R;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        R = (int) Math.pow(2, N);

        String[] elements = br.readLine().split(" ");

        for (int i = N - 1; i >= 0; i--) {
            int start = (int) Math.pow(2, i);
            int skip = start * 2;

            for (int index = start - 1; index < R; index += skip) {
                System.out.print(elements[index] + " ");    //int skip = Math.pow(2, i);
            }
            System.out.println();
        }

    }
}

