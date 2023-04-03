package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta.
 * @author Hugo A. Silva
 */

public abstract class Conta extends Object implements Comparable<Conta> { 
	protected double saldo;	   
	private int agencia;	  
	private int numero;		  
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e número.
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
//		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
//		System.out.println("estou criando uma conta");
//		System.out.println("Agência: " + agencia);
//		System.out.println("Número da conta " + numero);
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}
		
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("não pode valor <=0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("não pode valor <=0");
			return;
		}	
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}
}