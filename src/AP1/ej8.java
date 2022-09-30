package AP1;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el numero del mes: ");
		int num1 = s.nextInt();
		if (num1 == 1) {
			System.out.println("Enero");
		} else if (num1 == 2) {
			System.out.println("Febrero");
		} else if (num1 == 3) {
			System.out.println("Marzo");
		} else if (num1 == 4) {
			System.out.println("Abril");
		} else if (num1 == 5) {
			System.out.println("Mayo");
		} else if (num1 == 6) {
			System.out.println("Junio");
		} else if (num1 == 7) {
			System.out.println("Julio");
		} else if (num1 == 8) {
			System.out.println("Agosto");
		} else if (num1 == 9) {
			System.out.println("Septiembre");
		} else if (num1 == 10) {
			System.out.println("Octubre");
		} else if (num1 == 11) {
			System.out.println("Noviembre");
		} else if (num1 == 12) {
			System.out.println("Diciembre");
		} else {
			System.out.println("Mes introducido no valido");
		}
	}

}
