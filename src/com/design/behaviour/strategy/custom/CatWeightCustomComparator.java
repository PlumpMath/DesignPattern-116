package com.design.behaviour.strategy.custom;

/**
 * 猫的胖瘦比大小
 * @Title: CatWeightComparator.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>功能概述：                 
 *               <br>            
 * @Created on 2015年8月5日 下午3:29:49
 * @author yangkai
 */
public class CatWeightCustomComparator implements ComparatorStrategy<CatCustom> {


    @Override
    public int compare(CatCustom t1, CatCustom t2) {
        if (t1.getWeight() == t2.getWeight())
            return 0;
        else if (t1.getWeight() > t2.getWeight())
            return 1;
        else
            return -1;
    }

}
