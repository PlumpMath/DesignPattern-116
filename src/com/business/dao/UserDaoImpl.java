package com.business.dao;

import org.apache.ibatis.session.SqlSession;

import com.business.bean.User;
import com.business.mapper.UserMapper;
import design.structure.flyweight.MybatisSessionFlyweight;

/**
 * 
 * @Title: UserDaoImpl.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               <br>数据库操作实现类
 * @Created on 2015年7月31日 上午11:28:29
 * @author yangkai
 */
public class UserDaoImpl implements UserDao {

    @Override
    public boolean login(String userName) {
        /**
         * 处理登陆dao逻辑
         */
        System.out.println("用户：*"+userName+"*登陆了！");
        return false;
    }

    /**
     * 根据用户id获取用户对象
     */
    @Override
    public User getUserById(int userId) {
        User u = null;
        SqlSession session = null;
        try {
            session  = MybatisSessionFlyweight.getSqlSession("mydb");
            UserMapper mapper = session.getMapper(UserMapper.class);
            u = mapper.getUserByUserId(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(session!=null)
                session.close();
        }
        return u;
    }

}
