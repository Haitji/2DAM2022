package AP1;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		int num1;
		int num2;
		do {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce el primer numero: ");
			num1 = s.nextInt();
			System.out.print("Introduce el segundo numero: ");
			num2 = s.nextInt();
			if(num1 == num2) {
				System.out.print("Los numeros coincide.Fin del programa.");
			}else {
				System.out.println("Los numeros no coincide, vuelva a intentarlo.");
			}
		}while(num1 != num2);

		
	}

}
