import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerAMove, playerBMove, response;
        do {
            System.out.println("Player A please enter your move (R,P,S): ");
            playerAMove = in.nextLine();
            while (!playerAMove.equalsIgnoreCase("R") && !playerAMove.equalsIgnoreCase("P") && !playerAMove.equalsIgnoreCase("S")) {
                System.out.println("Invalid move! You must choose (R,P,S)");
                playerAMove=in.nextLine();
            }
            System.out.println("Player B please enter your move (R,P,S): ");
            playerBMove = in.nextLine();
            while (!playerBMove.equalsIgnoreCase("R") && !playerBMove.equalsIgnoreCase("P") && !playerBMove.equalsIgnoreCase("S")) {
                System.out.println("Invalid move! You must choose (R,P,S)");
                playerBMove=in.nextLine();
            }if (playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("S")){
                System.out.println("Rock Breaks Scissors! Player A wins!");
            }else if (playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("R")) {
                System.out.println("Paper Covers Rock! Player A wins!");
            }else if (playerAMove.equalsIgnoreCase("S") && playerBMove.equalsIgnoreCase("P")) {
                System.out.println("Scissors Cut Paper! Player A wins!");
            }else if (playerAMove.equalsIgnoreCase("S") && playerBMove.equalsIgnoreCase("R")) {
                System.out.println("Rock Breaks Scissors! Player B wins!");
            }else if (playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("P")) {
                System.out.println("Paper Covers Rock! Player B wins!");
            }else if (playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("S")) {
                System.out.println("Scissors Cut Paper! Player B wins!");
            }else if (playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("R")) {
                System.out.println("Rock Vs Rock! Its a tie!");
            }else if (playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("P")) {
                System.out.println("Paper Vs Paper! Its a tie!");
            }else if (playerAMove.equalsIgnoreCase("S") && playerBMove.equalsIgnoreCase("S")) {
                System.out.println("Scissors Vs Scissors! Its a tie!");
            }
            System.out.print("Do you want to play again? (Y/N): ");
            response=in.nextLine();
            while(!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N")){
                System.out.println("Invalid Input! You must enter (Y/N)");
                response=in.nextLine();
            }
    } while (!response.equalsIgnoreCase("N"));
        System.out.println("Thanks for playing!");
    }
}