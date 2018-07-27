package basic.insert;

/**
 * Created by gaoxiaoqing on 2018/7/26.
 */
public class shell {

    public static void sort(int[] arrays) {
        int incrementNum = arrays.length / 2;
        while (incrementNum >= 1) {
            for (int i = 0; i < arrays.length; i++) {
                //进入插入排序
                for (int j = i; j < arrays.length - incrementNum; j = j + incrementNum) {
                    if (arrays[j] > arrays[j + incrementNum]) {
                        int temple = arrays[j];
                        arrays[j] = arrays[j + incrementNum];
                        arrays[j + incrementNum] = temple;
                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum / 2;
        }
        System.out.println("result = " + arrays);
    }

    public static void main(String[] args) {
        int[] arrays = {45, 34, 78, 12, 34, 32, 29, 64};
        sort(arrays);
    }
}
