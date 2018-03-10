package pache.ejercicios.ejercicio2;

/**
 * @author lpache
 */
public class MiVehiculo extends Vehiculo {

	@Override
	public Float getMinimoDelAceite() {
		return 10f;
	}

	@Override
	public Float getMinimoDelPresionNeumatico() {
		return 15.0f;
	}

	@Override
	public Float getMinimoDelNivelAgua() {
		return 3f;
	}

	public MiVehiculo(Float aceite, Float presion, Float nivelAgua) {
		super.initialize(aceite, presion, nivelAgua);
	}
	
}
