import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		

		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		double valor;
		switch(codigo) {
			case 1:
				valor = quantidade * 4;
				break;
			case 2:
				valor = quantidade * 4.5;
				break;
			case 3:
				valor = quantidade * 5;
				break;
			case 4:
				valor = quantidade * 2;
				break;
			case 5:
				valor = quantidade * 1.5;
				break;
			default:
				System.out.println("Código inválido");
				sc.close();
				return;
		}
		
		System.out.printf("Total: R$%.2f", valor);
		

	}
}
