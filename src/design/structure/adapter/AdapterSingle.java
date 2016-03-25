package design.structure.adapter;

import com.business.filter.BaseFilter;
import com.business.filter.LoginFilterImpl;

/**
 * 单项适配器
 * 
 * @Title: AdapterSingle.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 *               将B类接到A类上使用，就叫单项适配；单项适配器用的比较多 <br>
 *               要点：扩展模块注入到主模块；继承方式 <br>
 *               作用：主要站在主模块角度，业务需求是主模块被需要扩展，可能需要被B服务，也可能需要被C服务；正好与装饰器相反 <br>
 *               A主动，主动方为主模块，B被动，被动方为扩展模块；主动方叫做adapter，被动方叫做adaptee <br>
 *               优势：可以灵活的应付扩展模块的切换、替换 <br>
 *               劣势：扩展模块不可以灵活的应付主模块的切换、替换 <br>
 *               类比：如果这个扩展模块需要为多个主模块服务，则不适合使用适配器，可以使用装饰器
 * @Created on 2015年7月31日 上午11:48:17
 * @author yangkai
 */
public class AdapterSingle extends LoginFilterImpl { // 父类为主模块

    public BaseFilter bf; // 扩展模块

    public AdapterSingle(BaseFilter bf) {
        this.bf = bf;
    }

    /**
     * 改造filter方法，对A B进行组装整合
     */
    @Override
    public void filter() {
        super.filter(); // 重写父类方法的时候，继承父类的函数可以去掉，直接调用其他的函数；这叫做功能替换
        bf.filter();
    }

}
