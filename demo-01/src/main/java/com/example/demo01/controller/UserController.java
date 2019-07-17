package com.example.demo01.controller;

import com.example.demo01.entity.Area;
import com.example.demo01.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: lxj
 * @Date: 2019/7/17 15:06
 * @Description:
 */
@RestController
@RequestMapping("/demo01")
public class UserController {


    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/queryAreaList",method = RequestMethod.GET)
    public List<Area> queryAreaList(){
        List<Area> areaList = areaService.queryAreaList();
        return areaList;
    }
}
