package com.treza.touch.design.patterns.Singleton;

// using standard pattern way.
public class ChocolateBoilerSingleton {
	boolean empty;
	boolean boiled;
	static ChocolateBoilerSingleton uniqueChocoBoiler ;
	
	private ChocolateBoilerSingleton() {
		empty = true;
		boiled = false;
	}
	
	// synchronized access from multi threads
	// this will make sure only one after another.
	// BUT synchronized is expensive.
	public static synchronized ChocolateBoilerSingleton getInstance() {
		if (uniqueChocoBoiler == null) {
			return new ChocolateBoilerSingleton();
		} else {
			return uniqueChocoBoiler;
		}
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}
}
