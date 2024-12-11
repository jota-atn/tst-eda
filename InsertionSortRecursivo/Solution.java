import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] v = toInt(entrada);

        insertionSort(v, 0, 0);

        System.out.println(Arrays.toString(v));

    }

    private static void insertionSort(int[] v, int i, int j) {
        while (j > 0 && v[j] < v[j - 1]) {
            swap(v, j, j-1);
            insertionSort(v, i + 1, j - 1);
        }
    }

    private static int[] toInt(String[] v) {
        int[] output = new int[v.length];

        for (int i = 0; i < v.length; i++)
            output[i] = Integer.parseInt(v[i]);

        return output;

    }

    private static void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

}
