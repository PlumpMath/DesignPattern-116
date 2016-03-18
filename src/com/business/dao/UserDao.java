package com.business.dao;

import com.business.bean.User;

/**
 * 
 * @Title: UserDao.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>数据库操作接口
 * @Company: 17K
 * @Created on 2015年7月31日 上午11:28:42
 * @author yangkai
 */
public interface UserDao {

    public boolean login(String userName);
    
    public User getUserById(int userId);
}
