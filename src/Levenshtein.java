import java.util.ArrayList;
import java.util.Scanner;

public class Levenshtein {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre un premier mot :");
		String word1 = sc.nextLine();
		System.out.println("Entre un deuxième mot :");
		String word2 = sc.nextLine();
		
		int distance = 0;
		int n = word1.length();
		int m = word2.length();
		if (n == 0) {
			distance = m;
		} else if (m == 0) {
			distance = n;
		} else {
			int[][] mat = new int[n+1][m+1]; 
			for (int i = 0; i < Math.max(n+1, m+1); i++) { //Remplissage matrice M
				if (i < m+1) mat[0][i] = i;
				if (i < n+1) mat[i][0] = i;
			}
			
//			for (int i=0; i<n+1; i++) {
//				for (int j=0; j<m+1; j++) {
//					System.out.print(mat[i][j]+ " ");
//				}
//				System.out.println();
//			}
			
			int cout = 0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (word1.charAt(i) == word2.charAt(j)) {
						cout = 0;
					} else {
						cout = 1;
					}
					mat[i+1][j+1] = Math.min(Math.min(mat[i][j+1]+1, mat[i+1][j]+1), mat[i][j] + cout);
				}
			}
			
			distance = mat[n][m];
			
			
		}
		
		System.out.println("Distance de Levenshtein : "+ distance);
		
			
			
	}

}
