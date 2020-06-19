package cn.sherlock.NetWork_TCP;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3 {
    /*

    TCP网络程序
    需求说明：创建新项目，按以下要求编写代码：
    在项目下创建TCP 服务器端 端口号为8888
    1:等待客户端连接   如果有客户端连接  获取到客户端对象
    2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据

     */
    public static void main(String[] args) throws Exception {

        //先创建一个服务器对象
        ServerSocket ss = new ServerSocket(8888);
        //等待客户端的连接 如果有的话 就获取到客户端对象
        Socket socket = ss.accept();
        //获取输入流对象
        InputStream is = socket.getInputStream();

        int len;
        byte[] buffer = new byte[1024];
        while ((len = is.read(buffer))!=-1){
//            System.out.println(new String(buffer,0,len));
        }
        is.close();//资源释放
        ss.close();//服务器释放
    }
}
