import java.util.Scanner;
import java.util.Arrays;

// Algoritmos de Ordenação - Merge Sort
//
// Divisão e Conquista
//
// Eficiência - O(n*log n)
//

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
	//	System.out.print("Insira o tamanho do Array: ");
		//int length = Integer.parseInt(sc.nextLine());

		//int[] v = new int[length];

	//	for (int i = 0; i < length; i++) 
//			v[i] = Integer.parseInt(sc.nextLine());

		int[] v = {2, 8, 11, 20, 30, 47, 51, 7, 17, 20, 25, 40, 70, 90};

		int ini = 0;
		int fim = v.length - 1;
		int meio = (ini + fim) / 2;

		System.out.println(Arrays.toString(v));

		mergeSort(v, ini, fim);

		System.out.println(Arrays.toString(v));
			
	}

	private static void mergeSort(int[] v, int inicio, int fim) {
			if (inicio >= fim) 
				return;

			else {

			int meio = (inicio + fim) / 2;
				
				mergeSort(v, inicio, meio);
				mergeSort(v, meio+1, fim);

				merge(v, inicio, meio, fim);
			}
	}

	private static void merge(int[] v, int inicio, int meio, int fim) {
		int[] helper = new int[v.length];

		for (int i = inicio; i <= fim; i++) 
			helper[i] = v[i];
	
		int i = inicio, j = meio + 1, k = inicio;
	
		while (i <= meio && j <= fim) {
			System.out.println(v[k]);
			if (helper[i] <= helper[j]) {
				v[k] = helper[i];
				i++;
			}

			else {
				v[k] = helper[j];
				j++;
			}

			k++;
				
		}

		while (i <= meio) {
			v[k] = helper[i];
			i++; k++;
		}

	}
}
