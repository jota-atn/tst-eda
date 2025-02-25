public class Pilha {

    private int topo; 
    private int[] pilha;
    private final int CAPACIDADE = 10;

    public Pilha(int capacidade) {
        this.topo = -1;
        this.pilha = new int[capacidade];
    }

    public Pilha() {
        this.topo = -1;
        this.pilha = new int[CAPACIDADE];
    }

    public void push(int e) {
      if (isFull()) 
				throw new RuntimeException("Pilha Cheia!");
			this.pilha[++topo] = e;
    }

    public void pop() {
			if (isEmpty())
				throw new RuntimeException("Pilha Vazia!");
        topo--;
    }

		public int peek() {
			if (isEmpty()) 
				throw new RuntimeException("Pilha Vazia!");
			return pilha[topo];
		}

    public boolean isEmpty() {
        return this.topo == -1;
    }

    public boolean isFull() {
        return this.topo + 1 == pilha.length; 
    }

    public int indexOf(int valor) {
        Pilha helper = new Pilha(pilha.length);
        for (int i = 0; i < topo; i++) {
            if (pilha[i] == valor)
                return i; 
        }

        return -1;

    }

    public int size() {
        int contador = 0;
        for (int i = 0; i <= topo; i++) {
            contador++;
        }
        return contador;
    }

    @Override
    public String toString() {
        return geraToString();
    }

    private String geraToString() {

        String output = "";

        for (int i = topo; i >= 0; i--) {
            if (i > 0)
                output += (this.pilha[i] + ", ");
            else
                output += (this.pilha[i]);
        }

        return output;

    }
}
