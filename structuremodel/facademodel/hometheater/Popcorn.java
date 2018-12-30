package structuremodel.facademodel.hometheater;

public class Popcorn {
    private static Popcorn popcorn = null;
    private Popcorn(){}
    public static Popcorn getInstance(){
        if(popcorn == null){
            popcorn = new Popcorn();
        }
        return popcorn;
    }

    public void on(){
        System.out.println("Popcorn on");
    }
    public void off(){
        System.out.println("Popcorn off");
    }
    public void pop(){
        System.out.println("Popcorn is popping");
    }
}
