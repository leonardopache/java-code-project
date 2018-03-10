package pache.all.samples.javatraining;

class ContaOO{
	int numero;
	PessoaOO titular;
	double saldo;
	int agencia;

	void depositar (double valorDeposito){
		this.saldo += valorDeposito;
	}

	void sacar (double valorSaque){
		if(this.saldo >= valorSaque){
			this.saldo -= valorSaque;
		} else {
			System.out.println("Saque Inválido");
		}
	}

	void trasferir(double valorTranferencia, ContaOO contaDestino){
		if(this.saldo >= valorTranferencia){
			this.saldo -= valorTranferencia;
			contaDestino.saldo += valorTranferencia;
		} else {
			System.out.println("Transferencia Inválida");
		}
	}
	void imprimirSaldo(){
		System.out.println(this.titular.nome + " Tem R$:"+ this.saldo);
	}
}

class PessoaOO{
	String nome;
	String cpf;
	String dataNascimento;
}

class ObjectOrientation{

	public static void main(String[] args){
		ContaOO leonardo = new ContaOO();
		leonardo.numero = 123;
		leonardo.saldo = 800.0;
		PessoaOO pessoa = new PessoaOO();
		pessoa.nome = "Leonardo Pache";
		pessoa.cpf = "003004005-98";
		pessoa.dataNascimento = "07/07/1983";
		leonardo.titular = pessoa;
		leonardo.agencia = 1562;
		leonardo.depositar(350.0);
		leonardo.sacar(1000.0);
		leonardo.imprimirSaldo();

	}
}