package AP1;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el radio: ");
		double num=s.nextDouble();
		System.out.println("El diametro es: "+  String.format("%.3f", conversor(num)));
		
	}
	public static double conversor(double x) {
		double y =(double)x*2;
		return(y);
	}
	

}
