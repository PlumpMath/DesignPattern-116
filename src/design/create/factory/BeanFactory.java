package design.create.factory;

import java.io.File;

import design.create.singleton.SingletonFullFile;
import design.create.singleton.SingletonHungryFile;
import com.util.xml.Dom4jParseXml;

/**
 * 工厂模式
 * 
 * @Title: DaoFactory.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               使用反射机制，减少工厂的数量 <br>
 *               作用：1.统一管理对象的建立   2.减少模块的耦合性<br>
 *               应用场景：1.模块调用接口较多的情况   2.实例化一个对象的时候需要进行一些复制的操作
 * @Created on 2015年7月28日 下午6:57:12
 * @author yangkai
 */
public class BeanFactory {

    public static Object getBean(String beanName) {
        Object obj = null;
        try {
            // File file = FileSingletonHungry.getInstance().createFile("beanFactory.xml");
            File file = SingletonFullFile.getInstance().createFile("beanFactory.xml");
            String className = Dom4jParseXml.parserXml(file, beanName); // 根据配置文件获取daoName对应的类名，采用解析xml配置的方式
            obj = Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

}
