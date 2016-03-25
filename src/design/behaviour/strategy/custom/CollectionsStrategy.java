package design.behaviour.strategy.custom;

public class CollectionsStrategy {

    /**
     * 冒泡排序
     * 
     * @return
     */
    public static void sort(Object[] datas) {
        for (int i = 0; i < datas.length - 1; i++) {
            for (int j = 0; j < datas.length - 1 - i; j++) {
                ComparableStrategy csx = (ComparableStrategy) datas[j];
                ComparableStrategy csy = (ComparableStrategy) datas[j + 1];
                if (csx.compareTo(csy) == 1)
                    swap(datas, j, j + 1);
            }
        }
    }

    /**
     * 临时值交换
     * 
     * @param datas
     *            数组
     * @param i
     * @param j
     */
    public static void swap(Object[] datas, int i, int j) {
        Object temp = datas[i];
        datas[i] = datas[j];
        datas[j] = temp;
    }
}
