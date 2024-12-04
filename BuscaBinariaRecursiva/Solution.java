import java.util.Scanner;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");

		int n = sc.nextInt();

		int[] v = arrayOfInts(input);

	  buscaBinariaRecursiva(v, n, 0, v.length - 1);

		sc.close();

	}

	public static int buscaBinariaRecursiva(int[] v, int n, int inicio, int fim) {	
	
		if (inicio > fim) {
			System.out.println("-1"); 
			return -1;
		}

		int meio = (inicio + fim) / 2;

		System.out.println(meio);

		if (v[meio] == n)
			return meio;

		else if (n < v[meio])
			return buscaBinariaRecursiva(v, n, inicio, meio - 1);

		else 
			return buscaBinariaRecursiva(v, n, meio + 1, fim);

	}

	public static int[] arrayOfInts(String[] v) {

		int[] output = new int[v.length];

		for (int i = 0; i < v.length; i++) {
			output[i] = Integer.parseInt(v[i]);
		}

		return output;

	}
}
