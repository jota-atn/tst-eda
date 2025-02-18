import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);

				System.out.print("Informe o tamanho da pilha: ");
				Pilha pilha = new Pilha(Integer.parseInt(sc.nextLine()));

				String menu = """
					1-Push
					2-Pop
					3-Peek
					4-isEmpty
					5-isFull
					6-Exibir Pilha
					7-Sair""";

				boolean run = true;
				while (run) {
					
					System.out.println(menu);

					String opcao = sc.nextLine();
					
					switch(opcao) {
						case "1":
							System.out.print("Insira o elemento a ser adicionado a pilha: ");
							int elemento = Integer.parseInt(sc.nextLine());
							pilha.push(elemento);
							System.out.println("Feito!");
							break;
						case "2":
							pilha.pop();
							System.out.println("Feito!");
							break;
						case "3":
							System.out.println(pilha.peek());
							break;
						case "4":
							if (pilha.isEmpty()) System.out.println("Vazia.");
							else System.out.println("A pilha não está vazia.");
							break;
						case "5":
							if (pilha.isFull()) System.out.println("Cheia.");
							else System.out.println("A pilha não está cheia.");
							break;
						case "6":
							System.out.println(pilha.toString());
							break;
						case "7":
							run = false;
							break;
						default:
							System.out.println("Insira uma opção válida!");
							break;
					}
				} 

				sc.close();

    }
}
