package fgd;

public class Main {
	public static void main(String[] args) {
		Thread[] tR = new Thread[100];

		for (int i = 0; i < tR.length; i++) {
			tR[i] = new Thread(new MyThread(i + 1));
			tR[i].start();
		}
		
	}
}
