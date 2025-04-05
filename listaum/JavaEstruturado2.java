package listaum;

import java.util.Scanner;

public class JavaEstruturado2 {
	
	public static void main(String[] args) {
		int cont = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		while(num >= 0) {
			num = sc.nextInt();
			if(num >= 5 && num <= 5000) {
				cont = cont + num;
			}
		}
		System.out.println(num);
		
		sc.close();
	}
}
