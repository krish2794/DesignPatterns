package org.example.decorator.addons;

import org.example.decorator.base.BasePizza;

public class ExtraCheesePizza extends ToppingDecorator {

    private BasePizza basePizza;

    public ExtraCheesePizza(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int getCost(){
        return basePizza.getCost()+30;
    }
}
