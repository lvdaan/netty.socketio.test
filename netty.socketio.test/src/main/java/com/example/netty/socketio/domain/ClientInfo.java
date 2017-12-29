package com.example.netty.socketio.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 添加客户端信息，用来存放客户端的sessionId
 * Created by Administrator on 2017/12/29.
 */
@Entity
@Table(name = "clientInfo")
public class ClientInfo {
    @Id
    @NotNull
    private String clientid;
    private Short connected;        // 连接状态  1已连接 0未连接
    private Long mostsignbits;
    private Long leastsignbits;
    private Date lastconnecteddate;

    public String getClientid() {
        return clientid;
    }
    public void setClientid(String clientid) {
        this.clientid = clientid;
    }
    public Short getConnected() {
        return connected;
    }
    public void setConnected(Short connected) {
        this.connected = connected;
    }
    public Long getMostsignbits() {
        return mostsignbits;
    }
    public void setMostsignbits(Long mostsignbits) {
        this.mostsignbits = mostsignbits;
    }
    public Long getLeastsignbits() {
        return leastsignbits;
    }
    public void setLeastsignbits(Long leastsignbits) {
        this.leastsignbits = leastsignbits;
    }
    public Date getLastconnecteddate() {
        return lastconnecteddate;
    }
    public void setLastconnecteddate(Date lastconnecteddate) {
        this.lastconnecteddate = lastconnecteddate;
    }

    @Override
    public String toString() {
        return "ClientInfo{" +
                "clientid='" + clientid + '\'' +
                ", connected=" + connected +
                ", mostsignbits=" + mostsignbits +
                ", leastsignbits=" + leastsignbits +
                ", lastconnecteddate=" + lastconnecteddate +
                '}';
    }
}
