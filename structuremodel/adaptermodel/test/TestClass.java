package structuremodel.adaptermodel.test;

import structuremodel.adaptermodel.adapter.TurkeyAdapter;
import structuremodel.adaptermodel.adapter.TurkeyClassAdapter;
import structuremodel.adaptermodel.duck.Duck;
import structuremodel.adaptermodel.duck.GreenHeadDuck;
import structuremodel.adaptermodel.turkey.WildTurkey;

/**
 * 火鸡冒充鸭子
 */

public class TestClass {
    public static void main(String[] args){
        GreenHeadDuck duck = new GreenHeadDuck();
        WildTurkey turkey = new WildTurkey();

        TurkeyClassAdapter turkeyClassAdapter = new TurkeyClassAdapter();

        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        turkeyClassAdapter.quack();
        turkeyClassAdapter.fly();

    }
}
