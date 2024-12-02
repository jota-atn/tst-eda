import java.util.Scanner;
import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] v1 = sc.nextLine().split(" ");
		String[] v2 = sc.nextLine().split(" ");

		System.out.println(buscaElementoSobrando(v1, v2));
	
	}

	public static String buscaElementoSobrando(String[] v1, String[] v2) {

		boolean achou;

		for (int i = 0; i < v2.length; i++) {
			
			achou = false;

			for (int j = 0; j < v1.length; j++) {
				if (v2[i].equals(v1[j])) {
					achou = true;
				}
			}
			
			if (!achou) {
				return v2[i];
			}

		}

		return "-1";

	}
}
