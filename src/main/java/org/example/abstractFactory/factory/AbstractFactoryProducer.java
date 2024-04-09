package org.example.abstractFactory.factory;

public class AbstractFactoryProducer {

    public AbstractFactory getFactoryInstance(String value){
        if("Economic".equals(value)){
            return new EconomicCarFactory();
        }
        else if("Luxury".equals(value)){
            return new LuxuryCarFactory();
        }
        return null;
    }
}
