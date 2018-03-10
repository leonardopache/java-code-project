package pache.all.samples.javatraining;

public class SistemaInterno{
	public void autentica(Autenticavel usuario){
		String senha = "123";

		if(usuario.autentica(senha) == true){
			System.out.println("Usuario Autenticado");
		}else {
			System.out.println("Hummm, senha errada!!!");
		}
	}
}