package cn.sherlock.Class_Intro;

public class Card {
    private String color;
    private String num;

    public Card(String color, String num) {
        this.color = color;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color='" + color + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public void showCard(){
        System.out.println(color+num);
    }
}
