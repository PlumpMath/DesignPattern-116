package com.business.filter;


/**
 * 权限过滤器
 * 
 * @Title: AuthorityFilter.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 * @Company: 17K
 * @Created on 2015年7月31日 上午11:52:19
 * @author yangkai
 */
public class AuthorityFilterImpl implements BaseFilter,AuthorityFilter{

    public void filter() {
        System.out.println("用户有了***权限，可以处理什么东西");
    }

    @Override
    public void hasAuth() {
        // 通过数据库查找权限表
        System.out.println("用户是否有权限...");
    }
}
