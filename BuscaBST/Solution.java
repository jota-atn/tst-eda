// Código errado, achei que fosse uma busca binaria em um array ordenado :/


import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] v = mapToInt(sc.nextLine().split(" "));
		int n = sc.nextInt();

		System.out.println(Arrays.toString(binarySearchTree(v, n)));
	}

	public static int[] binarySearchTree(int[] array, int n) {
		
		List<Integer> output = new ArrayList<>();

		int inicio = 0; int fim = array.length - 1;

		do {
			int meio = (inicio + fim) / 2;
		
			output.add(array[meio]);
			
			if (array[meio] == n)
				break;

			else if (n < array[meio])
				fim = meio - 1;

			else
				inicio = meio + 1;
		} 

		while (inicio <= fim);

		return toArray(output);
	}

	public static int[] mapToInt(String[] v) {
		
		int[] output = new int[v.length];

		for (int i = 0; i < v.length; i++) {
			output[i] = Integer.parseInt(v[i]);
		}

		return output;

	}

	public static int[] toArray(List<Integer> list) {

		int[] output = new int[list.size()];

		for (int i = 0; i < output.length; i++) {
			output[i] = list.get(i);
		}

		return output;

	}
} 
