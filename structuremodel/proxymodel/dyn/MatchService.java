package structuremodel.proxymodel.dyn;

import java.lang.reflect.Proxy;

/**
 * 对于joe用户的访问权限控制
 */
public class MatchService {
    public MatchService(){
        PersonBean joe = getPersonInfo("joe","male","running");
        PersonBean OwnProxy = getOwnProxy(joe);
        System.out.println("Name is "+OwnProxy.getName());
        System.out.println("Interests is "+OwnProxy.getInterests());

        OwnProxy.setInterests("Bowling");
        System.out.println("Interests are "+OwnProxy.getInterests());
        OwnProxy.setHotOrNotRating(50);
        System.out.println("Rating is "+OwnProxy.getHotOrNotRating());
        OwnProxy.setHotOrNotRating(40);
        System.out.println("Rating is "+OwnProxy.getHotOrNotRating());

        System.out.println("************");

        PersonBean nonOwnProxy = getNonOwnProxy(joe);
        System.out.println("Name is "+nonOwnProxy.getName());
        System.out.println("Interests is "+nonOwnProxy.getInterests());
        nonOwnProxy.setInterests("haha");
        System.out.println("Interests is "+nonOwnProxy.getInterests());
        nonOwnProxy.setHotOrNotRating(60);
        System.out.println("Rating is "+nonOwnProxy.getHotOrNotRating());
    }
    public PersonBean getPersonInfo(String name,String gender,String interests){
        PersonBean person = new PersonBeanImpl();
        person.setName(name);
        person.setGender(gender);
        person.setInterests(interests);
        return person;
    }
    PersonBean getOwnProxy(PersonBean personBean){
        return (PersonBean)Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }
    PersonBean getNonOwnProxy(PersonBean personBean){
        return (PersonBean)Proxy.newProxyInstance(personBean.getClass().getClassLoader(),personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }
}
