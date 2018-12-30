package structuremodel.mementomodel;

import java.util.ArrayList;

public class Originator2 {
    private ArrayList<String> state;
    public Originator2(){
        this.state = new ArrayList<>();
    }
    public MementoIF createMemento(){
        return new Memento(state);
    }
    public void restoreMemento(MementoIF mementoIF){
        this.state = ((Memento)mementoIF).getState();
    }

    public void testState1(){
        state.clear();
        state.add("blood:1000");
        state.add("progress:gate1 state");
    }
    public void testState2(){
        state.clear();
        state.add("blood:900");
        state.add("progress:gate2 state");
    }

    public void showState(){
        System.out.println("now state:"+state.toString());
    }

    private class  Memento implements MementoIF{
        private ArrayList<String> state;
        private Memento(ArrayList<String> state){
            // 新new一个，否则保存的state对象与原对象指向相同的内存，继续对原对象修改的话，保存的
            // 对象也会被修改，起不到备忘录的效果
            this.state = new ArrayList(state);
        }
        private ArrayList<String> getState(){
            return state;
        }
        private void setState(ArrayList<String> state){
            this.state = state;
        }
    }
}
