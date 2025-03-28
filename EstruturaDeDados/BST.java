public class BST {

    public Node root;
    private int size;

    public boolean isEmpty() {
        return this.root == null;
    }
    
    public void add(int element) {
        
        Node newNode = new Node(element);

        if (isEmpty()) {
            this.root = newNode;
        }

        else {

            Node aux = this.root;

            while (aux != null) {

                if (element < aux.value) {
                    if (aux.left == null) {
                        newNode.parent = aux;
                        aux.left = newNode;
                        return;
                    }
                    
                    aux = aux.left;

                }

                else {
                    
                    if (aux.right == null) {
                        newNode.parent = aux;
                        aux.right = newNode;
                        return;
                    }
                    
                    aux = aux.right;
                }

            }

        }

        this.size++;

    }

    public void recursiveAdd(int element) {
        if (isEmpty()) this.root = new Node(element);

        recursiveAdd(element, this.root);
    }

    private void recursiveAdd(int element, Node current) {
        if (element < current.value) 
            if (current.left == null)
                current.left = new Node(element);

            else recursiveAdd(element, current.left);

        else {
            if (current.right == null)
                current.right = new Node(element);

            else recursiveAdd(element, current.right);
        }
    }
    
   
    public Node search(int element) {

        Node aux = this.root;

        while (aux != null) {

            if (aux.value == element)
                return aux;

            else if (element < aux.value)
                aux = aux.left;

            else 
                aux = aux.right;

        }

        return null;

    }

    public int height() {
        return height(this.root);
    }

    private int height(Node current) {
        if (current == null) return -1;

        return 1 + Math.max(height(current.left), height(current.right));
    }

    public boolean equals(BST outra) {
        return equalsRecursive(this.root, outra.root);
    }

    private boolean equalsRecursive(Node node1, Node node2) {
        if (node1 == null && node2 == null) return true;

        if (node1 == null || node2 == null) return false;

        if (node1.value != node2.value) return false;

        return equalsRecursive(node1.left, node2.left) && equalsRecursive(node1.right, node2.right);

    }

    public int contaFolhas() {
        return contaFolhas(this.root);
    }

    private int contaFolhas(Node current) {

        if (current.left == null && current.right == null) return 1;

        return contaFolhas(current.left) + contaFolhas(current.right);

    }

    public int size() {
        return this.size;
    }   

    public Node predecessor(int elemento) {

        if (isEmpty()) return null;

        Node busca = search(elemento);

        if (busca == null) return null;
        
        if (busca.left != null) return maximo(busca.left);

        Node aux = busca.parent;

        while (aux != null && aux.value > busca.value)
            aux = aux.parent;

        return aux;

    }

    public Node maximo(Node current) {
        if (current.right == null) return current;

        return maximo(current.right);

    }

    public Node sucessor(int elemento) {

        if (isEmpty()) return null;

        Node busca = search(elemento);

        if (busca == null) return null;

        if (busca.right != null) return minimo(busca.right);

        Node aux = busca.parent;
        
        while (aux != null && aux.value < busca.value)
            aux = aux.parent;

        return aux;

    }

    public Node minimo(Node current) {
        if (current.left == null) return current;
        
        return minimo(current.left);

    }

    public void remove(int elemento) {

        Node toRemove = search(elemento);

        if (toRemove != null) {
            remove(toRemove);
            this.size -= 1;
        }
    }

    private void remove(Node toRemove) {

        if (toRemove.isLeaf()) {
            if (toRemove == this.root)
                this.root = null;

            else if (toRemove.value < toRemove.parent.value) 
                toRemove.parent.left = null;

            else
                toRemove.parent.right = null;

        }

        else if (toRemove.hasOnlyLeftChild()) {
            if (toRemove.value == this.root.value) {
                this.root = toRemove.left;
                this.root.parent = null;
            }

            else {
                toRemove.left.parent = toRemove.parent;
                if(toRemove.value < toRemove.parent.value) 
                    toRemove.parent.left = toRemove.left;
                else 
                    toRemove.parent.right = toRemove.left;
            }
        }

        else if (toRemove.hasOnlyRightChild()) {
            if (toRemove.value == this.root.value) {
                this.root = toRemove.right;
                this.root.parent = null;
            }

            else {
                toRemove.right.parent = toRemove.parent;
                if (toRemove.value < toRemove.parent.value)
                    toRemove.parent.left = toRemove.right;

                else 
                    toRemove.parent.right = toRemove.right;
            }
        }

        else {
            Node sucessor = sucessor(toRemove.value);
            toRemove.value = sucessor.value;
            remove(sucessor);
        }
    }
}


class Node {
    
    int value;
    Node left;
    Node right;
    Node parent;
    
    Node(int v) {
        this.value = v;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public boolean hasOnlyLeftChild() {
        return (left != null) && (right == null);
    }

    public boolean hasOnlyRightChild() {
        return (left == null) && (right != null);
    }
    
}
