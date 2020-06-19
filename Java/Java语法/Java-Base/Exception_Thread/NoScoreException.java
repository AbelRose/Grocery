package cn.sherlock.Exception_Thread;

public class NoScoreException extends RuntimeException {

    //自己定义一个异常类要构造两个方法 首先是无参构造 然后是有参构造

    public NoScoreException() {
        super();
    }

    public NoScoreException(String message) {
        super(message);
    }
}
