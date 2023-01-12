import java.util.Scanner;

public class BinarySearchTree_Integer {
    static class Node {
        int data;
        Node left, right;
    };

    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }

    private boolean isBSTOrNot(Node root) {
        // check for root is not null or not
        if (root == null && root.data > root.left.data && root.data < root.right.data) {
            return true;
        }
        // check for current node value with left node value and right node value and
        // recursively check for left sub tree and right sub tree
        if (isBSTOrNot(root.left) && isBSTOrNot(root.right)) {
            return true;
        }
        return false;
    }

    public static boolean IsFullBinarySearchTree() {
        Node root = newNode(2);
        root.left = newNode(4);
        root.right = newNode(3);
        root.left.left = newNode(1);
        root.left.right = newNode(8);
        root.right.left = newNode(5);
        root.right.right = newNode(6);
        root.right.right.left = newNode(7);
        return true;
    }
}
