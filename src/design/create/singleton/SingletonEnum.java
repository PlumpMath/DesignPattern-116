package design.create.singleton;
/**
 * 
 * @Title: SingletonEnum.java
 * @Description: <br>
 *               <br>使用枚举 构造单例需求
 * @Created on 2016年2月17日 下午4:56:43
 * @author yangkai
 * @version 1.0
 */
public enum SingletonEnum {

    instance;
    private String other;
    SingletonEnum(){}
}
