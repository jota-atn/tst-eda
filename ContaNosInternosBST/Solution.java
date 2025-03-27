import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BST tree = new BST();

        String[] inputs = sc.nextLine().split(" ");

        for (String input : inputs) 
            tree.add(Integer.parseInt(input));

        System.out.println(tree.somaNosInternos());

        sc.close();

    }

}

class BST {

    Node root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(int element) {

        Node newNode = new Node(element);

        if (isEmpty()) this.root = newNode;
        

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

    public int somaNosInternos() {
        return contaNaoFolhas(this.root);
    }

    private int contaNaoFolhas(Node current) {
        if (current == null) 
            return 0;
    
        int count = 0;
        if (!current.isLeaf()) {
            count++; 
        }
    
        return count + contaNaoFolhas(current.left) + contaNaoFolhas(current.right);
    }

}

class Node {

    public int value;
    public Node parent, left, right;

    public Node(int value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }
}