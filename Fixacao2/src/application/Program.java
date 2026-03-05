package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.println("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Informe o nome do titular: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Deseja fazer um depósito inicial? (s/n)");
		char opcao = sc.next().charAt(0);	
		if(opcao =='s' || opcao =='S') {
			System.out.println("Informe valor do depósito inicial");
			double valor = sc.nextDouble();
			conta = new Conta(name, numeroConta, valor);
			System.out.println("Conta criada com sucesso");
		}
		else{
			conta = new Conta(name, numeroConta);
			System.out.println("Conta criada com sucesso");
		}
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println("Valor para depositar");
		double deposito = sc.nextDouble();
		conta.Depositar(deposito);
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		System.out.println("Valor para sacar");
		double saque = sc.nextDouble();
		conta.Sacar(saque);
		System.out.println("Dados atualizados:");
		System.out.println(conta);

		sc.close();
	}

}
