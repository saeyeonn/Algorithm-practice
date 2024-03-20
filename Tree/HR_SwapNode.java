public class HR_SwapNode {
    static void inorder(Node cur, List<Integer> list){
        if(cur == null) return;

        inorder(cur.l, list);
        list.add(cur.d);
        inorder(cur.r, list);
    }

    static void swap(Node cur, int depth, int k){
        if(cur == null) return;

        if (depth >=k && depth % k == 0 ) {
            Node t = cur.l;
            cur.l = cur.r;
            cur.r = t;
        }

        swap(cur.l, depth+1, k);
        swap(cur.r, depth+1, k);
    }

    static int[][] swapNodes(int[][] indexes, int[] queries) {
        int[][] result = new int[queries.length][indexes.length];
        Node root = new Node(1, null, null);
        Node cur = root;

        Queue<Node> nodes = new LinkedList<Node>();
        nodes.offer(cur);

        int N = 0;
        while(N < indexes.length){
            cur = nodes.poll();

            cur.l = (indexes[N][0] == -1) ? null : new Node(indexes[N][0], null, null);
            cur.r = (indexes[N][1] == -1) ? null : new Node(indexes[N][1], null, null);

            if(cur.l != null && cur.l.d != -1) nodes.offer(cur.l);
            if(cur.r != null && cur.r.d != -1) nodes.offer(cur.r);
            N++;
        }

        for(int i=0; i<queries.length; i++){
            swap(root, 1, queries[i]);
            List<Integer> list = new ArrayList<>();
            inorder(root, list);
            result[i] = list.stream().mapToInt(v -> v).toArray();
        }

        return result;
    }
}
