
public class TestArray1 {

	public static int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	public TestArray1() {
		
		System.out.println("===EXERCICE 1===");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();	
		
		for (int j = array.length-1; j>0; j--) {
			System.out.print(array[j] + " ");
		}
		System.out.println();	
		
		for (int i : array) {
			if (i > 3) {
				System.out.print(i + " ");
			}
		}
		System.out.println();	
		
		for (int i : array) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		int max = Integer.MIN_VALUE;
		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println("Plus grand nombre : " + max);
		
		int min = Integer.MAX_VALUE;
		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("Plus petit nombre : " + min);
	}
}
