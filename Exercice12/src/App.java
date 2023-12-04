import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
        
        System.out.println("Let's play Rock, Paper, Scissors, Lizard, Spock!");
        System.out.println("Enter your choice (Rock, Paper, Scissors, Lizard, Spock): ");
        String userChoice = scanner.nextLine();
        
        int computerChoiceIndex = random.nextInt(5);
        String computerChoice = choices[computerChoiceIndex];
        
        System.out.println("Computer chooses: " + computerChoice);
        
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("Rock") && (computerChoice.equals("Scissors") || computerChoice.equals("Lizard"))) ||
            (userChoice.equals("Paper") && (computerChoice.equals("Rock") || computerChoice.equals("Spock"))) ||
            (userChoice.equals("Scissors") && (computerChoice.equals("Paper") || computerChoice.equals("Lizard"))) ||
            (userChoice.equals("Lizard") && (computerChoice.equals("Spock") || computerChoice.equals("Paper"))) ||
            (userChoice.equals("Spock") && (computerChoice.equals("Rock") || computerChoice.equals("Scissors"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        
        scanner.close();
    }
}