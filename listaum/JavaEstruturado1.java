package listaum;

import java.util.Scanner;

public class JavaEstruturado1 {
	
	public static int fatorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("MENOR QUE ZERO");
		} else if(num > 16) {
			System.out.println("OVERFLOW");
		} else {
			System.out.println(fatorial(num));
		}
		
		sc.close();
	}
}
