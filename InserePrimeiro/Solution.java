import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] v = toInt(entrada);

        inserePrimeiro(v);

        System.out.println(Arrays.toString(v));

    }

    private static void inserePrimeiro(int[] v) {
        int i = 0;

        while (i < v.length - 1 && v[i+1] < v[i]) {
            int aux = v[i+1];
            v[i+1] = v[i];
            v[i] = aux;
            i++;
        }
    }

    private static int[] toInt(String[] v) {
        int[] output = new int[v.length];

        for (int i = 0; i < v.length; i++)
            output[i] = Integer.parseInt(v[i]);

        return output;

    }
}
