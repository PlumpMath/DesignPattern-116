package design.create.singleton;

import java.io.File;

import design.create.factory.BeanFactory;

/**
 *   单例模式
 *   又称单态模式
 * @Title: FileSingletonHungry.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               饿汉式<br>
 *               即在类初始化的时候就创建对象，用的时候直接获取<br>
 *               如果看到一个类构造函数是被保护的;或者对象不是new出来的还是其他方法获取的，比如：Logger log = Logger.getLogger()；一般就是使用的单例模式
 * @Created on 2015年7月31日 上午11:06:21
 * @author yangkai
 */
public class SingletonHungryFile {

    private static SingletonHungryFile file = new SingletonHungryFile();

    private SingletonHungryFile() {
        System.out.println("文件处理构造函数，进行一些操作");
    }

    /**
     *获取文件创建者实例对象 
     * @return
     */
    public static SingletonHungryFile getInstance() {
        return file;
    }

    /**
     * 创建文件方法
     * @param fileName
     * @return
     */
    public File createFile(String fileName){
        String directory = BeanFactory.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        return new File(directory.concat(fileName));
    }
}
