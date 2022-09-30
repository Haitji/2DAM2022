package AP1;

import java.util.Scanner;

public class ej33 {

	public static void main(String[] args) {
		int acum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int nom = s.nextInt();
		for(int i=0;i<nom;i++) {
			if(i%2==0) {
				acum +=i;
			}
		}
		System.out.print("La suma de los numeros pares es: "+acum);
	}

}
