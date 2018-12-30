package structuremodel.stimulatemodel;

import structuremodel.stimulatemodel.duck.Duck;
import structuremodel.stimulatemodel.duck.GreenHeadDuck;

public class Test {
    public static void main(String[] args){
        Duck duck = new GreenHeadDuck();
        duck.fly();
        duck.quack();
        duck.display();
    }
}
