package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11724_연결요소의개수 {
    static int N, M, start, count = 0;
    static boolean[] visited;
    static ArrayList<Integer>[] array;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int start) {
        visited[start] = true;
        for (Integer index : array[start]) {
            if (!visited[index]) {
                dfs(index);
            }
        }
    }

    static void check() {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        array = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            array[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (i == 1) {
                start = a;
            }
            array[a].add(b);
            array[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
