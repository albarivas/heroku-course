package com.example;

public class Worker {
	public static void main(String[] args)
	{
		while(true) {
			try { 
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println("Worker process woke up");
		}
	}
}
