package Bai07;

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

        // Duyệt cây theo thứ tự hậu tự trước khi xóa
        System.out.println("Post-order traversal of the BST before deletion:");
        bst.postOrderTraversal();
        System.out.println();

        // Xóa phần tử 20 (trường hợp không có nút con)
        bst.delete(20);
        System.out.println("Post-order traversal of the BST after deleting 20:");
        bst.postOrderTraversal();
        System.out.println();

        // Xóa phần tử 30 (trường hợp có một nút con)
        bst.delete(30);
        System.out.println("Post-order traversal of the BST after deleting 30:");
        bst.postOrderTraversal();
        System.out.println();

        // Xóa phần tử 50 (trường hợp có hai nút con)
        bst.delete(50);
        System.out.println("Post-order traversal of the BST after deleting 50:");
        bst.postOrderTraversal();
    }
}

