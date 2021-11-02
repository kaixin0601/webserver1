package com.webserver.core;

import java.net.Socket;

/**
 * 处理客户端请求
 * @author ta
 *
 */
public class ClientHandler {
    private Socket socket;
    public ClientHandler(Socket socket){
        try{
            this.socket=socket;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        try{
            /**
             * 主流程:
             * 1:解析请求
             * 2:处理请求
             * 3:发送响应
             */
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
