ackage com.clark.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/*
通过重写父类的方法，实现对于请求的分发
需要再web.xml中注册servlet并且指定url的地址

html中的action的地址 ‘/’ 是从 ip:port开始的
但是 urlmapping 里面的/是指的是ip:port/webproject/
*/

/*

idea可以直接创建servlet，省去一部分工作
*/
public class Hello2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("This is get");
        out.close();
        //super.doGet(req,resp); 有了之后service 才能继续往下分发，不然分发会停止
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("This is post");
        out.close();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is service");
    }
}
