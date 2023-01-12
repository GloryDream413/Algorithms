import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree_String {
    static class Node {
        String data;
        Node left, right;
    };

    static Node newNode(String data) {
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
        Node root = newNode("Karen");
        root.left = newNode("Tom");
        root.right = newNode("Bob");
        root.left.left = newNode("Wendy");
        root.left.right = newNode("Alan");
        root.right.left = newNode("Ellen");
        root.right.right = newNode("Kelly");
        return true;
    }
}
