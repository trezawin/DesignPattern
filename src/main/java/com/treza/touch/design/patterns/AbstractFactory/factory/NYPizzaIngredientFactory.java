package com.treza.touch.design.patterns.AbstractFactory.factory;

import com.treza.touch.design.patterns.AbstractFactory.Interfaces.ICheese;
import com.treza.touch.design.patterns.AbstractFactory.Interfaces.IDough;
import com.treza.touch.design.patterns.AbstractFactory.Interfaces.IPizzaIngredientFactory;
import com.treza.touch.design.patterns.AbstractFactory.Interfaces.ISauce;
import com.treza.touch.design.patterns.AbstractFactory.products.MarinaraSauce;
import com.treza.touch.design.patterns.AbstractFactory.products.ReggianoCheese;
import com.treza.touch.design.patterns.AbstractFactory.products.ThinCurstDough;

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
