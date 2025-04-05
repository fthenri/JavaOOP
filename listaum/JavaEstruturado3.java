package listaum;

import java.util.Scanner;

public class JavaEstruturado3 {
	
	public static void main(String[] args) {
		double num1;
		double num2;
		double num3;
		double num4;
		double num5;
		double MA;
		double MG;
		double MH;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		num5 = sc.nextDouble();
		
		MA = (num1 + num2 + num3 + num4 + num5)/5.0;
		MG = Math.pow(num1 * num2 * num3 * num4 * num5, 1.0 / 5.0);
		MH = 5/((1/num1)+ (1/num2)+ (1/num3)+ (1/num4)+ (1/num5));
		
		System.out.println(MA);
		System.out.println(MG);
		System.out.println(MH);
		
		sc.close();
	}
}
