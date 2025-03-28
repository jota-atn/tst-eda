import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;


class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BST tree = new BST();

        String[] inputs = sc.nextLine().split(" ");

        for (String input : inputs) 
            tree.add(Integer.parseInt(input));

        tree.DFS();
        System.out.println();

        sc.close();

    }

}

class BST {

    public Node root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(int elemento) {

        Node newNode = new Node(elemento);

        if (isEmpty()) this.root = newNode;


        else {

            Node aux = this.root;
            
            while (aux != null) {

                if (elemento < aux.value) {
     
                    if (aux.left == null) { 
                        aux.left = newNode;
                        return;
                    }
     
                    aux = aux.left;
                }

                else {

                    if (aux.right == null) {
                        aux.right = newNode;
                        return;
                    }

                    aux = aux.right;

                }
            }
        }
    }

    public void DFS() {
		
        LinkedList<Node> fila = new LinkedList();;

        if (!isEmpty()) {
            fila.addLast(this.root);
            
            boolean first = true;
            while (!fila.isEmpty()) {
                Node current = fila.removeFirst();

                if (first)
                    System.out.print(current.value);

                else 
                    System.out.print(" " + current.value);

                first = false;

                if (current.right != null) 
                    fila.addLast(current.right);

                if (current.left != null) 
                    fila.addLast(current.left);

            }

        }

	}
}
      

class Node {

    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = this.right = null;
    }

}