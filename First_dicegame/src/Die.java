import java.util.Scanner;
import java.lang.Math;
import java.time.LocalDateTime;

public class Die {
    public static void PlayDice() {
        char isPlay; // variable is inputted from the User
        int nUserTotalPoint = 0; // User's total points
        int nComputerTotalPoint = 0; // Computer's total points
        double rand = 0; // variable for random dice result
        int nCurrentSecond = 0; // current time value
        int RESTRICTION_POINT = 21; // Restriction Points Count
        LocalDateTime date;
        while (true) {
            System.out.println("Would you like to roll the dice?\nEnter Y for yes or N for no:");
            Scanner reader = new Scanner(System.in); // input on character if 'y' or 'n'
            isPlay = reader.next().charAt(0);

            // if user inputs 'y'
            if (isPlay == 'Y' || isPlay == 'y') {
                rand = Math.random();
                date = LocalDateTime.now();
                nCurrentSecond = date.toLocalTime().toSecondOfDay();
                nUserTotalPoint += ((int) (rand * 6) * nCurrentSecond) % 6 + 1; // calculate the user's totalpoints

                nCurrentSecond = date.toLocalTime().toSecondOfDay();
                rand = Math.random();
                nComputerTotalPoint += ((int) (rand * 6) * nCurrentSecond) % 6 + 1; // calculate the computer's
                                                                                    // totalpoints
            }
            // if user inputs 'n'
            else if (isPlay == 'N' || isPlay == 'n') {
                rand = Math.random();
                date = LocalDateTime.now();
                nCurrentSecond = date.toLocalTime().toSecondOfDay();
                nComputerTotalPoint += ((int) (rand * 6) * nCurrentSecond) % 6 + 1;
            }
            System.out.println("\n");
            System.out.printf("You have %d points.\n", nUserTotalPoint);
            System.out.printf("You have %d points.\n", nComputerTotalPoint);

            // if user or computer's total points over RESTRICTION value
            if (nUserTotalPoint > RESTRICTION_POINT || nComputerTotalPoint > RESTRICTION_POINT) {
                if (nUserTotalPoint <= RESTRICTION_POINT && nComputerTotalPoint > RESTRICTION_POINT) {
                    System.out.println("Congratulations! You won!\n");// If user won
                    return;
                } else if (nUserTotalPoint > RESTRICTION_POINT && nComputerTotalPoint <= RESTRICTION_POINT) {
                    System.out.println("Game Over\n");// If computer won
                    return;
                }
                // in this case user and computer's total points are over RESTRINCTION value,
                // then more less value will be win!!
                else {
                    if (nUserTotalPoint < nComputerTotalPoint) {
                        System.out.println("Congratulations! You won!\n");// if user's total points are less than the
                                                                          // computer's total points
                        return;
                    } else {
                        System.out.println("Game Over\n");// if user's total points are bigger than the computer's total
                                                          // points
                        return;
                    }
                }
            }
        }
    }
}
