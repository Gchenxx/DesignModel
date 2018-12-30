package structuremodel.decoratormodel.decorator;

import structuremodel.decoratormodel.coffeebar.Drink;

public class Soy extends Decorator{
    public Soy(Drink obj){
        super(obj);
        super.setDescription("Soy");
        super.setPrice(1.0f);
    }
}
