import java.util.*;

public class AddTwoMatrices{
	public static void main(String[] args) {
		int m,n;
		Scanner input = new Scanner(System.in);
		System.out.print("Input size mxn of 2 matrices:\nInput m: ");
		m = input.nextInt();
		System.out.print("Input n: ");
		n = input.nextInt();

		int[][] first_matrix = new int[m][n];
		int[][] second_matrix = new int[m][n];
		int[][] matrix_sum = new int[m][n];
		System.out.println("Input 1st array:");
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				System.out.printf("Input first matrix[%d][%d]: ",i,j);
				first_matrix[i][j] = input.nextInt();
			}
		}
		System.out.println("Input 1st array:");
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				System.out.printf("Input second matrix[%d][%d]: ",i,j);
				second_matrix[i][j] = input.nextInt();
			}
		}

		System.out.println("Sum of two matrices is: ");
		for (int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				matrix_sum[i][j] = first_matrix[i][j] + second_matrix[i][j];
				System.out.print(matrix_sum[i][j]+" ");
			}
			System.out.println();
		}

	}
}