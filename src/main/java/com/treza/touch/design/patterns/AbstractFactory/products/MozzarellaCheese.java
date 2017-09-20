package com.treza.touch.design.patterns.AbstractFactory.products;

import com.treza.touch.design.patterns.AbstractFactory.Interfaces.ICheese;

public class MozzarellaCheese implements ICheese {

	public String createCheese() {
		return "Mozzarella";
	}

}
