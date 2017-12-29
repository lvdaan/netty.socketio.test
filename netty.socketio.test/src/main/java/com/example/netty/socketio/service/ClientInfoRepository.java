package com.example.netty.socketio.service;

import com.example.netty.socketio.domain.ClientInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * 添加查询数据库接口
 * Created by Administrator on 2017/12/29.
 */
public interface ClientInfoRepository extends CrudRepository<ClientInfo,String> {

    ClientInfo findClientByclientid(String clientId);
}
