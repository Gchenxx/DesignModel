package structuremodel.decoratormodel.coffee;

import structuremodel.decoratormodel.coffeebar.Drink;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
