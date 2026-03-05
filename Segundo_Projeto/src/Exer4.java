import java.util.Locale;
import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int number, horas;
		double valor;

		number = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		double salario = horas * valor;

		
		System.out.printf("Number = %d\nSalary = U$%.2f", number, salario);
		sc.close();

	}
}
