package pache.all.samples.javatraining;

public class ObjectOrientationII{

	public static void main(String[] args){

		//cria funcionario gerente
		Gerente gerente = new Gerente("Leonardo");
		gerente.setSalario(4500.0);


		//cria funcionario desenvolvedor
		Desenvolvedor dsv = new Desenvolvedor("Juciara");
		dsv.setSalario(2000.0);

		System.out.println(gerente.nome +" Bonus "+gerente.getBonificacao());
		System.out.println(dsv.nome +" Bonus "+dsv.getBonificacao());

		TotalizadorBonus bonificacoes = new TotalizadorBonus();
		bonificacoes.adicionarBonus(gerente);
		bonificacoes.adicionarBonus(dsv);

		System.out.println("Total de Bonificacoes:"+bonificacoes.getTotalBonificacoes());
	}
}

abstract class Funcionario{

	protected String nome;
	protected double salario;
	protected String senha;

	abstract double getBonificacao();

	protected void setSalario(double salario){
		this.salario = salario;
	}

}

class Gerente extends Funcionario implements Autenticavel{

	public Gerente(String nome){
		super.nome = nome;
	}

	public double getBonificacao(){
		return salario * 0.3;
	}

	public boolean autentica(String senha){
		return false;
	}
}

class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String nome){
		super.nome = nome;
	}
	public double getBonificacao(){
		return salario * 0.2;
	}
}

class TotalizadorBonus {

	private static double totalBonus = 0;

	public void adicionarBonus(Funcionario funcionario){
		totalBonus += funcionario.getBonificacao();
	}

	public double getTotalBonificacoes(){
		return totalBonus;
	}
}