import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws Exception {
        BinarySearchTree_String bstTreeString = new BinarySearchTree_String();
        if (bstTreeString.IsFullBinarySearchTree()) {
            System.out.println("BinarySearhTree-Right!");
        } else {
            System.out.println("NOT BinarySearhTree!");
        }

        BinarySearchTree_Integer bstTreeInteger = new BinarySearchTree_Integer();
        if (bstTreeInteger.IsFullBinarySearchTree()) {
            System.out.println("BinarySearhTree-Right!");
        } else {
            System.out.println("NOT BinarySearhTree!");
        }
    }
}