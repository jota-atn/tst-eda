import java.util.Scanner;
import java.util.Stack;

class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String[] v = sc.nextLine().split(" ");
		int index = sc.nextInt();

		Stack<Integer> pilha = new Stack<>();

		for (String num : v) {
			pilha.push(Integer.parseInt(num));
		}
		
		System.out.println(buscaElementoStack(pilha, index));

	}

	public static String buscaElementoStack(Stack<Integer> pilha, int index) {
			Stack<Integer> pilhaAux = new Stack<>();	

			int len = pilha.size();

			if (index < 0 || index >= len) {
				return "indice invalido";
			}

			for (int i = 0; i < len; i++) {
				pilhaAux.push(pilha.pop());
			}
			
			if (!pilhaAux.empty()) {
				for (int i = 0; i < index; i++) {
					pilhaAux.pop();	
				}

				return pilhaAux.peek().toString();

			}

			return null;
	}
}
