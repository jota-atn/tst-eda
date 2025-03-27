import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        
        String[] values = sc.nextLine().split(" ");
        int alvo = Integer.parseInt(sc.nextLine());
        
        for (String value : values) {
            tree.add(Integer.parseInt(value));
        }

        ArrayList<Integer> caminho = new ArrayList<>();
        
        Node busca = tree.search(alvo);
        Node current = busca;

        //Quando tem elementos à esquerda 
        if (current.left != null) {

            caminho.add(current.value);

            current = current.left;

            while (current != null) {
                caminho.add(current.value);
                current = current.right;
            }
        }

        //Quando não tem elementos à esquerda
        else {

            caminho.add(current.value);

            current = current.parent;

            while (current != null && current.value > busca.value) {
                caminho.add(current.value);
                current = current.parent;
            }

            caminho.add(current.value);

        }

        System.out.println(caminho);
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

    public Node search(int elemento) {

        Node aux = this.root;

        while (aux != null) {

            if (aux.value == elemento)
                return aux;

            else if (aux.value < elemento)
                aux = aux.right;

            else
                aux = aux.left;

        } 

        return aux;

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
        while (current.right != null) {
            current = current.right;
        }
        return current;
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

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}