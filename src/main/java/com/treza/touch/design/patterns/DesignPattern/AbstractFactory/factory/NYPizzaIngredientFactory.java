package com.treza.touch.design.patterns.DesignPattern.AbstractFactory.factory;

import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.ICheese;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.IDough;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.IPizzaIngredientFactory;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces.ISauce;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.products.MarinaraSauce;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.products.ReggianoCheese;
import com.treza.touch.design.patterns.DesignPattern.AbstractFactory.products.ThinCurstDough;

/**
 * Concrete factory implementation to create products.
 * @author treza.win
 *
 */
public class NYPizzaIngredientFactory implements IPizzaIngredientFactory {

	public IDough createDough() {
		return new ThinCurstDough();
	}

	public ISauce createSauce() {
		return new MarinaraSauce();
	}

	public ICheese createCheese() {
		return new ReggianoCheese();
	}

}
