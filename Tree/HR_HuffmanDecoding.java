public class HR_HuffmanDecoding {
    public static void decode2(String s, Node root, int idx) {
        if (idx >= s.length()) return;
        Node ROOT = root;
        while (root.left != null && root.right != null) {
            if (s.charAt(idx) == '0') root = root.left;
            else root = root.right;
            idx++;
        }
        System.out.print(root.data);
        decode2(s, ROOT, idx);
    }

    void decode(String s, Node root) {
        decode2(s, root, 0);
    }
}
