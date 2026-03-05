package entities;

public class Student {
	public String name;
	public double nota1, nota2, nota3;
	
	public double notaFinal() {
		double nFinal = nota1 + nota2 + nota3;
		
		return nFinal;
	}
	
	public double approved(){
		if(notaFinal() < 60) {
			return 60.0 - notaFinal();	
		}
		else
			return 0;
	}
}
