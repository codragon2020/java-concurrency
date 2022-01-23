package com.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {

		// ConcurrentMap breaks down the HashMap into regions
		// each region can be locked separately
		// this separation of locks by region makes it more Atomic (thread-safe)
		// it also increases the available concurrency
		ConcurrentMap<Character, LongAdder> occurences = new ConcurrentHashMap<>();

		String str = "adsf asdf asdfads";
		for (char character : str.toCharArray()) {
			occurences.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}

		System.out.println(occurences);

	}

}
