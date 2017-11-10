import java.util.HashSet;
import java.util.Set;

public class TestArray2 {

	public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	public TestArray2() {
		System.out.println("\n===EXERCICE 2===");
		double sum = 0;
		for (int i : array) {
			sum += i;
		}
		System.out.println("Moyenne : " + sum / array.length);
		
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 15) {
				index = i;
			}
		}
		System.out.println("L'entier 15 est à l'index " + index);
		
		Set entiers = new HashSet<Integer>();
		int doublons = 0;
		for (int i : array) {
			if (entiers.contains(i)) {
				doublons++;
			} else {
				entiers.add(i);
			}
		}
		System.out.println("Il y a " + doublons + " entiers en double dans le tableau");
		
	}
	
}
