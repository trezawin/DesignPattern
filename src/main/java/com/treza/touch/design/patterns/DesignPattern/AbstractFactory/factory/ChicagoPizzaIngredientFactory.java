package com.treza.touch.design.patterns.DesignPattern.AbstractFactory.factory;

import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.ICheese;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.IDough;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.IPizzaIngredientFactory;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.ISauce;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.products.MozzarellaCheese;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.products.PlumTomatoSauce;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.products.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements IPizzaIngredientFactory {

	public IDough createDough() {
		return new ThickCrustDough();
	}

	public ISauce createSauce() {
		return new PlumTomatoSauce();
	}

	public ICheese createCheese() {
		return new MozzarellaCheese();
	}
}
