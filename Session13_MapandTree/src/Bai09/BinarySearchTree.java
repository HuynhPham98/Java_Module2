package Bai09;

public class BinarySearchTree {
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Phương thức thêm phần tử vào BST
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

    // Phương thức tìm kiếm phần tử trong BST
    boolean search(int data) {
        return searchRec(root, data);
    }

    // Hàm đệ quy để tìm kiếm phần tử trong cây
    boolean searchRec(Node current, int data) {
        // Trường hợp cây con trống hoặc đã tìm thấy phần tử
        if (current == null) {
            return false;
        }
        if (current.data == data) {
            return true;
        }

        // Phần tử nhỏ hơn current.data, duyệt cây con bên trái
        if (data < current.data) {
            return searchRec(current.left, data);
        }

        // Phần tử lớn hơn current.data, duyệt cây con bên phải
        return searchRec(current.right, data);
    }
}
