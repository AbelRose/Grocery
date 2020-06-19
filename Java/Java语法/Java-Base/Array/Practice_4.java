package cn.sherlock.Array;

public class Practice_4 {
    /*

     * 统计高于平均分的分数有多少个。
     * 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
     * 定义getAvg方法，获取一个数组中的平均数
     */

    public static void main(String[] args) {

        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};

        int avg = getAvg(arr);

        System.out.println("高于平均分的有:");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg){
                System.out.print(arr[i]+" ");
            }
        }
    }

    private static int getAvg(int[] arr) {

        int avg = 0, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum /(arr.length);

//        System.out.println(avg);
        return avg;
    }
}
