package com.example.netty.socketio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/28.
 */
@Controller
public class NettyController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/ch")
//    @ResponseBody
    public String hello(){
        logger.info("进入成功");
        return "chat";
    }

}
