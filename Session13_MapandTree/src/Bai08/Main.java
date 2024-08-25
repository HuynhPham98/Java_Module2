package Bai08;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        /* Thêm các phần tử vào BST */
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Duyệt cây theo thứ tự tiền tự (pre-order)
        System.out.println("Pre-order traversal of the BST:");
        bst.preOrderTraversal();
    }
}
