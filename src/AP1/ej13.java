package AP1;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Introduce los grados: ");
		double num=s.nextDouble();
		System.out.println(num+" grados celsius = "+  String.format("%.2f", conversor(num)));
		
	}
	public static double conversor(double x) {
		double y =(double)9/5;
		return((x*y)+32);
	}

}
