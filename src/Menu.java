import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	private static ArrayList<Integer> nombres;

	public static void main(String[] args) {
		nombres = new ArrayList<Integer>();
		System.out.println("===EXERCICE 4===");
		while (true) {
			callMenu();			
		}
	}
	
	public static void callMenu() {
		System.out.println("\nEntrez une option :\n"
				+ "1) Ajouter un nombre\n"
				+ "2) Voir les nombres entrés");
		
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		
		switch (choix) {
		case 1:
			System.out.println("Entrez un nombre :");
			int nombre = sc.nextInt();
			nombres.add(nombre);
			break;
		case 2:
			System.out.println("Voici les nombres entrés :");
			for (int i : nombres) {
				System.out.print(i + " ");
			}
			break;
		default:
			System.out.println("Entrez une option valide.");
		}
	}

}
