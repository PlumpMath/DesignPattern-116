package com.design.behaviour.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 * 发布/订阅模式
 * @Title: Observer.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>产品类；被观察者    不用关心要通知谁
 *               <br>作用：1.减低模块之间的耦合性
 *               
 * @Company: 17K
 * @Created on 2015年7月31日 下午6:41:40
 * @author yangkai
 */
public class ProductObservable extends Observable{

    private String name;
    private double price;
    public ProductObservable(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }
    
    public void setObserver(Observer observer) {
        this.addObserver(observer);
    }

    public void changerPrice(double newPrice){
        this.setChanged();  //设置变化点；表示通知观察者
        this.notifyObservers(name+"价格涨了："+(newPrice-price));  //通知所有观察者，给他们发个消息   这时就会自动调用观察者的update方法
        this.price = newPrice;
    }
}
