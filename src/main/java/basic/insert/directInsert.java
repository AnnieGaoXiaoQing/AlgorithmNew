package basic.insert;


/**
 * Created by gaoxiaoqing on 2018/7/26.
 */
public class directInsert {

    /**
     * 排序
     *
     * @param arrays 待排序数据
     * @param n      数组长度
     * @return
     */
    public static void sort(int[] arrays, int n) {
        int j = 0;
        for (int i = 1; i < arrays.length; i++) {
            int tem = arrays[i]; //临时变量
            j = i - 1;
            while (j >= 0 && tem < arrays[j]) {
                arrays[j + 1] = arrays[j];
                j = j - 1;
            }
            arrays[j + 1] = tem;
        }
        System.out.print("result = " + arrays);
    }

    public static void main(String[] args) {
        int[] arrays = {6,5,3,1,8,7,2,4};
        sort(arrays,arrays.length);
    }
}
