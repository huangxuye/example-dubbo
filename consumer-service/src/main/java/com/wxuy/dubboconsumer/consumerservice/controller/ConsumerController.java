package com.wxuy.dubboconsumer.consumerservice.controller;

import com.wxuy.dubboconsumer.consumerservice.service.ConsumerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"Dubbo测试"})
@RestController
@RequestMapping(value = "/api/dubbo")
public class ConsumerController {
	@Autowired
	private ConsumerService consumerService;

    @ApiOperation(value = "dubbo测试", notes = "测试dubbo的远程调用")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "lng",value = "经度",paramType = "path",dataType = "String")
//    })
    @GetMapping("/test")
    public String queryLocation5GCover() {
        return consumerService.consumerService();
    }


}
