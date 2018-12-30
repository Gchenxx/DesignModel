package structuremodel.mementomodel;

import java.util.HashMap;

public class Originator {
    private HashMap<String,String> state;
    public Originator(){
        this.state = new HashMap<>();
    }

    public MementoIF  createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(MementoIF mementoIF){
        state = ((Memento)mementoIF).getState();
    }

    public void showState(){
        System.out.println("now state:"+state.toString());
    }

    public void testState1(){
        state.put("blood","500");
        state.put("progress","gate3 state");
        state.put("enemy","3");
    }
    public void testState2(){
        state.put("blood","400");
        state.put("progress","gate7 state");
        state.put("enemy","10");
    }

    private class  Memento implements MementoIF{
        private HashMap<String ,String> state;
        private Memento(HashMap state){
            // 新new一个，否则保存的state对象与原对象指向相同的内存，继续对原对象修改的话，保存的
            // 对象也会被修改，起不到备忘录的效果
            this.state = new HashMap<>(state);
        }
        private HashMap getState(){
            return state;
        }
        private void setState(HashMap state){
            this.state = state;
        }
    }

}
