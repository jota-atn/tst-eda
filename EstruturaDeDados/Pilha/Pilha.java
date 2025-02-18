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

    @Override
    public String toString() {
        return geraToString();
    }

    private String geraToString() {

        String output = "";

        for (int i = 0; i <= topo; i++) 
            output += (this.pilha[i] + "\n");

        return output;

    }
}
