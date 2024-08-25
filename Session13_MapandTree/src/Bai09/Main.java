package Bai09;

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

        // Tìm kiếm các phần tử trong BST
        if (bst.search(40)) {
            System.out.println("Element 40 found in the BST.");
        } else {
            System.out.println("Element 40 not found in the BST.");
        }

        if (bst.search(25)) {
            System.out.println("Element 25 found in the BST.");
        } else {
            System.out.println("Element 25 not found in the BST.");
        }
    }
}
