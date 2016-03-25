package design.create.singleton;

/**
 * 
 * @Title: SingltonClssics.java
 * @Description: <br>
 * <br>双重判定检验锁  最经典但是有问题的单例实现方式，使用volatile修饰instance就不会有问题了；否则jvm 内存模型会出现指令重排问题
 * @Created on 2016年2月17日 下午4:37:04
 * @author yangkai
 * @version 1.0
 */
public class SingletonClassics {

    private static volatile SingletonClassics instance = null;

    private SingletonClassics() {
    }

    public static SingletonClassics getInstance() {
        if (instance != null) {
            synchronized (SingletonClassics.class) {
                if (instance != null) {
                    instance = new SingletonClassics();
                }
            }
        }
        return instance;
    }

}
