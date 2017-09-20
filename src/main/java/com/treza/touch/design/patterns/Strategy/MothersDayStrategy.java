package com.treza.touch.design.patterns.Strategy;
import java.util.*;

// markup only bouquets by 15% for Mother�s Day
public class MothersDayStrategy implements PricingStrategy {

  public float calculateTotal(Collection<Product> items) {
    float total = 0.0f;
    Iterator<Product> iter = items.iterator();

    while (iter.hasNext()) {
      Product item = iter.next();
      float price = getMarkedUpPrice(item);
      System.out.println("MothersDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
      total += price;
    }
    return total;
  }

  // markup Flowers by 15%
  private float getMarkedUpPrice(Product item) {
    float price = item.getPrice();

    if (item instanceof Flower) {
      price *= 1.15f;
    }

    return price;
  }

}
