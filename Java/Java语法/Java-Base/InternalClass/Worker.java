package cn.sherlock.InternalClass;

public class Worker {

    public Apple pickApple(CompareAble c,Apple a1, Apple a2){

        Apple compare = c.compare(a1, a2);
        return compare;

    }

}
