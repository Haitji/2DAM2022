package AP1;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el numero de tu DNI: ");
		int num1 = s.nextInt();
		System.out.println(String.valueOf(num1)+calcularLetra(num1));
		
	}
    private static char calcularLetra(int dni){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return caracteres.charAt(resto);
   }

}
