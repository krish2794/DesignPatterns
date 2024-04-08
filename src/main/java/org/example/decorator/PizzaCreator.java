package org.example.decorator;

import org.example.decorator.addons.ExtraCheesePizza;
import org.example.decorator.addons.MushroomPizza;
import org.example.decorator.base.BasePizza;
import org.example.decorator.base.MargheritaPizza;
import org.example.decorator.base.VeggiePizza;

public class PizzaCreator {
    public static void main(String[] args) {
        //Margherita with extra cheese
        BasePizza margheritaPizza = new ExtraCheesePizza(new MargheritaPizza());
        System.out.println("margheritaPizza with extra cheese cost :"+margheritaPizza.getCost());

        //VeggiePizza with extra cheese and Mushroom
        BasePizza veggiePizza = new MushroomPizza(new ExtraCheesePizza(new VeggiePizza()));
        System.out.println("veggiePizza with extra cheese and mushroom :"+veggiePizza.getCost());

    }
}
