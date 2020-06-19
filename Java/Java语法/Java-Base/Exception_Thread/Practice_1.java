package cn.sherlock.Exception_Thread;

public class Practice_1 {
    /*
    异常的体系
    Q:
    1.请描述异常的继承体系
    2.请描述你对错误(Error)的理解
    3.请描述你对异常(Exception)的理解
    4.请描述你对运行期异常的理解(RuntimeException)的理解

    A:
    1.
        异常的根类是: java.lang.Throwable
            子类1)java.lang,Error
            子类2)java.util.Exception
                Ⅰ.编译期异常 checked
                Ⅱ.运行期异常 runtime
    2.Error:表示不可修复的恶性的错误 只能通过修改代码规避错误 通常是系统级别的 很严重
    3.Exception:表示可修复的良性(相对于错误)的异常 可以在纠正错误后 使程序继续运行 是必须要处理的
    4.runtime异常 在运行期间 检查异常 而在编译的时候 运行异常不会报错

     */
}
