package basic.exchange;

import java.util.Arrays;

/**
 * 冒泡排序
 * Created by gaoxiaoqing on 2018/3/22.
 */
public class bubble {

    /**
     * 第一轮：确定最大/最小的下沉
     * 第二轮：除去最后一个，依次比较
     */
    public static void main(String[] args) {
        int[] data = {5, 2, 33, 6, 12, 34, 9};
        System.out.println("最终结果 = " + bubble(data));
    }

    /**
     * 冒泡排序(小—大)
     */
    public static String bubble(int[] unSorted) {
        for (int i = 0; i < unSorted.length; i++) {
            System.out.println("i = " + i);
            for (int j = i; j < unSorted.length; j++) {  //j = i:只比较两个
                if (unSorted[i] > unSorted[j]) {
                    int temp = unSorted[i];
                    unSorted[i] = unSorted[j];
                    unSorted[j] = temp;
                }
                System.out.println("第j=" + j + "轮,结果 = " + Arrays.toString(unSorted));
            }
            System.out.println("第i=" + i + "轮,结果 = " + Arrays.toString(unSorted));
        }
        return Arrays.toString(unSorted);
    }
}
