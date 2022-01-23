package com.concurrency;

public class Counter {
	private int i;

	// i++ is NOT Atomic or thread safe
	// using synchronized will ensure multiple threads will be synchronized
	synchronized public void increment() {
		i++;
	}

	public int getI() {
		return i;
	}
}
