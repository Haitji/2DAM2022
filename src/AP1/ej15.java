package AP1;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el radio: ");
		double num=s.nextDouble();
		System.out.println("El diametro es: "+  String.format("%.3f", conversor(num)));
		System.out.println("El volumen de la esfera es: "+  String.format("%.3f", volumen(num)));
	}
	public static double conversor(double x) {
		double y =(double)x*2;
		return(y);
	}
	
	public static double volumen(double x) {
		double y =(double)4/3;
		final double pi=3.14159;
		return(y*pi*Math.pow(x,3));
	}

}
