import java.util.Scanner;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] entrada = sc.nextLine().split(" ");
			
		int[] v = arrayOfInts(entrada);

		System.out.println(buscaQuebraSequencia(v, 0));
	}

	public static int buscaQuebraSequencia(int[] v, int i) {

		if (i >= v.length - 1) {
			return -1;
		}
		
		if (i == 0) {
			return v[i] > v[i + 1] ? (i + 1): buscaQuebraSequencia(v, i + 1);
		}


		if (v[i] > v[i + 1]) {
			return i + 1;
		}

		return buscaQuebraSequencia(v, i+1);

	}

	public static int[] arrayOfInts(String[] array) {
		
		int[] output = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			output[i] = Integer.parseInt(array[i]);
		}

		return output;

	}
}
