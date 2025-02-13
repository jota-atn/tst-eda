import java.util.Scanner;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o tamanho do Array: ");
		int length = Integer.parseInt(sc.nextLine());

		int[] v = new int[length];

		for (int i = 0; i < length; i++)  
			v[i] = Integer.parseInt(sc.nextLine());

		System.out.print("Insira o maior elemento do Array: ");
		int maior = Integer.parseInt(sc.nextLine());

		System.out.println(Arrays.toString(v));

		int[] B = countingSort(v, maior);

		System.out.println(Arrays.toString(B));
	
	}

	private static int[] countingSort(int[] A, int k) {
	
		boolean[] C = new boolean[k];

		for (int i = 0; i < A.length; i++) 
			C[A[i] - 1] = true;

		int j = 0;
		int[] B = new int[A.length];

		for (int i = 0; i < C.length; i++) 
			if (C[i] == true) {
				B[j] = i + 1;
				j++;
			}

		return B;

	}
}
