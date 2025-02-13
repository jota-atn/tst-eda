import java.util.Scanner;
import java.util.Arrays;

// Algotitmo de Ordenação - Insertion Sort
//
// Estabilidade - Estável;
// In-place - Não utiliza memória auxiliar proporcional a N;
// Eficiência - O(n2):
// 	- Faz mais trocas que o Selection Sort;
// 	- Menos comparações que o Selection Sort;

public class Solution {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o tamanho do Array:");
		int length = Integer.parseInt(sc.nextLine());

		int[] v = new int[length];

		for (int i = 0; i < length; i++) {
			v[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println(Arrays.toString(v));

		insertionSort(v);

		System.out.println(Arrays.toString(v));
		
	}

	private static void insertionSort(int[] v) {
		for (int i = 1; i < v.length; i++) {
			int j = i;
			insereOrdenado(v, j);
		}
	}

	private static void insereOrdenado(int[] v, int j) {
		while (j > 0 && v[j] < v[j-1]) {
			swap(v, j, j-1);
			j--;
		}
	}

	private static void swap(int v[], int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
 
}
