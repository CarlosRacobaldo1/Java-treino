package entities;

public class Conta {
	private String nome;
	private int numeroConta;
	private double saldo;

	public Conta(String nome, int numeroConta, double depositoInicial) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		Depositar(depositoInicial);
	}
	public Conta(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroConta(){
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	

	public void Depositar(double deposito) {
		saldo += deposito;
	}
	public void Sacar(double saque) {
		saldo -= saque + 5;
	}

	public String toString() {
		return "Conta: " +
				numeroConta +
				" Titular: " +
				nome +
				" Saldo: R$"+
				String.format("%.2f", saldo);
	}
}
