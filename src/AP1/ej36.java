package AP1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ej36 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner sc= new Scanner (System.in);
		int acum=0;
		for(int i=0;i<5;i++) {
			System.out.print("Introduce un numero: ");
			int a=sc.nextInt();
			lista.add(a);
			acum+=a;
		}
		Collections.reverse(lista);
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("La suma total de sus componentes es: "+acum);
	}

}
