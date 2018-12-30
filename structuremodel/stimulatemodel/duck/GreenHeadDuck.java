package structuremodel.stimulatemodel.duck;

import structuremodel.stimulatemodel.flybehavior.GoodFlyBehavior;
import structuremodel.stimulatemodel.quackbehavior.GeGeQuackBehavior;

public class GreenHeadDuck extends Duck{
    public GreenHeadDuck(){
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("GreenHeadDuck");
    }
}
