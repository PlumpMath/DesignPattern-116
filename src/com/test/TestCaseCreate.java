package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.business.action.UserAction;
import com.design.create.factory.BeanFactory;

/**
 * 
 * @Title: TestCase.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 *               测试用例；测试创建模式
 * @Company: 17K
 * @Created on 2015年7月31日 上午11:21:31
 * @author yangkai
 */
public class TestCaseCreate {

    UserAction userAction = (UserAction) BeanFactory.getBean("userAction");

    /**
     * 测试工厂模式和单例模式
     */
    @Test
    public void testLogin() {
        Assert.assertEquals("success", userAction.login("yk"));
    }

}
