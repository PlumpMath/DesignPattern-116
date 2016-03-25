package design.create.singleton;

import java.io.File;

import design.create.factory.BeanFactory;

/**
 *   单例模式
 * @Title: FileSingletonHungry.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               饱汉式 <br>
 *               作用： 1.减少应用程序中的实例对象数量；节省内存   2.保证对象唯一性<br>
 *               应用场景： 1.建立文件目录   2.数据库连接<br>
 *               即在用的时候才创建对象；但是饱汉式一定要注意，同步并发问题，多个线程进来可能会创建多个对象，所以获取实例的时候一定要使用锁保证对象唯一性
 * @Created on 2015年7月31日 上午11:06:21
 * @author yangkai
 */
public class SingletonFullFile {

    private static SingletonFullFile file = null;

    private SingletonFullFile() {
        System.out.println("构造函数，进行一些操作");
    }

    /**
     * 获取文件创建者实例对象
     * 
     * @return
     */
    public static synchronized SingletonFullFile getInstance() {
        if (file == null)
            file = new SingletonFullFile();
        return file;
    }

    /**
     * 创建文件方法
     * 
     * @param fileName
     * @return
     */
    public File createFile(String fileName) {
        String directory = BeanFactory.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        return new File(directory.concat(fileName));
    }
}
