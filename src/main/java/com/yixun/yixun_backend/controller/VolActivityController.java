package com.yixun.yixun_backend.controller;


import com.yixun.yixun_backend.service.VolActivityService;
import com.yixun.yixun_backend.utils.Result;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.Map;

@RequestMapping("/api/VolAct")
@RestController
public class VolActivityController {
    @Resource
    private VolActivityService volActivityService;

    //4.1.1 获取志愿活动
    @GetMapping("/ShowVolActivityList")
    public Result ShowVolActivityList(int pageNum, int pageSize)
    {
        Result result=new Result();
        result=volActivityService.GetVolActivities(pageNum,pageSize);
        return result;
    }

    //4.1.2 搜索志愿活动
    @PostMapping("/SearchVolActivity")
    public Result SearchVolActivity(@RequestBody Map<String, Object> inputMap)
    {
        Result result=new Result();
        result=volActivityService.GetVolActivityByWord(inputMap);
        return result;
    }

    //4.1.3 获取志愿活动详细信息 =====> *
    //volActInfo: "/api/volActInfo",
    @GetMapping("/ShowSingleVolActivity")
    public Result ShowSingleVolActivity(int VolActId)
    {
        Result result=new Result();
        result=volActivityService.GetVolActivityDetail(VolActId);
        return result;
    }
}
