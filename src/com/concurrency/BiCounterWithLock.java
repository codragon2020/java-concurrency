package com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i;
	private int j;

	// Locks help break synchronized code into multiple sets of code
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		// Get Lock for I
		lockForI.lock();
		i++;

		// Release Lock
		lockForI.unlock();
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		// Get Lock
		lockForJ.lock();
		j++;

		// Release Lock
		lockForJ.unlock();
	}

	public int getJ() {
		return j;
	}
}
