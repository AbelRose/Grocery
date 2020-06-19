package cn.sherlock.Array;

public class Practice_7 {
    /*
     * 定义equals方法，比较数组内容是否完全一致。
     * 长度一致，内容一致，定义为完全一致。
     */
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,4,5,6};
       int[] arr2 = {1,2,3,4,5,6};
       int[] arr3 = {1,2,3,4,5,6,7};
       int[] arr4 = {0,2,3,4,5,6,7};


        boolean b1 = isEqual(arr1, arr2);
        System.out.println(b1);
        boolean b2 = isEqual(arr1, arr3);
        System.out.println(b2);
        boolean b3 = isEqual(arr2, arr3);
        System.out.println(b3);
        boolean b4 = isEqual(arr3, arr4);
        System.out.println(b4);


    }

    private static boolean isEqual(int[] arr1, int[] arr2) {

        //判断长度是否相同
        if(arr1.length != arr2.length){
            return false;
        }else {
            //判断内容是否相同
            for (int i = 0,  j = 0; i < arr1.length & j < arr2.length; i++, j++) {
                if(arr1[i] == arr2[j]){
                    return true;
                }else {
                    return false;
                }
            }

            /**
             *
             *可以不用定义int j 可以就直接用i的
             * arr2[i]
             */


            /*for (int i = 0; i < arr1.length; i++) {
                // arr1[i] 和 arr2[i]比较
                /*
                 * 所有元素都相同才相同，也就是只要有一个不同，这两个数组就是不同

                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
            */

        }
        return false;
    }
}
