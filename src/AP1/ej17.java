package AP1;

import java.util.ArrayList;
import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		boolean mayuscula = false;
		boolean valido = false;
		ArrayList<Character> num = new ArrayList<>();
		ArrayList<Character> letra = new ArrayList<>();

		do {
			System.out.println("Introduce una contrasenya: ");
			String a = sc.nextLine();
			for (int i = 0; i < a.length(); i++) {
				if (Character.isDigit(a.charAt(i)))
					num.add(a.charAt(i));
			}

			for (int i = 0; i < a.length(); i++) {
				if (Character.isLetter(a.charAt(i)))
					letra.add(a.charAt(i));
				if (Character.isUpperCase(a.charAt(i))) {
					mayuscula = true;
				}



			}
			if (a.length() >= 5) {
				if (num.size() >= 1) {
					if (mayuscula) {
						System.out.println("Contrasenya valida.");
						valido = true;
					}else {
						System.out.println("Necesita minimo un mayuscula.");
					}
				} else {
					System.out.println("Necesita minimo un numero.");
				}
			} else {
				System.out.println("Necesitas 5 caracteres minimo.");
			}
		} while (!valido);

	}
}
