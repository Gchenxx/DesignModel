package structuremodel.decoratormodel.coffeebar;

import structuremodel.decoratormodel.coffee.Decaf;
import structuremodel.decoratormodel.coffee.Espresso;
import structuremodel.decoratormodel.decorator.Chocolate;
import structuremodel.decoratormodel.decorator.Milk;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 description:"+order.getDescription());

        System.out.println("*********");
        order = new Espresso();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:"+order.cost());
        System.out.println("order2 description:"+order.getDescription());

    }
}
