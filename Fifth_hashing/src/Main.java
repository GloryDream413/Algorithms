import java.util.Scanner;

public class Main {
    // Main testing class
    // Main Class for LinearProbingHashTableTest
    // Main driver method
    public static void main(String[] args) {
        // Creating a scanner object
        // to take input from user
        Scanner scan = new Scanner(System.in);
        // Display messages
        System.out.println("Hash Table Test\n\n");
        System.out.println("Enter size");

        // maxSizeake object of LinearProbingHashTable
        LinearProbingHashTable lpht = new LinearProbingHashTable(scan.nextInt());

        char ch;

        // Do-while loop
        // Do part for performing actions
        do
        // Menu is displayed
        // LinearProbingHashTable operations performed as
        // per keys Users enter 'y' to continue 'n' if
        // entered by user , the program terminates
        {
            // Menu
            // Display messages
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. remove");
            System.out.println("3. get");
            System.out.println("4. clear");
            System.out.println("5. size");
            // Reading integer using nextInt()
            int choice = scan.nextInt();
            // Switch case
            switch (choice) {

                // Case 1
                case 1:

                    // Display message
                    System.out.println("Enter key and value");
                    lpht.insert(scan.next(), scan.next());
                    // Break statement to terminate a case
                    break;

                // Case 2
                case 2:

                    // Display message
                    System.out.println("Enter key");
                    lpht.remove(scan.next());
                    // Break statement to terminate a case
                    break;

                // Case 3
                case 3:

                    // Print statements
                    System.out.println("Enter key");
                    System.out.println("Value = "
                            + lpht.get(scan.next()));
                    // Break statement to terminate a case
                    break;

                // Case 4
                case 4:

                    lpht.makeEmpty();
                    // Print statement
                    System.out.println("Hash Table Cleared\n");
                    // Break statement to terminate a case
                    break;

                // Case 5
                case 5:

                    // Print statement
                    System.out.println("Size = "
                            + lpht.getSize());
                    break;

                // Default case
                // Executed when mentioned switch cases are not
                // matched
                default:
                    // Print statement
                    System.out.println("Wrong Entry \n ");
                    // Break statement
                    break;
            }
            // Display hash table
            lpht.printHashTable();
            // Display message asking the user whether
            // he/she wants to continue
            System.out.println(
                    "\nDo you want to continue (Type y or n) \n");
            // Reading character using charAt() method to
            // fetch
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}