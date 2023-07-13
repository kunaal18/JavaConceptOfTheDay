package com.practice.corejava;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread thread2 = new Thread(thread);

		MyThreads myThreads = new MyThreads();
		myThreads.start();
		thread2.start();
	}
}
