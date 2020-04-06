package net.xiaopang.dao.impl;

import net.xiaopang.dao.DeptDaoI;
import net.xiaopang.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Mr.songbeichang
 * @create: 2020-04-06 14:36
 **/
@Repository
public class DeptDaoImpl implements DeptDaoI {


    @Autowired
    private JdbcTemplate jt;


    @Override
    public List<Dept> selectDept(Dept dept) {
        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<Dept>(Dept.class);
        List<Dept> list = jt.query("select * from sys_dept",rowMapper);
        return list;
    }
}


