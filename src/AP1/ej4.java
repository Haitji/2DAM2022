package AP1;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int num1 = s.nextInt();
		System.out.print("Introduce el segundo numero: ");
		int num2 = s.nextInt();
		System.out.println("El numero mas grande es: "+ Math.max(num1,num2));
		System.out.println("El numero mas pequeño es: "+ Math.min(num1,num2));
		
	}

}
