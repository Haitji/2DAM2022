package AP1;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int acum=0;
		int cont=0;
		do {
			
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce el numero: ");
			num = s.nextInt();
			acum += num;
			cont++;
		}while(cont<5);
		System.out.println("La suma total es: "+ acum);
	}

}
