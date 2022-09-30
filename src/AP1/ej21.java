package AP1;
import java.util.ArrayList;
import java.util.Scanner;
public class ej21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc= new Scanner (System.in);

		boolean salir=false;
		
		do {
			System.out.println("Introduce el nombre:");
			String a=sc.nextLine();
			if(a.equals("0")) {
				salir=true;
			}else {
				list.add(a.toUpperCase());
			}
			
		}while(list.size()<5&&salir==false);
		
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+"."+ list.get(i));
		}
	}

}
