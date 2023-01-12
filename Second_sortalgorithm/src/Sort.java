import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws Exception {
        int nElementsCnt; // Elements count
        int nElementsArray[]; // Elements Array value
        nElementsArray = new int[50];// allocate the array size = 50
        Scanner input = new Scanner(System.in);// input varaible for user input
        int nComparisons = 0;// compare number
        int nMovements = 0;// movement number
        while (true) {
            nComparisons = nMovements = 0;// initialize compare numbers & movement numbers = 0
            System.out.println("Enter number of elements to be sorted (zero to exit):");
            nElementsCnt = input.nextInt();// input form user
            // if nElementsCount = 0 then break;
            if (nElementsCnt == 0)
                break;
            System.out.printf("Test case with %d elements.\n", nElementsCnt);// output testcases
            System.out.printf("Unsorted array with %d elements to be sorted:\n", nElementsCnt);// output string
                                                                                               // according to an
                                                                                               // assignment
            // input all the elements from user
            for (int i = 0; i < nElementsCnt; i++) {
                nElementsArray[i] = input.nextInt();
            }
            // Insertion Sort according to an insertion algorithm
            int key;
            for (int step = 1; step < nElementsCnt; step++) {
                key = nElementsArray[step];
                int j = step - 1;
                while (j >= 0) {
                    if (key < nElementsArray[j]) {
                        nMovements++;
                        nComparisons++;
                        nElementsArray[j + 1] = nElementsArray[j];
                        j--;
                    } else {
                        nComparisons++;
                        break;
                    }
                }
                nElementsArray[j + 1] = key;
            }

            // output according to an assignment
            System.out.println("****** Insertion sort *******\n");
            System.out.printf("Insertion sort comparisons: %d\n", nComparisons);
            System.out.printf("Insertion sort number of items moves: %d\n", nMovements);
            // Shell Sort
            nComparisons = nMovements = 0; // initialize compare number & movement number = 0
            for (int interval = nElementsCnt / 2; interval > 0; interval /= 2) {
                nComparisons++;// in this case compared one time
                for (int i = interval; i < nElementsCnt; i += 1) {
                    nComparisons++;// in this case compared one time
                    int temp = nElementsArray[i];
                    int j;
                    for (j = i; j >= interval && nElementsArray[j - interval] > temp; j -= interval) {
                        nElementsArray[j] = nElementsArray[j - interval];
                        nMovements++;// in this case movemented one time
                        nComparisons += 2;// in this case compared two times j>=interval? nElementsArray[j - interval] >
                                          // temp
                    }
                    nElementsArray[j] = temp;
                    nMovements++;// movemented one time
                }
                nComparisons++;// anyway compared one time
            }
            nComparisons++;// compared one time
            // output comparison & movements
            System.out.println("****** Shell sort *******\n");
            System.out.printf("Shell sort comparisons: %d\n", nComparisons);
            System.out.printf("Shell sort number of items moves: %d\n", nMovements);
        }
    }
}