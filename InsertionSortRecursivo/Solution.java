import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] v = toInt(entrada);

        insertionSort(v, v.length);

    }

    private static void insertionSort(int[] v, int n) {
			if (n <= 1)
				return;

			insertionSort(v, n-1);

			int indiceUltimo = v[n - 1];
      int j = n - 2;

			while (j >= 0 && v[j] > indiceUltimo) {
					v[j + 1] = v[j];
					j--;
			}

			v[j + 1] = indiceUltimo;

			if (n > 1) {
					System.out.println(Arrays.toString(v));
			}
		}	

		private static int[] toInt(String[] v) {
        int[] output = new int[v.length];

        for (int i = 0; i < v.length; i++)
            output[i] = Integer.parseInt(v[i]);

        return output;

    }
}


