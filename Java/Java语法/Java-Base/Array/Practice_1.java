package cn.sherlock.Array;

import java.lang.reflect.Array;

public class Practice_1 {
    /*

    * 模拟大乐透号码：

  * 一组大乐透号码由10个1-99之间的数字组成
  * 定义方法，打印大乐透号码信息

* 代码实现，效果如图所示：

  ![](img\1.jpg)

* 开发提示：

  * 使用数组保存录入的号码

     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        System.out.println("结果是：");

        for(int  i = 0 ; i < arr.length; i++){

            if(i < arr.length-1){
                System.out.print(arr[i]+" ");
            }else {
                System.out.print(arr[i]);
            }
        }
    }
}
