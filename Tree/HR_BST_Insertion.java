public class HR_BST_Insertion {
    static Node Insert(Node root, int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.left = null;
        newNode.right = null;

        if (root == null) {
            return newNode;
        }

        addNode(root, newNode);
        return root;
    }

    static void addNode(Node root, Node newNode) {
        if (newNode.data < root.data) {
            if (root.left == null) {
                root.left = newNode;
            } else {
                addNode(root.left, newNode);
            }
        } else {
            if (root.right == null) {
                root.right = newNode;
            } else {
                addNode(root.right, newNode);
            } // else
        } // else
}
