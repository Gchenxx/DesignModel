package structuremodel.decoratormodel.myiodecorator;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest{
    public static void main(String[] args){
        int c;
        try{
            InputStream is = new BufferedInputStream(new FileInputStream("F:\\gengo\\test.txt"));
            InputStream in = new UppercaseInputStream(is);
            while((c=in.read())!=-1){
                System.out.print((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
