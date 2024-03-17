import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HR_LevelOrderTraversal {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node pollNode = queue.poll();

            if (pollNode.left != null) {
                queue.add(pollNode.left);
            }
            if (pollNode.right != null) {
                queue.add(pollNode.right);
            }
            System.out.print(root.data + " ");
        }
    }

    static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        assert root != null;
        levelOrder(root);
    }

}
