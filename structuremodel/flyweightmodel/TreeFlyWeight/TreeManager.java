package structuremodel.flyweightmodel.TreeFlyWeight;

public class TreeManager {
    private int length = 10000000;
    int[] xArray = new int[length], yArray = new int[length], ageArray = new int[length];
    private TryFlyWeight tryFlyWeight;
    public TreeManager(){
        tryFlyWeight = new TryFlyWeight();
        for(int i = 0;i<length;i++){
            xArray[i] = (int)(Math.random()*length);
            yArray[i] = (int)(Math.random()*length);
            ageArray[i] = (int)(Math.random()*length)%5;
        }
    }
    public void displayTree(){
        for(int i = 0;i<length;i++){
            tryFlyWeight.display(xArray[i],yArray[i],ageArray[i]);
        }
    }
}
