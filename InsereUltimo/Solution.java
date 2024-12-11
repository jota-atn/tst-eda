import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");

        int[] v = toInt(entrada);

        insertInOrder(v);

        System.out.println(Arrays.toString(v));
    }

    public static int[] toInt(String[] v) {
        
        int[] output = new int[v.length];

        for (int i = 0; i < v.length; i++)
            output[i] = Integer.parseInt(v[i]);

        return output;

    }

    public static void insertInOrder(int[] v) {
        int aux = 0;

        int i = v.length - 1;

        while (i > 0 && v[i] < v[i-1]) {
            aux = v[i];
            v[i] = v[i-1];
            v[i-1] = aux;
            i--;
        }
    }
}
