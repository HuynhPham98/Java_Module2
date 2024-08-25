package Bai07;

import Bai06.Node;

class BinarySearchTree {
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Phương thức để thêm phần tử vào BST
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Hàm đệ quy để thêm phần tử mới vào cây
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

    // Phương thức để xóa một phần tử trong BST
    void delete(int data) {
        root = deleteRec(root, data);
    }

    // Hàm đệ quy để xóa phần tử trong BST
    Node deleteRec(Node root, int data) {
        // Cây rỗng
        if (root == null) {
            return root;
        }

        // Duyệt cây để tìm nút cần xóa
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Nút cần xóa đã được tìm thấy

            // Trường hợp 1: Nút không có nút con hoặc chỉ có một nút con
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Trường hợp 2: Nút có hai nút con
            // Tìm nút nhỏ nhất trong cây con bên phải (Inorder Successor)
            root.data = minValue(root.right);

            // Xóa nút Inorder Successor
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    // Tìm giá trị nhỏ nhất trong cây con (được sử dụng trong trường hợp xóa nút có hai con)
    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    // Phương thức để duyệt cây theo thứ tự hậu tự (post-order)
    void postOrderTraversal() {
        postOrderRec(root);
    }

    // Hàm đệ quy để duyệt cây theo thứ tự hậu tự
    void postOrderRec(Node root) {
        if (root == null) {
            return;
        }

        // Duyệt cây con bên trái
        postOrderRec(root.left);

        // Duyệt cây con bên phải
        postOrderRec(root.right);

        // Truy cập nút gốc
        System.out.print(root.data + " ");
    }
}

