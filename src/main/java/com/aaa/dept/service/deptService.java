package com.aaa.dept.service;

import org.apache.ibatis.annotations.Select;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
import java.util.Map;

/**
 * fileName:deptService
 * description:
 * author:雷建林
 * ceeateTime:2019/7/23 19:26
 */

public interface deptService {

    List<Map> query();

    Map queryById(int deptno);
}
