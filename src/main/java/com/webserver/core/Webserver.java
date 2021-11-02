package com.webserver.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * WebServer主类
 * 流程：
 * 一、创建Webserver主类
 * 1、创建构造方法
 * 2、创建start方法
 * 3、创建main主函数
 * 二、创建ClientHandler类：用来处理客户端请求
 * 三、创建HttpRequest类
 * 四、创建HttpResponse类
 * 五、创建Httpcontext类
 * 六、创建EmptyRequestExcepti类
 * 七、创建RegServlet类
 *
 *
 * @author ta
 *
 */
public class Webserver {
    /**
     * 构造方法，用来初始化服务端
     */
    private ServerSocket server;
    public  Webserver(){
        try {
            System.out.println("正在启动服务器...");
            server=new ServerSocket(8888);
            System.out.println("服务器已启动！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 服务端开始工作的方法
     */
    public void start(){
        try{
            System.out.println("等待客户端连接...");
            Socket socket=server.accept();
            System.out.println("客户端已连接！");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * main主函数
     * @param args
     */
    public static void main(String[] args) {
        Webserver webserver=new Webserver();
        webserver.start();
    }
}
