import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("===EXERCICE 5===\n"
				+ "Choisissez un rang de la suite de Fibonacci :");
		int rang = sc.nextInt();
		System.out.println("Rang "+ rang +" de la suite de Fibonacci = " + fibonacci(rang) );
		
	}

	private static int fibonacci(int rang) {
		if (rang == 0 || rang == 1) {
			return rang;
		} else if (rang > 1) { //Rang positif
			return fibonacci(rang-1) + fibonacci(rang-2);
		} else { //rang négatif
			return (int)Math.pow(-1, rang-1)*fibonacci(-rang);
		}
	}

}
