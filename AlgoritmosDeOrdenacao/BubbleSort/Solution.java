import java.util.Scanner;
import java.util.Arrays;

// Algoritmo de Ordenação - Bubble Sort
//
// Estabilidade - Estável;
// In-place - Não utiliza memória auxiliar proporcional a N;
// Eficiência - O(n2):
// 	-Muitas trocas;
// 	-Muitas comparações.

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o tamanho do Array: ");
		int length = Integer.parseInt(sc.nextLine());

		int[] v = new int[length];

		for (int i = 0; i < length; i++) {
			v[i] = Integer.parseInt(sc.nextLine());
		}

		System.out.println(Arrays.toString(v));

		bubbleSort(v);

		System.out.println(Arrays.toString(v));

	}

	private static void bubbleSort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length - i - 1; j++) {
				if (v[j] > v[j + 1])
					swap(v, j, j+1);
			}
		}
	}

	private static void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
