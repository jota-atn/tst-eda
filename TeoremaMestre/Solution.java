import java.util.Scanner;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int ord = sc.nextInt();
	
		System.out.println(theta(a, b, ord));

	}


	public static String theta(int a, int b, int ord) {

		int c = (int) (Math.log(a) / Math.log(b));

		if (ord < c) 
       return "T(n) = theta(n**" + c + ")";

    else if (ord == c)
       return "T(n) = theta(n**" + c + " * log n)";
    
		else
       return "T(n) = theta(n**" + ord + ")";
	}
}
