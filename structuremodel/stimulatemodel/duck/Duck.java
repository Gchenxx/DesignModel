package structuremodel.stimulatemodel.duck;

import structuremodel.stimulatemodel.flybehavior.BadFlyBehavior;
import structuremodel.stimulatemodel.flybehavior.FlyBehavior;
import structuremodel.stimulatemodel.quackbehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void fly(){
        flyBehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }
    public abstract void display();
}
