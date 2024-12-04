import java.util.Scanner;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] entrada = sc.nextLine().split(" ");

		System.out.println(encontraPrimeiroNegativo(entrada, 0));
	}
	
	public static String encontraPrimeiroNegativo(String[] array, int i) {

		if (i >= array.length) 
			return "-";

		if (Integer.parseInt(array[i]) < 0)
			return array[i];

		return encontraPrimeiroNegativo(array, i + 1);

	}
}
