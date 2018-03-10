package pache.all.samples.javatraining;

class Conta{
	int numero;
	int agencia;
	Pessoa titular;
	private double saldo;
	private double limite;

	public Conta(int numero, int agencia, Pessoa titular){
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
	}

	public void depositar (double valorDeposito){
		this.saldo += valorDeposito;
	}

	public void sacar (double valorSaque){
		if(this.saldo >= valorSaque){
			this.saldo -= valorSaque;
		} else {
			System.out.println("Saque Inválido");
		}
	}

	public void setLimite(double novoLimite){
		this.limite = novoLimite;
	}

	public double getSaldo(){
		return (this.saldo+this.limite);
	}

	public void imprimirSaldo(){
		System.out.println(this.titular.nome + " Tem R$:"+ this.getSaldo() + " Saldo + Limite");
	}
}

class Pessoa{
	String nome;
	String cpf;
	String dataNascimento;

	public Pessoa(String nome, String cpf, String dataNascimento){
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
}


class AccessModifiers{

	public static void main(String[] args){
		Pessoa pessoa = new Pessoa("Leonardo P", "004003002-10", "07/07/1983");

		Conta conta = new Conta(123, 1562, pessoa);
		
		conta.depositar(100.0);
		conta.setLimite(100.0);
		conta.sacar(300.0);

		conta.imprimirSaldo();
	}
	

}