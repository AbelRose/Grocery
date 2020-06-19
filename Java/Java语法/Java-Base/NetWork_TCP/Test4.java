package cn.sherlock.NetWork_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4 {
    /*
    TCP网络程序
    需求说明：创建新项目，按以下要求编写代码：
    在项目下创建TCP 客户端
    访问之前创建的服务器端,服务器端ip127.0.0.1 端口号8888
    1:客户端连接服务器,并发送 hello.服务器,我是客户端.
    2:开启上一题服务器,等待客户端连接,客户端连接并发送数据
     */
    public static void main(String[] args) throws Exception {

        //创建一个socket服务端
        Socket socket = new Socket("127.0.0.1", 8888);

        //获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());

        //释放资源
        os.close();
        socket.close();

    }
}
