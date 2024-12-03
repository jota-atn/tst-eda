import java.util.Scanner;
import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		String[] entrada = sc.nextLine().split(" ");
		int[] v = toInt(entrada);

		int aux;

		for (int i = 0; i < v.length - 1; i += 2) {
			aux = v[i];
			v[i] = v[i+1];
			v[i+1] = aux;
		}

		System.out.println(Arrays.toString(v));
	}

	public static int[] toInt(String[] array) {
		int[] saida = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			saida[i] = Integer.parseInt(array[i]);
		}

		return saida;

	}
}

