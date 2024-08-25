package Bai06;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root,data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left,data);
        } else if (data > root.data) {
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    void postOrderTraversal() {
        postOrderRec(root);
    }

    void postOrderRec(Node root) {
        if (root == null) {
            return;
        }

        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.println(root.data + " ");
    }
}
