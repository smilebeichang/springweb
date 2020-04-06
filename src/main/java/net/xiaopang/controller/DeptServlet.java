package net.xiaopang.controller;

import net.xiaopang.pojo.Dept;
import net.xiaopang.service.DeptServiceI;
import net.xiaopang.service.impl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/deptServlet")
public class DeptServlet extends HttpServlet {
    private DeptServiceI deptServiceI ;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*deptServiceI null point 在servlet通过注解@COntroller取不到值*/
        List<Dept> list = deptServiceI.selectDept(new Dept());
        System.out.println(list);
    }

    @Override
    public void init() throws ServletException {
        ServletContext sc = getServletContext();
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(sc);
        deptServiceI = ctx.getBean(DeptServiceI.class);
    }



}
