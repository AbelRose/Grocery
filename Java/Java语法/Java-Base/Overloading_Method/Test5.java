package cn.sherlock.Overloading_Method;

public class Test5 {
    /*
    * 定义printX方法，打印任意行的图形。

    * 代码实现，效果如图所示：

      ![](img\6.jpg)

    * 开发提示：

      * 参考之前的练习，将代码抽取为一个方法。

     */
    public static void main(String[] args) {
        printNum(10);
    }

    private static void printNum(int m) {
        for(int x = 1; x <= m; x++){
            for(int y = 1; y<=m; y++){
                if(x == y || x+y == m+1){//注意都是两个等号
                    System.out.print("@");//不要换行
                }else{
                    System.out.print("*");//不要换行
                }
            }
            System.out.println();//别忘了换行
        }
    }
}
