/**
 * 
 */
package pache.ejercicios.ejercicio2;

/**
 * @author lpache
 */
public abstract class Vehiculo implements Sensores {

	private Float medidorCombustible;
	private Float presionNeumaticos;
	private Float nivelAgua;
	
	public void setMedidorCombustible(Float medidorCombustible) {
		this.medidorCombustible = medidorCombustible;
		medirCombustible();
	}
	public void setPresionNeumaticos(Float presionNeumaticos) {
		this.presionNeumaticos = presionNeumaticos;
		medirPresionNeumaticos();
	}
	public void setNivelAgua(Float nivelAgua) {
		this.nivelAgua = nivelAgua;
		medirNivelAgua();
	}
	
	public void initialize(Float medidorCombustible, Float presionNeumaticos, Float nivelAgua) {
		this.medidorCombustible = medidorCombustible;
		this.presionNeumaticos = presionNeumaticos;
		this.nivelAgua = nivelAgua;
	}

	protected void medirCombustible() throws UsuarioException {
		if(medidorCombustible.compareTo(getMinimoDelAceite()) <= 0){
			throw new UsuarioException("Coche con poco combustible!");
		}
	}
	
	protected void medirPresionNeumaticos() throws UsuarioException{
		if(presionNeumaticos.compareTo(getMinimoDelPresionNeumatico()) <= 0)
			throw new UsuarioException("Presion Neumaticos bajo");
	}
	
	protected void medirNivelAgua() throws MecanicoException {
		if(nivelAgua.compareTo(getMinimoDelNivelAgua()) <=0)
			throw new MecanicoException("Nivel de agua baixo");
	}
}
