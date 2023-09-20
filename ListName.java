package random;

import java.util.Random;
import java.util.Scanner;

public class ListName {

    public static void main(String[] args) {
        try {
            Scanner listName = new Scanner(System.in); 
            Random random = new Random();
            System.out.println("Entrer une liste de noms séparés par des virgules :");
            System.out.println("Exemple : Louis, Baptiste, Jérémy, etc...");
            String input = listName.nextLine();
            
            // Diviser la chaîne en un tableau de noms en utilisant la virgule comme délimiteur
            String[] names = input.split(",");
            
            System.out.println("");
            System.out.println("Le gagnant est :");
            //J'affiche le nom qui sort et le trim sert à enlever les espaces
            System.out.println(names[random.nextInt(names.length)].trim());
            
            listName.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
