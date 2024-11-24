package edu.uwm.cs351.util;

/**
 * A simple mutable container
 * @param T element type
 */
public class Cell<T> {

	private T value;
	
	/** Initialize a cell with the given value. */
	public Cell(T v) {
		value = v;
	}
	
	/** Return the current value of the Cell. */
	public T get() {
		return value;
	}
	
	/** Change the stored value to the given value.
	 * @param newValue new value for cell, may be null
	 */
	public void set(T newValue) {
		value = newValue;
	}
}
