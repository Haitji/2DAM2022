package AP1;

import java.util.Scanner;

public class ej38 {

	public static void main(String[] args) {
		long time_start, time_end;

		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int num1=s.nextInt();
		System.out.print("Introduce el segundo numero: ");
		int num2=s.nextInt();
		time_start = System.currentTimeMillis();
		for(int i=num1; i<=num2; i++) {
			if(numprimo(i)==1) {
				System.out.println(i+" - es primo.");
			}else {
				System.out.println(i);
			}

		}
		time_end = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion "+ ( time_end - time_start ) +" milliseconds");
	}
	public static int numprimo(int num) {
		if(num==0||num==1||num==4) return 0;
		for (int x = 2; x < num / 2; x++) {
		    if (num % x == 0) return 0;
		  }
		  return 1;
	}

}
