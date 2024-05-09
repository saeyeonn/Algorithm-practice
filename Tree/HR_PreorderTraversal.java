package Tree;

import java.util.Scanner;

public class HR_PreorderTraversal {
    static class Node {
        HR_PostorderTraversal.Node left;
        HR_PostorderTraversal.Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static void preOrder(HR_PostorderTraversal.Node root) {

        System.out.print(root.data + " ");
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }

    static HR_PostorderTraversal.Node insert(HR_PostorderTraversal.Node root, int data) {
        if(root == null) {
            return new HR_PostorderTraversal.Node(data);
        } else {
            HR_PostorderTraversal.Node cur;
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
        HR_PostorderTraversal.Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        assert root != null;
        preOrder(root);
    }
}
