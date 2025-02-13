import java.util.Scanner;
import java.util.Arrays;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] v = toInt(sc.nextLine().split(" "));

		reverse(v);

		printArray(v);

	}

	private static void reverse(int[] v) {
		int meio, j;
		
		meio = v.length / 2;
		j = v.length - 1;

		for (int i = 0; i < meio; i++) {
			swap(v, i, j);
			j--;
		}
	}

	private static void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	private static int[] toInt(String[] v) {
		int[] output = new int[v.length];

		for (int i = 0; i < v.length; i++)
 			output[i] = Integer.parseInt(v[i]);
				
		return output;
		
	}
	
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) 
			if (i < array.length) 
				System.out.print(array[i] + " ");

		System.out.println(array[array.length-1]);

	}
}
