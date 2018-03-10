package pache.all.samples.javatraining;

public class Cliente implements Autenticavel{
	private String nome;
	private String endereco;

	public boolean autentica(String senha){
		return false;
	}
}