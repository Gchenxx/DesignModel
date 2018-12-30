package structuremodel.mementomodel;

public class Test {
    public static void main(String[] args){
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Originator originator = new Originator();
        Originator2 originator2 = new Originator2();

        originator.testState1();
        mementoCaretaker.saveMemento("originator",originator.createMemento());
        originator.showState();
        originator.testState2();
        originator.showState();
        originator.restoreMemento(mementoCaretaker.retrieveMemento("originator"));
        originator.showState();


        originator2.testState1();
        mementoCaretaker.saveMemento("originator2",originator2.createMemento());
        originator2.showState();
        originator2.testState2();
        originator2.showState();
        originator2.restoreMemento(mementoCaretaker.retrieveMemento("originator2"));
        originator2.showState();

    }
}
