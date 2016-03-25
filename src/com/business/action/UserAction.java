package com.business.action;

import com.business.dao.UserDao;
import design.create.factory.BeanFactory;
/**
 * 
 * @Title: UserAction.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>操作类
 * @Created on 2015年7月31日 上午11:28:11
 * @author yangkai
 */
public class UserAction {

    private UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
    public String login(String userName){
        userDao.login(userName);
        return "success";
    }
}
