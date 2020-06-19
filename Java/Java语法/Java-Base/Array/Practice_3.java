package cn.sherlock.Array;

public class Practice_3 {
    /*
  ！！！！！！！！！！！！！！！！！！
  * 统计字符
  * 字符数组：{'a','l','f','m','f','o','b','b','s','n'}
  * 定义printCount方法，统计每个字符出现的次数并打印到控制台。

  * 代码实现，部分效果如图所示：

  ![](img\4.jpg)

  * 开发提示：

  * 将数字强制转换，根据ASCII码表转换为字符。
  * 可以定义长度26的数组，每个元素，对应去保存每种字符的出现次数，
  比如0索引保存a的次数，1索引保存b的次数，以此类推。

     */
    public static void main(String[] args) {

        char[] charArray = {'a','l','f','m','f','o','b','b','s','n'};
        printCount(charArray);
    }

    private static void printCount(char[] charArray) {

        int[] count = new int[26];

        for (int i = 0; i < charArray.length; i++) {

            int c = charArray[i];//强制类型转换为int类型
            count[c - 97] ++;//转换为ASCII码的格式
        }

        for (int i = 0, ch = 97; i < count.length; i++, ch++) {
        //注意 ch 从 97开始

            if(count[i] != 0){
                System.out.println((char) ch+"---"+count[i]);
            }
        }
    }
}
