import java.util.Locale;
import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, qtd1,qtd2;
		double val1, val2, total;

		

		codigo1= sc.nextInt();
		qtd1= sc.nextInt();
		val1= sc.nextDouble();
		sc.nextLine();
		codigo2= sc.nextInt();
		qtd2= sc.nextInt();
		val2= sc.nextDouble();
		
		
		total = qtd1*val1 + qtd2*val2;
		System.out.printf("Valor a pagar: R$%.2f ", total);
		sc.close();

	}	
}
