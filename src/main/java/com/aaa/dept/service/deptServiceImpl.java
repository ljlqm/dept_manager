package com.aaa.dept.service;

import com.aaa.dept.dao.deptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * fileName:deptServiceImpl
 * description:
 * author:雷建林
 * ceeateTime:2019/7/23 19:26
 */
@Service
public class deptServiceImpl implements deptService {

    @Autowired
    private deptDao deptDao;
    @Override
    public List<Map> query() {
        return deptDao.query();
    }

    @Override
    public Map queryById(int deptno) {
        List<Map> maps = deptDao.queryById(deptno);
        if (maps!=null&&maps.size()>0){
            return maps.get(0);
        }
        return null;
    }
}
