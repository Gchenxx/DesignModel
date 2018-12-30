package structuremodel.adaptermodel.adapter;

import structuremodel.adaptermodel.duck.Duck;
import structuremodel.adaptermodel.turkey.Turkey;
import structuremodel.adaptermodel.turkey.WildTurkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 6 ; i++) {
            turkey.fly();
        }
    }
}
