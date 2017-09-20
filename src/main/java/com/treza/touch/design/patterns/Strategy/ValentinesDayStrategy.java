package com.treza.touch.design.patterns.Strategy;
import java.util.*;

// markup only toys by 25% for Valentine�s Day
public class ValentinesDayStrategy implements PricingStrategy {

  public float calculateTotal(Collection<Product> items) {
    float total = 0.0f;
    Iterator<Product> iter = items.iterator();

    while (iter.hasNext()) {
      Product item = iter.next();
      float price = getMarkedUpPrice(item);
      System.out.println("ValentinesDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
      total += price;
    }
    return total;
  }

  // markup toys by 25%
  private float getMarkedUpPrice(Product item) {
    float price = item.getPrice();

    if (item instanceof Toy) {
      price *= 1.25f;
    }

    return price;
  }

}
