package com.test;

import java.util.Arrays;

import org.junit.Test;

import com.business.bean.User;
import com.business.dao.UserDao;
import com.business.filter.AuthorityFilter;
import com.business.filter.BaseFilter;
import com.business.filter.LoginFilter;
import design.create.factory.BeanFactory;
import design.structure.adapter.AdapterBoth;
import design.structure.adapter.AdapterSingle;
import design.structure.decorator.LogDecorator;
import design.structure.proxy.staticProxy.UserDaoProxy;
import design.structure.template.FloatBubbleSortter;
import design.structure.template.IntBubbleSortter;

/**
 * 
 * @Title: TestCase.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 *               测试用例；测试结构模式
 * @Created on 2015年7月31日 上午11:21:31
 * @author yangkai
 */
public class TestCaseStructure {

    /**
     * 测试单项适配器模式
     */
    @Test
    public void TestAdapterSingle() {
        BaseFilter bf = (BaseFilter) BeanFactory.getBean("authorityFilter");
        AdapterSingle as = new AdapterSingle(bf);
        as.filter();
    }

    /**
     * 测试双向适配器模式
     */
    @Test
    public void TestAdapterBoth() {
        AuthorityFilter authorityFilter = (AuthorityFilter) BeanFactory.getBean("authorityFilter");
        LoginFilter loginFilter = (LoginFilter) BeanFactory.getBean("loginFilter");
        AdapterBoth ab = new AdapterBoth();
        ab.setAf(authorityFilter);
        ab.setLf(loginFilter);
        ab.hasAuth();
        ab.isLogin();
    }

    /**
     * 测试装饰器模式
     */
    @Test
    public void TestDecorator() {
        BaseFilter bf = (BaseFilter) BeanFactory.getBean("authorityFilter"); // loginFilter
        LogDecorator dc = new LogDecorator(bf);
        dc.covert();
    }

    /**
     * 测试代理模式
     */
    @Test
    public void testProxy() {
        UserDao ud = (UserDao) BeanFactory.getBean("userDao");
        UserDaoProxy pud = new UserDaoProxy(ud);
        pud.login("杨凯");
    }

    /**
     * 测试享元模式
     */
    @Test
    public void testFlyweight() {
        UserDao ud = (UserDao) BeanFactory.getBean("userDao");
        User u = ud.getUserById(1);
        System.out.println(u);
    }

    /**
     * 测试模板模式
     */
    @Test
    public void testTemplate() {
        int[] idatas = { 3, 1, 5, 6, 9, 0 };
        IntBubbleSortter ibs = new IntBubbleSortter();
        ibs.sort(idatas);
        System.out.println(Arrays.toString(idatas));
        float[] fdatas = { 3.1f, 3.5f, 5.8f, 5.6f, 5.9f, 4 };
        FloatBubbleSortter fbs = new FloatBubbleSortter();
        fbs.sort(fdatas);
        System.out.println(Arrays.toString(fdatas));
    }
}
