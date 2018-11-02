package count;

/**
 * 分布统计
 */
public class DistributedCount {

    public static void disCount(int[] A, int min, int max){
        int temp[] = new int[A.length];
        int D[] = new int[max - min + 1];
        //频率计算
        for(int i = 0;i < A.length; i++){
            D[A[i] - min] = D[A[i] - min] + 1;
           /* int dIndex = A[i] - min;
            System.out.println("D["+ dIndex + "]出现的频率 = " + D[A[i] - min]);*/
        }
        //查看结果
        for (int i  = 0; i < D.length; i++){
            System.out.println("D的结果 = " + D[i]);
        }

        //分布计数
        for(int i = 0; i < max - min;i++){
            D[i + 1] = D[i + 1] + D[i];
            int dIndex = i + 1;
            System.out.println("D[" + dIndex + "]计数位置 = " + D[i + 1]);
        }

        for(int i = 0;i < A.length;i++){
            int j= A[i] - min;
            temp[D[j] - 1] = A[i];
            D[j]--;
        }

        for(int i = 0;i < A.length;i++){
            A[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] A = {13,11,15,13,15,15};
        disCount(A,11,15);
        for (int i = 0; i < A.length; i++){
            System.out.println("排序后的结果 = " + A[i]);
        }
    }
}
