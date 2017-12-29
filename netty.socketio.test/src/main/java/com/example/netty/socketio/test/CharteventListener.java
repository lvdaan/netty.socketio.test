package com.example.netty.socketio.test;

import com.corundumstudio.socketio.listener.DataListener;

/**
 * Created by Administrator on 2017/12/28.
 */
import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 监听聊天内容
 */
public class CharteventListener implements DataListener<ChatObject> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    SocketIOServer server;

    public void setServer(SocketIOServer server) {
        this.server = server;
    }

    public void onData(SocketIOClient client, ChatObject data,
                       AckRequest ackSender) throws Exception {
        // chatevent为 事件的名称， data为发送的内容
        this.server.getBroadcastOperations().sendEvent("chatevent", data);
        logger.info(data+ "获取发送过来的信息");

        System.err.println(client);
        System.err.println(data);
        System.err.println(ackSender.isAckRequested());
    }
}