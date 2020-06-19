package cn.sherlock.Math;

import java.util.Scanner;

public class Practice_7 {
    /*

    ## 第七题：需求实现

    * 判断回文字符串。如果一个字符串，

    从前向后读和从后向前读，都是一个字符串，称为回文串，
    比如mom，dad，noon。

    * 代码实现，效果如图所示：

      ![](img\7.jpg)

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();

        isP(str);

    }

    private static boolean isP(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[chars.length - 1 - i]) {
                System.out.println(str + "是回文字符串");
                return true;
            } else {
                System.out.println(str + "不是回文字符串");
                return false;
            }
        }
        return true;
    }
}

/**
 *
 * public class Test7 {
 * 	    public static void main(String[] args) {
 * 	        Scanner scanner = new Scanner(System.in);
 * 	        String next = scanner.next();
 * 	        boolean p = isP(next);
 * 	        System.out.println(
 * 	                "回文数:" + p
 * 	        );
 *                }
 *
 * 	    public static boolean isP(String str) {//charAt(i)将i转换为转化为一个单个的字符
 * 	        int start = 0;
 * 	        int end = str.length() - 1;
 * 	        while (start < end) {
 * 	            if (str.charAt(start) != str.charAt(end)) {
 * 	                return false;
 *                }
 * 	            start++;
 * 	            end--;
 *            }
 * 	        return true;
 *            }
 * 	}
 *
 *
 */
