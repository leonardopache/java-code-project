/**
 * 
 */
package pache.ejercicios.ejercicio1.test;

import org.junit.Assert;
import org.junit.Test;

import pache.ejercicios.ejercicio1.EjercicioPracticos;

/**
 * @author lpache
 *
 */
public class EjercicioPracticosTest {

	@Test
	public void convertDecimalToBinaryTest(){
		int []decimalTest1 = {1, 1};
		int []decimalTest2 = {2, 10};
		int []decimalTest3 = {3, 11};
		int []decimalTest8 = {8, 1000};
		int []decimalTest16 = {16, 10000};
		int []decimalTest21 = {21, 10101};
		long []decimalTest1100 = {1100, 10001001100l};
		
		Assert.assertEquals(String.valueOf(decimalTest1[1]), EjercicioPracticos.convertDecimalToBinary(decimalTest1[0]));
		Assert.assertEquals(String.valueOf(decimalTest2[1]), EjercicioPracticos.convertDecimalToBinary(decimalTest2[0]));
		Assert.assertEquals(String.valueOf(decimalTest3[1]), EjercicioPracticos.convertDecimalToBinary(decimalTest3[0]));
		Assert.assertEquals(String.valueOf(decimalTest8[1]), EjercicioPracticos.convertDecimalToBinary(decimalTest8[0]));
		Assert.assertEquals(String.valueOf(decimalTest16[1]), EjercicioPracticos.convertDecimalToBinary(decimalTest16[0]));
		Assert.assertEquals(String.valueOf(decimalTest21[1]), EjercicioPracticos.convertDecimalToBinary(decimalTest21[0]));
		Assert.assertEquals(String.valueOf(decimalTest1100[1]), EjercicioPracticos.convertDecimalToBinary(decimalTest1100[0]));
		
	}
	
	@Test
	public void palindromoTest(){
		String str1 = "abca";
		String str2 = "ErRe";
		String str3 = "aboba";
		String str4 = "arañara";
		String str5 = "radar";
		String str6 = "pex";
		String str7 = "dado";
		
		Assert.assertFalse(EjercicioPracticos.isPalindromo(str1));
		Assert.assertTrue(EjercicioPracticos.isPalindromo(str2));
		Assert.assertTrue(EjercicioPracticos.isPalindromo(str3));
		Assert.assertTrue(EjercicioPracticos.isPalindromo(str4));
		Assert.assertTrue(EjercicioPracticos.isPalindromo(str5));
		Assert.assertFalse(EjercicioPracticos.isPalindromo(str6));
		Assert.assertFalse(EjercicioPracticos.isPalindromo(str7));
		
	}
}
