package com.practice.corejava;

public class MyThreads extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		MyThreads myThreads = new MyThreads();
		
		
		//myThreads.start();
	}
}
