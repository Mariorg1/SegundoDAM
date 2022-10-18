package hilos_clase;

public class SleepMessages {
	public static void main(String args[]) throws InterruptedException {
		String importantInfo[] = { "Mario le fallla el tobillo derecho", "Javi pillo portatil", "Rafa tiene teclado numerico",
				"Raul tiene una moto doblada" };
		for (int i = 0; i < importantInfo.length; i++) {
			// Pausa de 4 segundos
			Thread.sleep(4000);
			// Mostramos por pantalla
			System.out.println(importantInfo[i]);
		}
	}
}