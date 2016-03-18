package com.design.structure.template;

/**
 * 
 * @Title: BubbleSortter.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 *       功能概述：模板模式 <br>
 *       模板模式核心：定义一个抽象的父类，把一些公共模板方法定义成普通已实现的方法，把一些特殊方法定义成抽象方法交由子类去实现；<br>
 *                              提供一个钩子函数按业务逻辑去分别调用这些普通方法和抽象方法。
 *         1 优点  　　　　<br>
 *               1.1 模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。 　　　　<br>
 *               1.2 子类实现算法的某些细节，有助于算法的扩展。 　　　　<br>
 *               1.3 通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合“开放-封闭原则”。 　<br>
 *          2 缺点 　　　<br>
 *               每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。 　　<br>
 *          3 适用场景 　　　<br>
 *               3.1 在某些类的算法中，用了相同的方法，造成代码的重复。 　　　　<br>
 *               3.2 控制子类扩展，子类必须遵守算法规则。<br>
 *               
 *        案例分析：  用冒泡算法分别对整型数组、浮点数数组排序
 *              
 * @Created on 2015年9月9日 下午10:48:16
 * @author yangkai
 */
public abstract  class BubbleSortter {

   /**
    * 比较函数;留给子类实现
    * @param index
    * @return
    */
    public abstract boolean compareTo(int index);
    /**
     * 交换函数，留给子类实现
     * @param index
     */
    public abstract void swap(int index);
    
    /**
     * 冒泡排序；钩子函数
     * 
     * @return
     */
    public void sortTemplate(int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (compareTo(j))
                    swap(j);
            }
        }
    }
}
