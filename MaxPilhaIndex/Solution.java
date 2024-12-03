import java.util.Scanner;
import java.util.Stack;

class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> pilha = new Stack<>();

		String[] input = sc.nextLine().split(" ");
		int limite = sc.nextInt();
		
		for (String num : input) {
			pilha.push(Integer.parseInt(num));
		}
	
		System.out.println(buscaMaiorStack(pilha, limite));
		
	}

	public static int whosBigger(int a, int b) {
		return a > b ? a : b;
	}

	public static int buscaMaiorStack(Stack<Integer> pilha, int limite) {
	
		Stack<Integer> aux = new Stack<>();
	
		for (int i = 0; i <= limite; i++) {
			aux.push(pilha.pop());
		}

		int maior = 0;
		int len = aux.size();

		for (int i = 0; i < len; i++) {
			maior = whosBigger(maior, aux.pop());
		} 

		return maior;
	
	}
}
