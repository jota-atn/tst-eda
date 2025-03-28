import java.util.Scanner; 

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BST tree = new BST();

        String[] inputs = sc.nextLine().split(" ");

        for (String input : inputs) 
            tree.add(Integer.parseInt(input));
        
        System.out.println(tree.somaFolhas());

        sc.close();

    }
}

class BST {

    public Node root;

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
    }

    public int somaFolhas() {
        return somaFolhas(this.root);
    }

    private int somaFolhas(Node current) {
        if (current == null) return 0;

        if (current.isLeaf()) return current.value;

        return somaFolhas(current.left) + somaFolhas(current.right);
    }

}

class Node {

    int value;
    Node left, right, parent;

    public Node(int value) {
        this.value = value;
        this.left = this.right = this.parent = null;
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }

}