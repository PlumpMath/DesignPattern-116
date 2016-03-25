package design.behaviour.strategy;

import java.util.Comparator;


/**
 * 猫实例
 * 使用策略模式  具体比较方法有具体子类实现
 * @Title: Cat.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 *               功能概述： 为设计模式服务;实现jdk自带的comparabale，组合jdk自带的comparator <br>
 * @Created on 2015年8月5日 下午2:51:34
 * @author yangkai
 */
public class CatJdk implements Comparable<CatJdk> {

    private int id;

    private String name;

    private int height;

    private int weight;

    private Comparator<CatJdk> comparator;

    public CatJdk(String name, int height, int weight, Comparator<CatJdk> comparator) {
        super();
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.comparator = comparator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat [id=" + id + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
    }

    @Override
    public int compareTo(CatJdk o) {
        return comparator.compare(this, o);
    }

}
