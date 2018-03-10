package pache.all.samples.javatraining;

class Leitura{
	static int total = 10;
	static int consumido = 0;
	
	public int getTotal(){
		return total;
	}
	
	public int getConsumido(){
		return consumido;
	}
	
	public synchronized void consumir(int consumo){
		consumido +=consumo;
	}
}

class GerarPDF implements Runnable{
	@Override
	public void run() {
		Leitura leitura = new Leitura();
		for (int i = 1; i <= leitura.getTotal(); i++) {
			try {
				leitura.consumir(1);
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) { }
		}
	}
}

class Progresso implements Runnable{
	@Override
	public void run() {
		Leitura leitura = new Leitura();
		while (leitura.getConsumido() < leitura.getTotal()) {
			try {
				System.out.println(Float.valueOf(leitura.getConsumido())/Float.valueOf(leitura.getTotal())*100+" %");
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) { }
		}
		System.out.println("100%");
	}
}

public class Threads {

	public static void main(String[] args) {

		GerarPDF pdf = new GerarPDF();
		Thread threadPDF = new Thread(pdf);
		
		Progresso progresso = new Progresso();
		Thread threadProgresso = new Thread(progresso);

		threadPDF.start();
		threadProgresso.start();
	}

}

