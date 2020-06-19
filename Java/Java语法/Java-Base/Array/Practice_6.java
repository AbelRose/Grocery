package cn.sherlock.Array;

public class Practice_6 {
    /*

     * 定义sym方法，判断数组中的元素值是否对称.

     */

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,6,7};

        boolean b1 = arrSymetry(arr1);
        System.out.println(b1);
        boolean b2 = arrSymetry(arr2);
        System.out.println(b2);

    }

    private static boolean arrSymetry(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[arr.length-1-i]){
                return true;
            }else {
                return false;
            }
        }

        return true;
    }
}
