package pache.ejercicios.ejercicio2.test;

import org.junit.Before;
import org.junit.Test;

import pache.ejercicios.ejercicio2.MecanicoException;
import pache.ejercicios.ejercicio2.MiVehiculo;
import pache.ejercicios.ejercicio2.UsuarioException;

public class MiVehiculeTest {

	private MiVehiculo vehicule;

	@Before
	public void before() {
		vehicule = new MiVehiculo(42.0f, 22f, 5f);
	}

	@Test(expected = UsuarioException.class)
	public void sensorPressaoTest(){
		vehicule.setPresionNeumaticos(14f);
	}

	
	@Test(expected = MecanicoException.class)
	public void sensorAguaTest(){
		vehicule.setNivelAgua(1f);
	}
}
