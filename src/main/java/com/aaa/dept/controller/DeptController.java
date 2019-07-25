package com.aaa.dept.controller;

import com.aaa.dept.service.EmpService;
import com.aaa.dept.service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * fileName:DeptController
 * description:
 * author:雷建林
 * ceeateTime:2019/7/23 19:32
 */
@RestController
public class DeptController {
    @Autowired
    private deptService service;
    @Autowired
    private EmpService empService;

    @RequestMapping("deptList")
    public Object list(){
        System.out.println(3333333);
        return service.query();
    }
    @RequestMapping("deptById")
    public Object queryById(Integer deptno){
        Map map = service.queryById(deptno);
        map.put("empList",empService.getEmpList());
        return map;
    }
}
