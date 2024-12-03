import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        String n = sc.next();
    
        System.out.println(buscaLinearRecursiva(n, entrada, 0));

    }

    public static int buscaLinearRecursiva(String n, String[] entrada, int inicio) {
        
        int i = inicio;

        if (i >= entrada.length) {
            return -1;
        }
        
        if (entrada[i].equals(n)) {
            return i;
        }

        return buscaLinearRecursiva(n, entrada, i + 1);
        
    }
}
