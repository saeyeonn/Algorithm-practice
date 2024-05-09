package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1260_DFS와BFS {
    static int N, M, K;
    static boolean[] visited;
    static ArrayList<Integer>[] array;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
        for (int index : array[start]) {
            if (!visited[index]) {
                dfs(index);
            }
        }
    }

    static void bfs(int start) {
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int i = queue.poll();
            sb.append(i).append(" ");
            for (int index : array[i]) {
                if (!visited[index]) {
                    queue.add(index);
                    visited[index] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        array = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            array[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            array[a].add(b);
            array[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(array[i]);
        }

        dfs(K);
        sb.append('\n');
        visited = new boolean[N + 1];
        bfs(K);
        System.out.println(sb);
    }

}
