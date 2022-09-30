package AP1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class ej28 {

	public static void main(String[] args) {
		ArrayList<Vehiculo> vehi = new ArrayList<Vehiculo>();
		Vehiculo vehiculo;
		Scanner s = new Scanner(System.in);

		String tipo;
		String marca;
		String modelo;
		for (int i=0;i<5;i++) {
			System.out.print("Introduce el tipo de vehiculo "+ (i+1)+ " : ");
			tipo=s.nextLine();
			System.out.print("Introduce la marca de vehiculo "+ (i+1)+ ": ");
			marca=s.nextLine();
			System.out.print("Introduce el modelo de vehiculo "+ (i+1)+ ": ");
			modelo=s.nextLine();
			vehi.add(vehiculo=new Vehiculo(tipo,marca,modelo));
		}
		for(int i=0;i<vehi.size();i++) {
			System.out.println("Vehiculo "+(i+1)+":");
			System.out.println("Tipo-"+vehi.get(i).getTipo().toString());
			System.out.println("Marca-"+vehi.get(i).getMarca().toString());
			System.out.println("Modelo-"+vehi.get(i).getModelo().toString());
		}
	}

}
