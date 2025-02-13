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
			
		selectionSort(v);

		System.out.println(Arrays.toString(v));

	}

	private static void selectionSort(int[] v) {

		for (int i = 0; i < v.length; i++) { 
			int indiceMenor = i;
			for (int j = i + 1; j < v.length; j++) 
				if (v[j] < v[indiceMenor])
					indiceMenor = j;

			swap(v, i, indiceMenor);

		}
	}


	private static void swap(int[] v, int j, int i) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
