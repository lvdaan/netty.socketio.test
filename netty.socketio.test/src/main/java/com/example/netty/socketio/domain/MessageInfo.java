package com.example.netty.socketio.domain;

/**
 * 消息结构类
 * Created by Administrator on 2017/12/29.
 */
public class MessageInfo {

    private String sourceClientId;  //源客户端id
    private String targetClientId;  //目标客户端id
    private String msgType;         //消息类型
    private String msgContent;      //消息内容

    public String getSourceClientId() {
        return sourceClientId;
    }
    public void setSourceClientId(String sourceClientId) {
        this.sourceClientId = sourceClientId;
    }
    public String getTargetClientId() {
        return targetClientId;
    }
    public void setTargetClientId(String targetClientId) {
        this.targetClientId = targetClientId;
    }
    public String getMsgType() {
        return msgType;
    }
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }
    public String getMsgContent() {
        return msgContent;
    }
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

}
