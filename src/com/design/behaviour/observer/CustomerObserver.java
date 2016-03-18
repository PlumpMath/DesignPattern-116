package com.design.behaviour.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 观察者模式
 * @Title: ObserverCustomer.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>观察者；接收被观察者的消息
 * @Company: 17K
 * @Created on 2015年8月1日 下午3:02:36
 * @author yangkai
 */
public class CustomerObserver implements Observer{

    private String name;
    
    public CustomerObserver(String name) {
        super();
        this.name = name;
    }

    
    @Override
    public void update(Observable o, Object arg) {  //参数o：来源    参数arg：值
        System.out.println(o.getClass().getName()+"通知："+arg);
    }

    public void printCustomer(){
        System.out.println("打印观察者参数："+name);
    }
}
