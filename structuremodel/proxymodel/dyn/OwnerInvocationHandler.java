package structuremodel.proxymodel.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 此类用于控制哪些可以访问，哪些不能访问
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;
    public OwnerInvocationHandler(PersonBean personBean){
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);  // 对象personBean调用method方法，参数为args
        }else if(method.getName().equals("setHotOrNotRating")){
            return new IllegalAccessException();
        }else if(method.getName().startsWith("set")){
            return method.invoke(personBean,args);
        }
        return null;
    }
}
