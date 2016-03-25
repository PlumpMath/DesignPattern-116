package design.structure.template;

/**
 * 
 * @Title: IntBubbleSortter.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 *               功能概述：float 类型数组排序 <br>
 * @Created on 2015年9月9日 下午11:06:16
 * @author yangkai
 */
public class FloatBubbleSortter extends BubbleSortter {

    private float[] datas = null;

    @Override
    public boolean compareTo(int index) {
        boolean flag = false;
        if (datas[index] > datas[index + 1])
            flag = true;
        return flag;
    }

    @Override
    public void swap(int index) {
        float temp = datas[index];
        datas[index] = datas[index + 1];
        datas[index + 1] = temp;
    }

    public void sort(float[] datas) {
        this.datas = datas;
        sortTemplate(datas.length);
    }
}
