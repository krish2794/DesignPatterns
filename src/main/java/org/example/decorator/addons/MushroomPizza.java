package org.example.decorator.addons;

import org.example.decorator.base.BasePizza;

public class MushroomPizza extends ToppingDecorator {

    private BasePizza basePizza;

    public MushroomPizza(BasePizza basePizza){
         this.basePizza = basePizza;
    }

    public int getCost(){
        return basePizza.getCost()+40;
    }
}
