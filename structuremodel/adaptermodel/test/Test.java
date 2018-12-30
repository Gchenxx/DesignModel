package structuremodel.adaptermodel.test;

import structuremodel.adaptermodel.adapter.TurkeyAdapter;
import structuremodel.adaptermodel.duck.Duck;
import structuremodel.adaptermodel.duck.GreenHeadDuck;
import structuremodel.adaptermodel.turkey.WildTurkey;

/**
 * 火鸡冒充鸭子
 */

public class Test {
    public static void main(String[] args){
        GreenHeadDuck duck = new GreenHeadDuck();
        WildTurkey turkey = new WildTurkey();

        Duck duck2turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        duck2turkeyAdapter.quack();
        duck2turkeyAdapter.fly();

    }
}
