package com.example.demo01.service.impl;

import com.example.demo01.entity.Area;
import com.example.demo01.mapper.AreaMapper;
import com.example.demo01.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lxj
 * @Date: 2019/7/17 17:29
 * @Description:
 */
@Service
public class AreaServiceImpl implements AreaService{

    @Autowired
    private AreaMapper areaMapper;

    public List<Area> queryAreaList(){
        return areaMapper.queryAreaList();
    }
}
