package AP1;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int acum=0;
		for (int i = 0; i < 5 ;i++) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce el numero: ");
			num = s.nextInt();
			acum += num;
		}
		System.out.println("La suma total es: "+ acum);
	}

}
