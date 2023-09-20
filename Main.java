package random;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		//random Double
		//generer un nombre aleatoire 0 / 1
		double randomNumber = random.nextDouble();
		System.out.println(randomNumber);
		
		//random Int
		int randomInt = random.nextInt(10);
		System.out.println(randomInt);
	}

}
