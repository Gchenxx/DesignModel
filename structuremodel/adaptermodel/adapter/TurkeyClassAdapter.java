package structuremodel.adaptermodel.adapter;

import structuremodel.adaptermodel.duck.Duck;
import structuremodel.adaptermodel.turkey.WildTurkey;

public class TurkeyClassAdapter extends WildTurkey implements Duck {
    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }
}
