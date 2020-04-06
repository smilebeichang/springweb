package net.xiaopang.dao;

import net.xiaopang.pojo.Dept;

import java.util.List;

/**
 * @author songbeichang
 */
public interface DeptDaoI {
    List<Dept> selectDept(Dept dept);
}
