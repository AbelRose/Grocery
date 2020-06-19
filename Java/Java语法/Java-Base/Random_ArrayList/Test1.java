package cn.sherlock.Random_ArrayList;

import java.util.Random;

public class Test1 {
    /*
    * 随机验证码。

      * 随机生成十组六位字符组成的验证码。
      * 验证码由大小写字母、数字字符组成。

    * 代码实现，效果如图所示：

      ![](img\1.jpg)

    * 开发提示：

      * 使用字符数组保存原始字符，利用Random类生成随机索引
     */
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {//输出5个验证码
            String code = verifyCode();
            System.out.println(code);
        }
    }

    public static String verifyCode(){
        Random r = new Random();
        char[] ch = { //注意这个char[]的这个括号是写在哪里
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
                'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'
        };

        String code = "";

        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(ch.length);
            code +=  ch[index];
        }

//        System.out.println(code);
        return code;//如果用String的话就可以有返回值 从而返回多个验证码
    }
}
