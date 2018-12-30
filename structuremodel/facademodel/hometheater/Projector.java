package structuremodel.facademodel.hometheater;

public class Projector {
    private int size = 5;
    private static Projector projector = null;
    private Projector(){}
    public  static Projector getInstance(){
        if(projector == null){
            projector = new Projector();
        }
        return projector;
    }

    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
    public void focus(){
        System.out.println("Projector is focus");
    }
    public void zoom(int size){
        this.size = size;
        System.out.println("Projector zoom to "+size);
    }
}
