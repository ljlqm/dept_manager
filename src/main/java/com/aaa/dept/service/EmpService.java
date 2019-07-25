package com.aaa.dept.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * fileName:EmpService
 * description:
 * author:雷建林
 * ceeateTime:2019/7/23 19:37
 */
@FeignClient(value = "empmgr1")
public interface EmpService {

    @RequestMapping("emp1/empList")
    List<Map> getEmpList();
}
