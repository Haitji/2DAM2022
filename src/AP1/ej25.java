package AP1;

import java.util.Scanner;

public class ej25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = (int) (Math.random() * 10 + 1);
		int numero2;
		int numero3;
		int numero4;
		Scanner sc = new Scanner(System.in);
		String entrada="";
		boolean salir = false;
		do {
			numero2 = (int) (Math.random() * 10 + 1);
			numero3 = (int) (Math.random() * 10 + 1);
			numero4 = (int) (Math.random() * 10 + 1);
			do {
				System.out.println("Plusa enter para continuar.");
				entrada = sc.nextLine();
				System.out.println(entrada);
			} while (!entrada.equals(""));

			System.out.println("Tus numeros: "+numero2 +" - "+ numero3+" - "+numero4+"\nEl numero aleatorio: "+ numero);
			if (numero==numero2||numero==numero3||numero==numero4) {
				salir = true;
				System.out.println("Has acertado.");
			}else {
				System.out.println("Intentalo de nuevo.");
			}
			

		} while (salir == false);

	}

}
