package fgd;

import java.math.BigInteger;

public class MyThread implements Runnable {
	private int n;

	public MyThread(int n) {
		super();
		this.n = n;
	}

	public MyThread() {
		super();
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	private BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = n; i >= 1; i--) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread thr = Thread.currentThread();
		System.out.println(thr.getName() + "--- "+"n-" + n + " factorial= " + factorial(n));
	}
}
