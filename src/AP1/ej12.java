package AP1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Notas notas = new Notas();
		int correct=0;
		do {
			
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce la nota: ");
			int num1 = s.nextInt();

			if(num1<0||num1>10) {
				System.out.println("La nota introducido debe estar entre el 0 y el 10: ");
			}else {
				notas.clasificar(num1);
			correct++;
			}
			
		}while(correct<10);
		System.out.println("suspendidos: ");
		System.out.println(notas.getSuspensos());
		System.out.println("aprovados: ");
		System.out.println(notas.getAprobados());
		System.out.println("notables: ");
		System.out.println(notas.getNotables());
		System.out.println("sobresalientes: ");
		System.out.println(notas.getSobresalientes());
		System.out.println("matricula: ");
		System.out.println(notas.getMatrícula());
		
	}

}
