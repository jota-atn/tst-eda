import java.util.Scanner;
import java.util.Arrays;

class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String[] entrada = sc.nextLine().split(" ");

		int[] v = toInt(entrada);

		moveN(v);

	}

	public static void moveN(int[] v) {
		
		int controle = 0;

		while (controle < v.length - 1) {

			for (int i = 0; i < v.length - 1; i++) { 
				if (v[i + 1] < v[i]) {
					swap(v, i+1, i);
					System.out.println(Arrays.toString(v));
					break;
				}

				controle = i;
				
			}

			controle++;

		}
	}



	public static void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
	public static int[] toInt(String[] v) {
		int[] output = new int[v.length];

		for (int i = 0; i < v.length; i++) 
			output[i] = Integer.parseInt(v[i]);

		return output;

	}
}
