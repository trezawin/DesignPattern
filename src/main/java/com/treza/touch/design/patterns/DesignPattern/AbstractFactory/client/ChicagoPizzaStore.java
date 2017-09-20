package com.treza.touch.design.patterns.DesignPattern.AbstractFactory.client;

import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.ICheese;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.IDough;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.IPizzaIngredientFactory;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.ISauce;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.factory.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore {
	
	public static void main(String[] args) {
		ChicagoPizzaStore cc =  new ChicagoPizzaStore();
		System.out.println(cc.createPizza());
	}
	
	public String createPizza() {
		StringBuilder pizzaStr = new StringBuilder("Chicago Pizza with ingredients :");
		
		IPizzaIngredientFactory pizzaFactory = new ChicagoPizzaIngredientFactory();
		
		// create dough
		IDough dough = pizzaFactory.createDough();
		pizzaStr.append("/" + dough.createDough());
		
		// create sauce
		ISauce sauce = pizzaFactory.createSauce();
		pizzaStr.append("/" + sauce.createSauce());
		
		// create cheese
		ICheese cheese = pizzaFactory.createCheese();
		pizzaStr.append("/" + cheese.createCheese());
		
		return pizzaStr.toString();
	}
	
}
