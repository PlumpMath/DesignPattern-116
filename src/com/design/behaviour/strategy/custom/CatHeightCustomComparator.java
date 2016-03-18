package com.design.behaviour.strategy.custom;

/**
 * 猫的高低比大小
 * @Title: CatHeightComparator.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>功能概述：                 
 *               <br>            
 * @Created on 2015年8月5日 下午3:30:09
 * @author yangkai
 */
public class CatHeightCustomComparator implements ComparatorStrategy<CatCustom> {

    @Override
    public int compare(CatCustom t1, CatCustom t2) {
        if (t1.getHeight() == t2.getHeight())
            return 0;
        else if (t1.getHeight() > t2.getHeight())
            return 1;
        else
            return -1;
    }

}
