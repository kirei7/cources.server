package com.softgroup.web.controller;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.RouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    //этот роутер будет отправлять риквест на один из трех
    //сервис-роутеров, каждый из которых будет отправлять этот же
    //риквест на свой хандлер, а хандлер будет вызывать сервис с нужными
    //параметрами
    @Autowired
    private RouterHandler dispatcherRouter;

    @RequestMapping
    public Response<?> handleRequest(@RequestParam Request<?> request) {
        Response<?> response = dispatcherRouter.handle(request);
        return response;
    }
}
