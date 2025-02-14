public class Main {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(5);

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println(pilha.toString());
        System.out.println(pilha.isFull());

        pilha.pop();

        System.out.println(pilha.toString());
        System.out.println(pilha.isFull());

        pilha.pop();

        System.out.println(pilha.toString());
        System.out.println(pilha.isFull());

        pilha.push(12);
        pilha.push(14);

        System.out.println(pilha.toString());
        System.out.println(pilha.isFull());

    }
}
