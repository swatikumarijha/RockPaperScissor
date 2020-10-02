import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner user = new Scanner(System.in);
		String player = user.next();

		int n = 5;
		do {
			System.out.println("\nEnter 0 for rock\nEnter 1 for paper\nEnter 2 for scissor: ");
			int playerChoice = sc.nextInt();
			switch (playerChoice) {
			case 0:
				System.out.println("You selected rock");
				break;
			case 1:
				System.out.println("You selected paper");
				break;
			case 2:
				System.out.println("You selected scissor");
				break;
			default:
				System.out.println("Choose 0 or 1 or 2 ");
				continue;
			}
			Random rc = new Random();
			int compChoice = rc.nextInt(3);// [0..3][min=0;max=2]

			switch (compChoice) {
			case 0:
				System.out.println("Computer Selected rock");
				break;
			case 1:
				System.out.println("Computer Selected paper");
				break;
			case 2:
				System.out.println("Computer Selected scisssor");
				break;
			}

			if (compChoice == playerChoice)
				System.out.println("Its a Tie");
			else if (compChoice == 0 && playerChoice == 1)
				System.out.println("\nYou Won !!");
			else if (compChoice == 0 && playerChoice == 2)
				System.out.println("\nYou Lose !!");
			else if (compChoice == 1 && playerChoice == 0)
				System.out.println("\nYou Lose !!");
			else if (compChoice == 1 && playerChoice == 2)
				System.out.println("\nYou Won !!");
			else if (compChoice == 2 && playerChoice == 0)
				System.out.println("\nYou Won !!");
			else if (compChoice == 2 && playerChoice == 1)
				System.out.println("\nYou Loose !!");
			System.out.println("do you want to play again?? y/n");
		} while (player == "y");
	}
}