package cn.sherlock.Object_API;

public class Practice_3 {
    /*
    Object类equals方法

    看下列程序，不运行说结果，写出答案后，并在IntelliJ IDEA
    中运行看看自己给的答案与运行结果是否正确，并分析原因。

	(1)
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2);     	//false  比较的是内存地址
		System.out.println(s1.equals(s2)); 	//true   比较的是值
		注意String 出来的 s1和s2是不同的呢 有一个是new出来的
	(2)
		String s1 = "abc";
      	String s2 = "abc";
		System.out.println(s1 == s2);     	//true
		System.out.println(s1.equals(s2)); 	//true
	(3)
		String s1 = "a" + "b" + "c";
      	String s2 = "abc";
		System.out.println(s1 == s2);        //true
		System.out.println(s1.equals(s2));	 //true
	(4)
		String s1 = "ab";
     	String s2 = "abc";
     	String s3 = s1 + "c";
		System.out.println(s3 == s2);         //false
      	System.out.println(s3.equals(s2));    //true
      	s1 + "c" 过程是创建了一个StringBuffer对象 然后用StringBuffer对象执行append方法追加
      	最后再转换成String类型 也就是s3是放在heap里面的对象
      	s2是放在String常量池中的对象  两个内存是不同的

     */
}
