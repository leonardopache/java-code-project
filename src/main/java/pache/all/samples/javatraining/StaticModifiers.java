package pache.all.samples.javatraining;

class ContaStatic extends Banco{
	
	private static int numeroIncremental = 1;

	int numero;
	int agencia;
	ClienteStatic titular;

	public ContaStatic(int agencia, ClienteStatic titular){
		this.agencia = agencia;
		this.titular = titular;
		this.numero = getNumeroIncremental();
		quantidadeContas++;
	}

	public static int getNumeroIncremental(){
		int numero = numeroIncremental;
		numeroIncremental++;
		return numero;
	}

}

class ClienteStatic{
	String nome;
	String cpf;
	String dataNascimento;

	public ClienteStatic(String nome, String cpf, String dataNascimento){
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
}

class Banco{
	protected static int quantidadeContas = 0;

	public static int getQuantidadeContas(){
		return quantidadeContas;
	}
}


class StaticModifiers{

	public static void main(String[] args){
		ClienteStatic c1 = new ClienteStatic("Leonardo P", "004003002-10", "07/07/1983");
		ContaStatic leonardoConta = new ContaStatic(1562, c1);

		ClienteStatic c2 = new ClienteStatic("Juciara", "004003002-10", "12/12/1980");
		ContaStatic juciaraConta = new ContaStatic(1562, c2);
		
		System.out.println(leonardoConta.numero);
		System.out.println(juciaraConta.numero);
		System.out.println("Total de Contas: "+ContaStatic.getQuantidadeContas());
	}
	

}