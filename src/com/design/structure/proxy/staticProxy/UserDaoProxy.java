package com.design.structure.proxy.staticProxy;

import com.business.dao.UserDao;
/**
 * 代理模式
 * @Title: ProxyUserDao.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>通过代理对象，控制某个对象，进行一些中间层的处理
 *               <br>应用场景：1.权限控制   2.对已有工程进行日志打印   3.性能监控   4.客户端不能直接操作某个对象，但又必须与之互动
 * @Company: 17K
 * @Created on 2015年7月31日 下午5:02:01
 * @author yangkai
 */
public class UserDaoProxy {

    private UserDao ud;

    public UserDaoProxy(UserDao ud) {
        this.ud = ud;
    }

    /**
     * 代理类在原函数的基础上做些操作，比如打印日志、权限控制
     * @param userName
     * @return
     */
    public boolean login(String userName) {
        boolean flag = false;
        flag = ud.login(userName);
        System.out.println("------打印日志------");
        return flag;
    }
}
