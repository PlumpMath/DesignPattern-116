package com.design.behaviour.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.design.behaviour.strategy.custom.CatCustom;
import com.design.behaviour.strategy.custom.CatHeightCustomComparator;
import com.design.behaviour.strategy.custom.CatWeightCustomComparator;

public class JavaComparator {

    /**
     * java collections 工具包的方法；采用自定义的compare方法
     * 
     * @param list
     */
    public static void collectionsSortCustom(List<CatCustom> list) {
        Collections.sort(list, new Comparator<CatCustom>() {
            @Override
            public int compare(CatCustom o1, CatCustom o2) {
                return o1.compareTo(o2);
            }
        });
    }


    /**
     * java collections 工具包的方法提供的比较方法;string 中带的compareTo方法
     * 
     * @param list
     */
    public static void collectionsSort(List<CatCustom> list) {
        Collections.sort(list, new Comparator<CatCustom>() {
            @Override
            public int compare(CatCustom o1, CatCustom o2) {
                return (o1.getHeight()+"").compareTo(o2.getHeight()+"");
            }
        });
    }
    public static void main(String[] args) {
        CatHeightCustomComparator chs = new CatHeightCustomComparator();
        CatWeightCustomComparator cws = new CatWeightCustomComparator();
        List<CatCustom> list = new ArrayList<CatCustom>();
        list.add(new CatCustom("小黄", 6, 2, cws));
        list.add(new CatCustom("小黑", 2, 3, cws));
        list.add(new CatCustom("小白", 5, 5, cws));
        collectionsSort(list);
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
