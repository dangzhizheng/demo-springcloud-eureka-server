package com.dzz.microservice.web;

import com.xxyy.result.JsonResult;
import com.xxyy.result.JsonResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 一些测试使用的接口
 */
@Controller
@RequestMapping(value = "/api")
public class ApiTest {

    @RequestMapping(value = "/testApi", method = RequestMethod.GET)
    @ResponseBody()
    public JsonResult testApi(@RequestParam("data") String data) {
        Map<String, Object> map = new HashMap<>();
        map.put("ip", "eureka");
        return JsonResultUtil.getJsonResult(JsonResultUtil.Code.SUCCESS, map,
                JsonResultUtil.Code.SUCCESS.message);
    }




}
