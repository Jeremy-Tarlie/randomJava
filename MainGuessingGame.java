package random;

import java.util.Random;
import java.util.Scanner;

public class MainGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputNumber = new Scanner(System.in);
		Random random = new Random();
		GuessingGameLogic game = new GuessingGameLogic(random);
		while(game.win) {
			System.out.println("entrer un nombre");
			int number = inputNumber.nextInt();
			
		}
		
	}

}
