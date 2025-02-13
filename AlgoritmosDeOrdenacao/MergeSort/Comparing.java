import java.util.Scanner;
import java.util.Arrays;

public class Comparing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o tamanho do Array: ");
		int length = Integer.parseInt(sc.nextLine());

		int[] v = new int[length];

		for (int i = 0; i < v.length; i++) 
			v[i] = Integer.parseInt(sc.nextLine());

		System.out.println(Arrays.toString(v));

		mergeSort(v, 0, v.length-1);

		System.out.println(Arrays.toString(v));

	}

	public static void mergeSort(int[] v, int inicio, int fim) {
		if (inicio >= fim) {
			return;
		}

		else {
			int meio = (inicio + fim) / 2;
			mergeSort(v, inicio, meio);
			mergeSort(v, meio+1, fim);

			merge(v, inicio, meio, fim);
		}
		

	}

	public static void merge(int[] v, int inicio, int meio, int fim) {

		int[] helper = new int[v.length];

		for (int i = 0; i <= fim; i++) 
			helper[i] = v[i];

		int i = inicio;
		int j = meio + 1;
		int k = inicio;

		while (i <= meio && j <= fim) {

			if (helper[i] < helper[j]) { 
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
