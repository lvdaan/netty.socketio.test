package com.example.netty.socketio.test;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;

public class App {
    public static void main(String[] args) throws InterruptedException
    {
        Configuration config = new Configuration();
        config.setHostname("10.22.64.23");
        config.setPort(9092);

        // 创建socketIo服务端
        SocketIOServer server = new SocketIOServer(config);
        // 聊天事件监听
        CharteventListener listner = new CharteventListener();
        listner. setServer(server);
        // 添加事件监听  chatevent为事件名称
        server.addEventListener("chatevent", ChatObject.class, listner);
        //启动服务
        server.start();
        Thread.sleep(Integer.MAX_VALUE) ;

        System.err.println(Integer.MAX_VALUE);
        server.stop();
    }
}