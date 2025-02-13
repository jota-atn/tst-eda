import java.util.Scanner;
import java.util.Arrays;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] entrada = sc.nextLine().split(",");

		sc.close();

		insertionSort(entrada);
	
	}

	public static void insertionSort(String[] v) {
		printArray(v);
		for (int i = 1; i < v.length; i++) {
			int j = i;
			insereOrdenado(v, j);
			printArray(v);
		}
	}

	public static void insereOrdenado(String[] v, int j) {
		while (j > 0 && v[j].compareTo(v[j-1]) < 0) {
			swap(v, j, j-1);
			j--;
		}
	}

	private static void swap(String[] v, int i, int j) {
		String aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	private static void printArray(String[] v) {
		String output = "";

		for (int i = 0; i < v.length; i++) {
			if (i < v.length - 1) 
				output += (v[i] + ", ");

			else 
				output += (v[i] + "\n");
		}

		System.out.print(output);

	}
}
