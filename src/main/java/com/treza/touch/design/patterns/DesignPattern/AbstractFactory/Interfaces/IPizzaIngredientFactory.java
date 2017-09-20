package com.treza.touch.design.patterns.DesignPattern.AbstractFactory.Interfaces;

/**
 * Abstract Factory to create family of dependent objects.
 * @author treza.win
 *
 */
public interface IPizzaIngredientFactory {
	IDough createDough();
	ISauce createSauce();
	ICheese createCheese();
}
