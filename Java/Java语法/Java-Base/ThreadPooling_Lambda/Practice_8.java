package cn.sherlock.ThreadPooling_Lambda;

public class Practice_8 {
    /*
    Lambda(无参无返回)
    Q:
    给定一个导演 Director接口，内含唯一的抽象方法makeMovie，且无参数、无返回值，使用lambda表达式在Test中完成调用。
    public interface Director {
    void makeMovie();
    }

        在下面的代码中，请使用Lambda的省略格式调用 invokeDirect 方法，打印输出“导演拍电影啦！”字样：
    public class Test09InvokeDirect {
    public static void main(String[] args) {
    // TODO 请使用Lambda【省略格式】调用invokeDirect方法


     }

    private static void invokeDirect(Director director) {
      director.makeMovie();
        }
    }

     */
    public static void main(String[] args) {
        invokeDirect(()->{
            System.out.println("make movie");//相当于重写了Director里面的makemovie方法 因为只有一个抽象方法 直接重写 不用走程序
        });
    }

    public static void invokeDirect(Director director){//参数是传进来一个接口
        director.makeMovie();
    }

}
