package structuremodel.facademodel.test;

import structuremodel.facademodel.hometheater.HomeTheaterFacade;

public class Test {
    public static void main(String[] args){
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }
}
