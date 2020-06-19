package cn.sherlock.InternalClass;

public interface CompareAble {
    public default Apple compare(Apple a1, Apple a2){
        //默认返回较大的那个
        return a1.getSize() > a2.getSize() ? a1 : a2;
    }
}
