package com.business.filter;


/**
 * 登陆过滤器
 * 
 * @Title: AuthorityFilter.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 * @Company: 17K
 * @Created on 2015年7月31日 上午11:52:19
 * @author yangkai
 */
public interface LoginFilter{

    public void isLogin();
    
    public void isLogout();
}
