package cn.sherlock.Array;

public class Practice_2 {
    /*

     * 开发提示：

     * 使用两个字符串数组，分别保存花色和点数

     */
    public static void main(String[] args) {

        String[] poke = new String[54];
        int index = 0;

        String[] hua = {"黑桃","红桃","梅花","方片"};
        String[] num = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        System.out.println("POKER");

        for (int i = 0; i < hua.length; i++) {
            for (int i1 = 0; i1 < num.length; i1++) {

//                System.out.print(hua[i]+num[i1]+" ");
                poke[index] = hua[i]+num[i1];
                index++;
            }
        }

        poke[52] = "小王";//注意是从0开始的
        poke[53] = "大王";

        for (int i = 0; i < poke.length; i++) {
            System.out.print(poke[i]+" ");
        }
//        System.out.println(poke);
//        System.out.println("抽出指定位置的牌");

        System.out.println("\r");
        System.out.println("获取扑克牌:");
        getPoke(poke,1,5,50);

    }

    private static void getPoke(String[] poke, int index1 , int index2, int index3) {

        System.out.println(poke[index1-1]);
        System.out.println(poke[index2-1]);
        System.out.println(poke[index3-1]);


    }

}
