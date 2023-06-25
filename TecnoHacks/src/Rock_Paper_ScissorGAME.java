import java.util.Random;
import java.util.Scanner;

         public class Rock_Paper_ScissorGAME {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        String[] choices = {"rock", "paper", "scissors"};

	        while (true) {
	            // User's turn
	            System.out.print("Enter your choice (rock, paper, or scissors): ");
	            String userChoice = scanner.nextLine().toLowerCase();

	            // Computer's turn
	            int randomIndex = random.nextInt(3);
	            String computerChoice = choices[randomIndex];

	            // Display choices
	            System.out.println("Your choice: " + userChoice);
	            System.out.println("Computer's choice: " + computerChoice);

	            // Determine the winner
	            if (userChoice.equals(computerChoice)) {
	                System.out.println("It's a tie!");
	            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
	                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
	                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
	                System.out.println("You win!");
	            } else {
	                System.out.println("Computer wins!");
	            }

	            // Ask if the user wants to play again
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgain = scanner.nextLine().toLowerCase();
	            if (!playAgain.equals("yes")) {
	                break;
	            }
	        }

	        scanner.close();
	    }
	}



