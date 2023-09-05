package myProject;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int randomNumber = rand.nextInt(100)+1;
		//System.out.println("Random number is "+randomNumber);
		int n=0;
		while(n<5) {
		System.out.println("Enter your guess (1 to 100):");
		int playerGuess = scanner.nextInt();
		if(playerGuess == randomNumber)
		  {
			System.out.println("Correct! you Win!");
			break;
		  }
		else if(randomNumber<playerGuess)
		  {
			System.out.println("The number is higher . Guess again");
			
		  }
		else
		  {
			System.out.println("The number is lower . Guess again");

	      }
		n++;
		if(n>=5) {
			System.out.println();
			System.out.println("The Guesses Number is "+randomNumber);
		}
			
		}
	  }
		
	}
 
