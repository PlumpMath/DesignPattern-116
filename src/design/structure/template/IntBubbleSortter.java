package design.structure.template;

/**
 * 
 * @Title: IntBubbleSortter.java
 * @Copyright: Copyright (c) 2005
 * @Description: <br>
 * <br>
 *               功能概述：int 类型数组排序 <br>
 * @Created on 2015年9月9日 下午11:06:16
 * @author yangkai
 */
public class IntBubbleSortter extends BubbleSortter {

    private int[] datas = null;

    @Override
    public boolean compareTo(int index) {
        boolean flag = false;
        if (datas[index] > datas[index + 1])
            flag = true;
        return flag;
    }

    @Override
    public void swap(int index) {
        int temp = datas[index];
        datas[index] = datas[index + 1];
        datas[index + 1] = temp;
    }

    public void sort(int[] datas) {
        this.datas = datas;
        sortTemplate(datas.length);
    }
}
