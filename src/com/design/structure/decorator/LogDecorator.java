package com.design.structure.decorator;

import com.business.filter.BaseFilter;

/**
 * 装饰器模式
 * 
 * @Title: Decorator.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               要点：主模块接口注入扩展模块 <br>
 *               应用场景：比如JDK中io包里的类大量在使用装饰器模式；比如：FileReader和BufferFileReader <br>
 *               作用：主要站在扩展模块角度，业务需求是需要扩展主模块，可能为B扩展，也可能为C扩展；正好与适配器相反
 * @Company: 17K
 * @Created on 2015年7月31日 下午3:41:52
 * @author yangkai
 */
public class LogDecorator { // 扩展模块

    private BaseFilter filter; // 主模块

    public LogDecorator(BaseFilter filter) {
        this.filter = filter;
    }

    public void covert() {
        filter.filter();
        System.out.println("打印日志");
    }
}
