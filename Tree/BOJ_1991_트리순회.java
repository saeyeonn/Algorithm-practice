package Tree;

import java.io.*;
import java.util.StringTokenizer;


public class BOJ_1991_트리순회 {
    static int N;
    static Node head = new Node('A', null, null);

    static class Node {
        char value;
        Node left;
        Node right;

        Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    static void insertNode(Node node, char rootValue, char leftValue, char rightValue) {
        if (node.value == rootValue) {
            if (leftValue != '.') {
                node.left = new Node(leftValue, null, null);
            }
            if (rightValue != '.') {
                node.right = new Node(rightValue, null, null);
            }
        } else {
            if (node.left != null) {
                insertNode(node.left, rootValue, leftValue, rightValue);
            }
            if (node.right != null) {
                insertNode(node.right, rootValue, leftValue, rightValue);
            }
        }
    }

    static void preOrder(Node node) {
        if (node == null) {
            return ;
        }

        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    static void inOrder(Node node) {
        if (node == null) {
            return ;
        }

        inOrder(node.left);
        System.out.print(node.value);
        inOrder(node.right);
    }

    static void postOrder(Node node) {
        if (node == null) {
            return ;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char rootValue = st.nextToken().charAt(0);
            char leftValue = st.nextToken().charAt(0);
            char rightValue = st.nextToken().charAt(0);
            insertNode(head, rootValue, leftValue, rightValue);
        }

        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);

        br.close();
    }
}