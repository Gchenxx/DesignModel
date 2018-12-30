package structuremodel.facademodel.hometheater;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    public HomeTheaterFacade(){
        dvdPlayer = DVDPlayer.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
    }
    public void ready(){
        popcorn.on();
        popcorn.pop();
        projector.on();
        dvdPlayer.on();
        dvdPlayer.setdvd();
    }
    public void end(){
        popcorn.off();
        projector.off();
        dvdPlayer.off();
    }
    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }
}
