import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BST tree = new BST();

        String[] inputs = sc.nextLine().split(" ");

        for (String input : inputs) 
            tree.add(Integer.parseInt(input));

        sc.close();

    }

}