import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11725_트리의부모찾기 {
    static int N;
    static int[] arr;
    static boolean[] flag;

    static void setParent(int a, int b) {
        if (a == 1) {
            arr[b] = 1;
            flag[b] = true;
        } else if (b == 1) {
            arr[a] = 1;
            flag[a] = true;
        } else if (arr[a] == -1 && arr[b] == -1) {
            arr[a] = b;
            arr[b] = a;
        } else if (arr[a] == -1) {
            arr[a] = b;
            flag[a] = true;
        } else if (arr[b] == -1){
            arr[b] = a;
            flag[b] = true;
        } else if (arr[a] != -1 && !flag[a]) {
            flag[arr[a]] = true;
            arr[a] = b;
            flag[a] = true;
        } else if (arr[b] != -1 && !flag[b]) {
            flag[arr[a]] = false;
            arr[b] = a;
            flag[b] = true;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        flag = new boolean[N + 1];

        for (int i = 2; i < N + 1; i++) {
            arr[i] = -1;
            flag[i] = false;
        }

        for (int i = 1; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            setParent(a, b);
        }

        for (int i = 2; i < N + 1; i++) {
            System.out.println(arr[i]);
        }

        br.close();
    }
}