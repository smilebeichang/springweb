package net.xiaopang.service;

import net.xiaopang.pojo.Dept;

import java.util.List;

public interface DeptServiceI {
    List<Dept> selectDept(Dept dept);
}
