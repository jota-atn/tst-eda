import java.util.Scanner;
import java.util.Arrays;

class Solution {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] entrada = sc.nextLine().split(" ");

		Arrays.sort(entrada);

		System.out.println(buscaDuplicatas(entrada));
	}

	public static boolean buscaDuplicatas(String[] v) {
		for (int i = v.length - 1; i > 0; i--) {
			if (Integer.parseInt(v[i]) == Integer.parseInt(v[i-1])) {
				return true;
			}			
		}
		return false;		
	}
}
