package com.business.filter;


/**
 * 登陆过滤器
 * 
 * @Title: AuthorityFilter.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 * @Created on 2015年7月31日 上午11:52:19
 * @author yangkai
 */
public class LoginFilterImpl implements BaseFilter,LoginFilter{

    public void filter() {
        System.out.println("用户登陆了**，可以操作一些东西");
    }

    @Override
    public void isLogin() {
     // 判断session 等用户登陆信息
        System.out.println("用户是否登陆...");
    }

    @Override
    public void isLogout() {
        System.out.println("用户是否退出...");
    }
}
