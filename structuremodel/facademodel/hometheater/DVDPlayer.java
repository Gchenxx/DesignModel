package structuremodel.facademodel.hometheater;

public class DVDPlayer {
    private static DVDPlayer dvdPlayer = null;
    private DVDPlayer(){}
    public static DVDPlayer getInstance(){
        if(dvdPlayer == null){
            dvdPlayer = new DVDPlayer();
        }
        return dvdPlayer;
    }

    public void on(){
        System.out.println("DVDPlayer on");
    }
    public void off(){
        System.out.println("DVDPlayer off");
    }

    public void play(){
        System.out.println("DVDPlayer is playing");
    }
    public void pause(){
        System.out.println("DVDPlayer pause");
    }
    public void setdvd(){
        System.out.println("DVDPlayer is setting dvd");
    }
}
