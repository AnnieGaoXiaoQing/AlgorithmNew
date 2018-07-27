package basic.select;

import java.util.Arrays;

/**
 * 直接选择
 * Created by gaoxiaoqing on 2018/3/22.
 */
public class directSelect {

    /**
     * 第一轮：从头到尾，选最小放最前
     * 第二轮：从第二开始，选次小放第二
     * 依次类推
     */
    public static void main(String[] args) {
        int[] array = {8, 3, 2, 1, 7, 4, 6, 5};
        selectSort(array);
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int mix = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[mix]) {
                    mix = j;
                }
            }
            if (mix != i) {
                swap(array, mix, i);
            }
        }
        printResult(array);
    }

    /**
     * 交换
     *
     * @param array
     * @param mix
     * @param i
     */
    private static void swap(int array[], int mix, int i) {
        int temp = array[mix];
        array[mix] = array[i];
        array[i] = temp;
    }

    /**
     * 输出相应数组的结果
     * @param array
     */
    private static void printResult(int[] array) {
        for(int value:array)
            System.out.print(" "+value+" ");
        System.out.println();
    }
}
