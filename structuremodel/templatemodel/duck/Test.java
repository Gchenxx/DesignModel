package structuremodel.templatemodel.duck;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        Duck[] duck = {
                new Duck("Duck1",(int)(Math.random()*100)),
                new Duck("Duck2",(int)(Math.random()*100)),
                new Duck("Duck3",(int)(Math.random()*100)),
                new Duck("Duck4",(int)(Math.random()*100)),
                new Duck("Duck5",(int)(Math.random()*100)),
                new Duck("Duck6",(int)(Math.random()*100)),
                new Duck("Duck7",(int)(Math.random()*100)),
                new Duck("Duck8",(int)(Math.random()*100)),
        };
        System.out.println("before sort");
        display(duck);
        Arrays.sort(duck);
        System.out.println("after sort");
        display(duck);
    }
    public static void display(Duck[] duck){
        for(int i = 0;i<duck.length;i++){
            System.out.println(duck[i]);
        }
    }
}
