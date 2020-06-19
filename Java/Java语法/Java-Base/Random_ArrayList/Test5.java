package cn.sherlock.Random_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Test5 {
    /*

     * 模拟统计班级考试分数分布情况，分别统计100-80，79-60，59-40，39-0各个阶段的人数。
     * 定义getScoreList方法，随机生成50个数字，数字范围从0到100。
     * 定义countScore方法，统计各个阶段的分数个数。
     * 定义printCount方法，打印各个阶段的统计结果。

     */
    public static void main(String[] args) {

        ArrayList<Integer> scoreList = getScoreList();
        System.out.println(scoreList);
        System.out.println("------------");
        ArrayList<Integer> list = countScore(scoreList);
        System.out.println(list);

    }

    private static ArrayList<Integer> getScoreList() {

        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            int sco = r.nextInt(100);
            list.add(sco);
        }
        return list;
    }

    private static ArrayList<Integer> countScore(ArrayList<Integer> list) {

        ArrayList<Integer> count = new ArrayList<>();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer score = list.get(i);
            if(100 >= score && 80<=score){
                count1++;
            }else if(79 >= score && 60<=score){
                count2++;
            }else if(59 >= score && 40<=score){
                count3++;
            }else{
                count4++;
            }
        }

        count.add(count1);
        count.add(count2);
        count.add(count3);
        count.add(count4);
        return count;
    }
}
