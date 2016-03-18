package com.design.structure.flyweight;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 享元模式
 * 
 * @Title: Flyweight.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               解释：运用共享技术有效的支持大量细粒度的对象<br>
 *               应用场景:1.字处理软件 2.数据库连接池 <br>
 *               作用：1.提高程序效率和性能 2.减少相关内容对象开销，节省内存；使大家共享一个元类对象
 * @Company: 17K
 * @Created on 2015年7月31日 下午5:06:48
 * @author yangkai
 */
public class MybatisSessionFlyweight {

    private static Map<String, SqlSessionFactory> session = new HashMap<String, SqlSessionFactory>();

    /**
     * 获取sqlSession
     * 
     * @param id
     *            数据库id
     * @return
     */
    public static SqlSession getSqlSession(String id) {
        SqlSessionFactory factory = getSqlSessionFactory(id);
        return factory.openSession();
    }

    /**
     * 获取sqlSessionFactory
     * 
     * @param id
     * @return
     */
    private static SqlSessionFactory getSqlSessionFactory(String id) {
        if (session.containsKey(id))
            return session.get(id);
        InputStream inputStream = null;
        try {
            Properties prop = new Properties();
            inputStream = Resources.getResourceAsStream("db.properties");
            prop.load(inputStream);
            inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream, id, prop);
            session.put(id, sqlSessionFactory);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return session.get(id);
    }

}
