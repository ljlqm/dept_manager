package com.aaa.dept.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * fileName:deptDao
 * description:
 * author:雷建林
 * ceeateTime:2019/7/23 19:23
 */
@Repository
public interface deptDao {
    @Select("select * from dept2")
    List<Map> query();
    @Select("select * from dept2 where deptno=#{deptno}")
    List<Map> queryById(int deptno);
}
