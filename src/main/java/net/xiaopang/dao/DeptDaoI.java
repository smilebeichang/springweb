package net.xiaopang.dao;

import net.xiaopang.pojo.Dept;

import java.util.List;

public interface DeptDaoI {
    List<Dept> selectDept(Dept dept);
}
