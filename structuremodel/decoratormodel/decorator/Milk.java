package structuremodel.decoratormodel.decorator;

import structuremodel.decoratormodel.coffeebar.Drink;

public class Milk extends Decorator{
    public Milk(Drink obj){
        super(obj);
        super.setDescription("Milk");
        super.setPrice(4.0f);
    }
}
