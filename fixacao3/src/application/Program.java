package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão registradas?");
		int n = sc.nextInt();
		Pessoa[] vet = new Pessoa[10];

		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.println("Name:");
			String nome = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			vet[room] = new Pessoa(nome, email);
		}

		System.out.println("Busy rooms:");
		for(int i = 0; i<vet.length; i++) {
			if(vet[i]!=null) {
				System.out.println(i +": " + vet[i].nome + " " + vet[i].email);
			}
			
		}

		sc.close();
	}
}