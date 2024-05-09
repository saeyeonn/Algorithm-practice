package Search;

public class BOJ_11725_트리의부모찾기 {
//    static int N;
//    static int[] array;
//    static Queue<Integer> queue = new LinkedList<>();
//    static boolean[] visited;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        N = Integer.parseInt(br.readLine());
//        array = new int[N + 1];
//        visited = new boolean[N + 1];
//        visited[1] = true;
//
//        for (int i = 2; i <= N; i++) {
//            visited[i] = false;
//        }
//
//        for (int i = 1; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            if (!visited[a] && !visited[b]) {
//                queue.add(a);
//                queue.add(b);
//            } else if (!visited[a]) {
//                visited[a] = true;
//                array[a] = b;
//            } else {
//                visited[b] = true;
//                array[b] = a;
//            }
//        }
//
//        while (!queue.isEmpty()) {
//            int a = queue.poll();
//            int b = queue.poll();
//
//            if (!visited[a]) {
//                visited[a] = true;
//                array[a] = b;
//            } else {
//                visited[b] = true;
//                array[b] = a;
//            }
//        }
//
//        for (int i = 2; i <= N; i++) {
//            System.out.println(array[i]);
//        }
//    }
}
