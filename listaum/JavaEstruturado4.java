package listaum;

import java.util.Scanner;

public class JavaEstruturado4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		boolean option = false;
		
		while(option == false) {
			if(num1 == 1) {
				System.out.println(num2+num3);
				
				option = true;
				
			} else if(num1 == 2) {
				System.out.println(num2-num3);
				
				option = true;
				
			} else if(num1 == 3) {
				System.out.println(num2*num3);
				
				option = true;
				
			} else if(num1 == 4) {
				if(num2 == 0 || num3 == 0) {
					System.out.println("DIV ZERO");
				} else {
					System.out.println(num2/num3);
				}
				
				option = true;
				
			} else {
				System.out.println("OPC ERRADA");
				num1 = sc.nextInt();
			}
			
			sc.close();
		}
	}
}
