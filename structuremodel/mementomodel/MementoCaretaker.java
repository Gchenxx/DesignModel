package structuremodel.mementomodel;

import java.util.HashMap;

public class MementoCaretaker {
    private HashMap<String,MementoIF> mementomap;

    public MementoCaretaker(){
        this.mementomap = new HashMap<>();
    }

    public MementoIF retrieveMemento(String name){
        return mementomap.get(name);
    }

    public void saveMemento(String name,MementoIF mementoIF){
        this.mementomap.put(name,mementoIF);
    }
}
