package Bai08;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void preOrderTraversal() {
        preOrderRec(root);
    }

    void preOrderRec(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }
}
