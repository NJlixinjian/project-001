package com.example.demo01.mapper;

import com.example.demo01.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: lxj
 * @Date: 2019/5/31 14:21
 * @Description:
 */
public interface AreaMapper {

    List<Area> queryAreaList();

}
