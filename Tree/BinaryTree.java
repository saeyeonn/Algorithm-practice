package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    static Node root;
    static class Node {
        int value;
        Node left;
        Node right;
        Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setLeft(Node node) {
            this.left = node;
        }

        public void setRight(Node node) {
            this.right = node;
        }
    }

    public boolean find(int value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                return true;
            } else if (currentNode.getValue() > value) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        return false;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value, null, null);

        if (find(value)) {
            return false;
        }
        if (root == null) {
            root = newNode;
            return true;
        }

        Node parent = root;
        Node currentNode;

        while (true) {
            currentNode = parent;
            if (value < parent.getValue()) {
                parent = parent.getLeft();
                if (parent == null) {
                    currentNode.setLeft(newNode);
                    return true;
                }
            } else {
                parent = parent.getRight();
                if (parent == null) {
                    currentNode.setRight(newNode);
                    return true;
                }
            }
        }
    }

    private List<Integer> PreOrderTraverse(Node node, List<Integer> list) {
        if (node != null) {
            PreOrderTraverse(node.getLeft(), list);
            list.add(node.getValue());
            PreOrderTraverse(node.getRight(), list);
        }
        return list;
    }
    private List<Integer> inOrderTraverse(Node node, List<Integer> list) {
        if (node != null) {
            list.add(node.getValue());
            inOrderTraverse(node.getLeft(), list);
            inOrderTraverse(node.getRight(), list);
        }
        return list;
    }
    private List<Integer> postOrderTraverse(Node node, List<Integer> list) {
        if (node != null) {
            postOrderTraverse(node.getLeft(), list);
            postOrderTraverse(node.getRight(), list);
            list.add(node.getValue());
        }
        return list;
    }

    private List<Integer> BFS(Node node) {
        if (node == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node pollNode = queue.poll();

                assert pollNode != null;
                if (pollNode.getLeft() != null) {
                    queue.add(pollNode.getLeft());
                }
                if (pollNode.getRight() != null) {
                    queue.add(pollNode.getRight());
                }
                result.add(pollNode.getValue());
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

