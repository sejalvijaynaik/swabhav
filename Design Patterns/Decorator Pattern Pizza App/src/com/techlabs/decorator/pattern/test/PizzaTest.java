package com.techlabs.decorator.pattern.test;

import com.techabs.decorator.pattern.pizza.Pizza;
import com.techlabs.decorator.pattern.cheese.pizza.CheesePizza;
import com.techlabs.decorator.pattern.plain.pizza.PlainPizza;
import com.techlabs.decorator.pattern.toppings.classes.Cheese;
import com.techlabs.decorator.pattern.toppings.classes.Tomato;

public class PizzaTest {
	public static void main(String[] args) {
		
		Pizza pizza1 = new CheesePizza();
		pizza1 = new Tomato(pizza1);
		System.out.println(pizza1.getDescription() + " : " + pizza1.cost());
		
		Pizza pizza2 = new PlainPizza();
		pizza2 = new Cheese(pizza2);
		pizza2 = new Tomato(pizza2);
		System.out.println(pizza2.getDescription() + " : " + pizza2.cost());
	}
}
