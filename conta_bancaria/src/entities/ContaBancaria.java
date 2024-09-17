package entities;

public class ContaBancaria {
	private String numConta;
	private String nome;
	private double saldo;

	public ContaBancaria(String numConta, String nome, double initialDeposit) {

		this.numConta = numConta;
		this.nome = nome;
		deposito(initialDeposit);
	}

	public ContaBancaria(String numConta, String nome) {

		this.numConta = numConta;
		this.nome = nome;
	}

	public String getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}


	public void deposito(double valor) {

		saldo += valor;
	}

	public void saque(double valor) {

		if (saldo >= valor) {

			saldo -= valor + 5;
		} else {
			
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public String toString() {
		return "Account data: Account " + numConta + ", Holder " + nome + ", Balance: " + String.format("%.2f", saldo);
	}
		
	
}
