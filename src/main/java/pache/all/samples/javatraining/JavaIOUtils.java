/**
 * 
 */
package pache.all.samples.javatraining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Utility class with methods capable to read and write a file
 * 
 * @author lpache
 *
 */
public class JavaIOUtils {
	
	
	public static void main(String[] args) {
		try {
			// read file using InputStream
			StringBuffer sb = readFileWithInputStream("/Users/lpache/JeeEnvironment/workspace/OtherCodes/src/com/javatraining/i/entrada.txt");
			// write a file using OutputStream
			writeStringOutputStream("/Users/lpache/JeeEnvironment/workspace/OtherCodes/src/com/javatraining/i/saida.txt", sb);
			// read file using Scanner
			StringBuffer sbScanner = readFileWithScanner("/Users/lpache/JeeEnvironment/workspace/OtherCodes/src/com/javatraining/i/entrada.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	public static StringBuffer readFileWithScanner(String file) throws FileNotFoundException{
		StringBuffer retorno = new StringBuffer();
		Scanner scanner = new Scanner(file);
		try{
			while (scanner.hasNext()) {
				retorno.append(scanner.nextLine()+"\n");
			}
		} finally {
			scanner.close();
		}	
		return retorno;
	}

	public static void writeStringOutputStream(String file, StringBuffer strBff) throws IOException {
		OutputStream outputStream = new FileOutputStream(file);
		OutputStreamWriter outputStreamWrite = new OutputStreamWriter(outputStream);
		BufferedWriter bufferWriter = new BufferedWriter(outputStreamWrite);
		bufferWriter.write(strBff.toString());
		bufferWriter.close();
	}

	public static StringBuffer readFileWithInputStream(String file) throws IOException {
		StringBuffer retorno = new StringBuffer();
		InputStream inputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bf = new BufferedReader(inputStreamReader);
		try {
			String str;
			while ((str = bf.readLine()) != null) { 
				retorno.append(str+"\n");
			}
		} finally {
            try { 
            	inputStream.close(); 
            } catch (Throwable ignore) {
            	// ignore
            }
        }
		return retorno;
	}

}
