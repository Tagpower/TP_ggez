import java.util.Arrays;

public class TestArrayTri {

	public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	public TestArrayTri() {
		System.out.println("\n===EXERCICE 3===");
		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	
	}
}
