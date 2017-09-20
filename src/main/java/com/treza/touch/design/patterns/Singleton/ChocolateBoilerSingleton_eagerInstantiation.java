package com.treza.touch.design.patterns.Singleton;

// using object instantiation by default.
public class ChocolateBoilerSingleton_eagerInstantiation {
	boolean empty;
	boolean boiled;
	static ChocolateBoilerSingleton_eagerInstantiation uniqueChocoBoiler = new ChocolateBoilerSingleton_eagerInstantiation(); // JVM will instantiate it once ONLY.
	
	private ChocolateBoilerSingleton_eagerInstantiation() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoilerSingleton_eagerInstantiation getInstance() {
		return uniqueChocoBoiler; 
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
