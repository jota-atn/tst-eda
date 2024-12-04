import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();

		System.out.println(potenciaRecursiva(i, j));

	}
	
	public static int potenciaRecursiva(int n1, int n2) {

		if (n2 == 1)
			return n1; 

		if (n2 == 0)
			return 1;

		return n1 * potenciaRecursiva(n1, n2 - 1);

	}
}
