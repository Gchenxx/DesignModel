package structuremodel.proxymodel.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException{
        super();
    }
    @Override
    public String sayHello() throws RemoteException{
        return "Hello RMI";
    }
    public static void main(String[] args){
        try {
            MyRemote service = new MyRemoteImpl();
//            LocateRegistry.createRegistry(6600);
            Naming.bind("rmi://127.0.0.1:6600/RemoteHello", service);
//            Naming.rebind();
            /**
             * 链接：https://www.nowcoder.com/questionTerminal/629d444d8d21471aae8564e5203a36ba
             * 来源：牛客网
             *
             * bind(String name,Object obj)：注册对象，把对象与一个名字name绑定，这里的name其实就是URL格式。
             * 如果该名字已经与其它对象绑定，就会抛出NameAlreadyBoundException。
             *
             * rebind(String name,Object obj)：注册对象，把对象与一个名字绑定。如果该名字已经与其它对象绑定，
             * 不会抛出NameAlreadyBoundException，而是把当前参数obj指定的对象覆盖原先的对象。
             */
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
