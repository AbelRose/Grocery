package cn.sherlock.Math;

import java.util.ArrayList;

public class Practice_6 {
    /*
    ## 第六题：需求实现

    * 筛选字符串。

      * 定义ArrayList集合，存入多个字符串。
      * 长度大于5的字符串，打印删除后的集合。

    * 代码实现，效果如图所示：

      ![](img\6.jpg)
     */
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("aa");
        arr.add("aaa");
        arr.add("aaaa");
        arr.add("aaaaa");

        System.out.println("原集合为: "+arr);

        ArrayList<String> arr_new = new ArrayList<>();

        for (String s : arr) {//注意这个地方只有 arr.size() 没有 arr.length() arr.get()方法可以获取指定元素
//            System.out.println(s);
            if(s.length() < 5){
//                System.out.print(s+" ");
                arr_new.add(s);
            }
        }
        System.out.println("删除后的集合为: "+arr_new);
    }
}
