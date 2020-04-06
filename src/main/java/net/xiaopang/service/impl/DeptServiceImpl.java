package net.xiaopang.service.impl;


import net.xiaopang.dao.DeptDaoI;
import net.xiaopang.pojo.Dept;
import net.xiaopang.service.DeptServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-06 14:43
 **/
@Service("deptServiceImpl")
public class DeptServiceImpl  implements DeptServiceI {
    @Autowired
    private DeptDaoI deptDaoI;

    @Override
    public List<Dept> selectDept(Dept dept) {
        return deptDaoI.selectDept(dept);
    }
}


