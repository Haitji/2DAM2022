package AP1;
import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.println("anyo");
		int a=sc.nextInt();
		System.out.println("mes ");
		int m=sc.nextInt();
		System.out.println("dia");
		int d=sc.nextInt();
		int s=a+m+d;
		
		String num= Integer. toString(s);
		int sum=0;
		for (int i = 0; i <num.length(); i++) {
		sum=sum+Integer.parseInt(num.charAt(i)+"");
		
		}
		System.out.println("Tu numero de la suerte es:"+ sum);
		
	}

}
