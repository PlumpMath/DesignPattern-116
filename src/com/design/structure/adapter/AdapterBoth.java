package com.design.structure.adapter;

import com.business.filter.AuthorityFilter;
import com.business.filter.LoginFilter;

/**
 * 双向适配器
 * 
 * @Title: AdapterBoth.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               要点：扩展模块注入到主模块；组合方式<br>
 *               1.采用面向接口编程，降低耦合性； <br>
 *               2.配合工厂模式或者spring框架使用，增加灵活性 <br>
 *               实现A B的接口目的是防止被适配的A B的其他方法丢失
 * @Company: 17K
 * @Created on 2015年7月31日 上午11:48:38
 * @author yangkai
 */
public class AdapterBoth implements AuthorityFilter, LoginFilter {

    private AuthorityFilter af;

    private LoginFilter lf;

    public void setAf(AuthorityFilter af) {
        this.af = af;
    }

    public void setLf(LoginFilter lf) {
        this.lf = lf;
    }

    /**
     * 重写登陆过滤器方法，在登陆前验证权限
     */
    public void isLogin() {
        System.out.println("-----开始执行登陆判断组合方法----");
        af.hasAuth();
        lf.isLogin();
    }

    /**
     * 重写权限过滤器方法，在权限前验证是否登陆
     */
    public void hasAuth() {
        System.out.println("-----开始执行权限判断组合方法----");
        lf.isLogin();
        af.hasAuth();
    }

    /**
     * 重写接口中的其他方法；防止其他函数功能丢失
     */
    @Override
    public void isLogout() {
        lf.isLogout();
    }
}
