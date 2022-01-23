package com.concurrency;

public class BiCounter {
	private int i;
	private int j;

	// i++ is NOT Atomic or thread safe
	// using synchronized will ensure multiple threads will be synchronized
	synchronized public void incrementI() {
		i++;
	}

	public int getI() {
		return i;
	}

	// Problem: only one synchronized thread can run at a time
	// this is not efficient
	synchronized public void incrementJ() {
		j++;
	}

	public int getJ() {
		return j;
	}
}
