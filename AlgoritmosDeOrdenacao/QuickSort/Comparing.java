import java.util.Scanner;
import java.util.Arrays;

public class Comparing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o tamanho do Array: ");
		int length = Integer.parseInt(sc.nextLine());

		int[] v = new int[length];

		for (int i = 0; i < length; i++)
			v[i] = Integer.parseInt(sc.nextLine());

		System.out.println(Arrays.toString(v));
	
		quickSort(v, 0, v.length-1);

		System.out.println(Arrays.toString(v));

	}
		
	private static void quickSort(int[] v, int inicio, int fim) {
		if (inicio < fim) {
			int index = particionaHoare(v, inicio, fim);
			quickSort(v, inicio, index-1);
			quickSort(v, index+1, fim);
		}
	}

	private static int particionaHoare(int[] v, int inicio, int fim) {
		int i = inicio + 1;
		int j = fim;
		int pivot = v[inicio];

		while (i <= j) {

			while(i <= j && v[i] <= pivot) i++;

			while (i <= j && v[j] > pivot) j--;

			if (i < j)
				swap(v, i, j);

		}

		swap(v, inicio, j);

		return j;

	} 

	private static int particionaMediana(int[] v, int inicio, int fim) {
		
		int meio = (inicio + fim) / 2;

		int[] helper = {v[inicio], v[meio], v[fim]};
		Arrays.sort(helper);

		int index;

		if (helper[1] == v[inicio]) index = inicio;
		else if (helper[1] == v[meio]) index = meio;
		else index = fim;

		swap(v, inicio, index);

		index = inicio;
		int pivot = v[inicio];

		for (int i = inicio + 1; i <= fim; i++) 
			if (v[i] < pivot) 
				swap(v, ++index, i);

		swap(v, inicio, index);

		return index;

	}

	private static int particionaRandom(int[] v, int inicio, int fim) {

		int range = fim - inicio + 1;
		int randomIndex = (int) (Math.random() * range) + inicio;
	
		swap(v, inicio, randomIndex);

		int index = inicio;
		int pivot = v[inicio];

		for (int i = inicio+1; i <= fim; i++) 
			if (v[i] <= pivot)
				swap(v, ++index, i);

		swap(v, inicio, index);

		return index;

	}

	private static int particiona(int[] v, int inicio, int fim) {

		int index = inicio;
		int pivot = v[inicio];

		for (int i = inicio+1; i <= fim; i++)
			if (v[i] <= pivot) 
				swap(v, ++index, i);

		swap(v, inicio, index);

		return index;

	}

	private static void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
