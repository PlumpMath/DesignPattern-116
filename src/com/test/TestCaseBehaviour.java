package com.test;

import java.util.Arrays;

import org.junit.Test;

import design.behaviour.observer.ProductObservable;
import design.behaviour.observer.CustomerObserver;
import design.behaviour.strategy.CatHeightJdkComparator;
import design.behaviour.strategy.CatJdk;
import design.behaviour.strategy.custom.CatHeightCustomComparator;
import design.behaviour.strategy.custom.CatWeightCustomComparator;

/**
 * 
 * @Title: TestCase.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 *               测试用例；测试行为模式
 * @Created on 2015年7月31日 上午11:21:31
 * @author yangkai
 */
public class TestCaseBehaviour {

    /**
     * 测试观察者模式
     */
    @Test
    public void testObserver() {
        ProductObservable product = new ProductObservable("电脑", 5000);
        CustomerObserver customer = new CustomerObserver("yk");
        product.setObserver(customer);
        product.changerPrice(8000);
    }

    /**
     * 测试策略模式
     */
    @Test
    public void testStrategy() {
        CatHeightCustomComparator chs = new CatHeightCustomComparator();
        CatWeightCustomComparator cws = new CatWeightCustomComparator();
        /**
         * 自定义comparable 和 comparator 接口
         */
        // CatCustom[] datas = { new CatCustom("小黄", 6, 2, cws), new CatCustom("小黑", 2, 3, cws), new CatCustom("小白", 5, 5, cws) };
        // CollectionsStrategy.sort(datas);
        /**
         * 使用jdk自带的comparable 和 comparator
         */
        CatHeightJdkComparator chjc = new CatHeightJdkComparator();
        CatJdk[] datas = { new CatJdk("小黄", 2, 2, chjc), new CatJdk("小黑", 1, 3, chjc), new CatJdk("小白", 9, 5, chjc) };
        Arrays.sort(datas);
        // 打印测试
        for (int i = 0; i < datas.length; i++)
            System.out.println(datas[i]);
    }
}
