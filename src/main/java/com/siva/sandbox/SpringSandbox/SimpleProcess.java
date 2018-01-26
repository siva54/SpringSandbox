package com.siva.sandbox.SpringSandbox;

public class SimpleProcess {

	Integer count = 0;

	public void increment() {
		count = count + 1;
	}

	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
}
