package cn.sherlock.Random_ArrayList;

public class Test6 {
    /*

    * 随机生成n张扑克牌。
    * 代码实现，效果如图所示：
      ![](img\6.jpg)
    * 开发提示：
      - 使用集合保存所有的扑克牌对象。
      - 从所有牌中，随机移除n张牌，保存到新集合。
      - 判断n的值，不能超越一副扑克牌的范围。

     */
    /**
     *
     * public class Test6 {
     * 	    public static void main(String[] args) {
     * 	        int n = 5;
     * 	        ArrayList<Card> cards = randomCard(n);
     *
     * 	        if (cards != null) {
     * 	            System.out.println("随机"+ n +"张牌:" );
     * 	            for (int i = 0; i < cards.size(); i++) {
     * 	                Card card = cards.get(i);
     * 	                card.showCard();
     *                                }
     * 	        }else {
     * 	            System.out.println(n+"超越范围,无法获取牌" );
     * 	        }
     *
     * 	        System.out.println();
     * 	        System.out.println();
     * 	        int n2 = 55;
     * 	        ArrayList<Card> cards2 = randomCard(n2);
     *
     * 	        if (cards2 != null) {
     * 	            System.out.println("随机"+ n2 +"张牌:" );
     * 	            for (int i = 0; i < cards.size(); i++) {
     * 	                Card card = cards.get(i);
     * 	                card.showCard();
     *                }
     * 	        }else {
     * 	            System.out.println("随机"+ n2 +"张牌:\r\n超越范围,无法获取" );
     *                    }
     * 	    }
     * 	    public static ArrayList<Card> randomCard(int n) {
     * 	        if (n > 54 || n < 0)
     * 	            return null;
     *
     * 	        ArrayList<Card> rList = new ArrayList<>();
     * 	        ArrayList<Card> cards = allCard();
     *
     * 	        Random r = new Random();
     * 	        for (int i = 0; i < n; i++) {
     * 	            int index = r.nextInt(cards.size());
     * 	            Card rCard = cards.remove(index);
     * 	            rLis            d);
     * 	        }
     * 	                 rList;
     * 	    }
     *
     * 	    public static ArrayList<Card> allCard() {
     * 	        ArrayList<Card> allList = new ArrayList<>();
     * 	        // 花色数组
     * 	        String[] hs = {"黑桃", "红桃", "梅花", "方片"};
     * 	        // 点数数组
     * 	        String[] ds = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
     *
     * 	        for (int H = 0; H < hs.length; H++) {
     * 	            for (int d = 0; d < ds.length; d++) {
     * 	                Card card = new Card(hs[H], ds[d]);
     * 	                // 添加到集合
     * 	                allList.add(card);
     *                  }
     * 	        }
     * 	        re        llList;
     * 	    }
     * 	}
     *
     * 	class Card {
     * 	    private String ds; // 点数
     * 	    private String hs; // 花色
     * 	    public Card(String ds, String hs) {
     * 	        this.ds = ds;
     * 	                s = hs;
     * 	    }
     * 	    public void showCard() {
     * 	        System.out.print(        s+" ");
     * 	    }
     * 	}
     *
     *
     *
     */
}
