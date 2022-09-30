package AP1;

import java.util.ArrayList;
import java.util.List;

public class Notas {


	public List<Integer> getSuspensos() {
		return suspensos;
	}
	public void setSuspensos(List<Integer> suspensos) {
		this.suspensos = suspensos;
	}
	public List<Integer> getAprobados() {
		return aprobados;
	}
	public void setAprobados(List<Integer> aprobados) {
		this.aprobados = aprobados;
	}
	public List<Integer> getNotables() {
		return notables;
	}
	public void setNotables(List<Integer> notables) {
		this.notables = notables;
	}
	public List<Integer> getSobresalientes() {
		return sobresalientes;
	}
	public void setSobresalientes(List<Integer> sobresalientes) {
		this.sobresalientes = sobresalientes;
	}
	public List<Integer> getMatrícula() {
		return matrícula;
	}
	public void setMatrícula(List<Integer> matrícula) {
		this.matrícula = matrícula;
	}
	
	private List<Integer> suspensos = new ArrayList<Integer>();
	private List<Integer> aprobados = new ArrayList<Integer>();
	private List<Integer> notables = new ArrayList<Integer>();
	private List<Integer> sobresalientes = new ArrayList<Integer>();
	private List<Integer> matrícula = new ArrayList<Integer>();
	
	public Notas() {
		
	}
	public void clasificar(int num1) {
			if(num1<5) {
				suspensos.add(num1);
			}else if(num1>=5&&num1<=10) {
				aprobados.add(num1);
				if(num1>=7&&num1<9) {
				notables.add(num1);
				}else if(num1>=9&&num1<=10) {
					sobresalientes.add(num1);
					if(num1==10) {
					matrícula.add(num1);
					}
				}
			}
		
	}

}	
