package com.company;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {

    protected Tovar aboutovar(String name, String Email,String itemname,String comments,double price){
        Tovar tovar = new Tovar();
        tovar.setName(name);
        tovar.setEmail(Email);
        tovar.setItemname(itemname);
        tovar.setComments(comments);
        tovar.setPrice(price);
        return tovar;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("aboutTovar");
        Tovar tovar = aboutovar("Ball", "ball@mail.ru","ball", "It is ball",9.99);
        Tovar tovar1 = aboutovar("Gun", "gun@mail.ru","gun", "It is gum",19.99);
        if(tovar.getName().equals(name)){
            req.setAttribute("Tovar",tovar);
        }
        else{
            req.setAttribute("Tovar",tovar1);
        }
        req.getRequestDispatcher("/jsp/show.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Tovar tovar = new Tovar();
        tovar.setName("Ball");
        tovar.setEmail("ball@mail.ru");
        tovar.setItemname("ball");
        tovar.setComments("It is ball");
        Tovar tovar1 = new Tovar();
        tovar1.setName("Gun");
        tovar1.setEmail("gun@mail.ru");
        tovar1.setItemname("gun");
        tovar1.setComments("It is gun");
        req.setAttribute("Tovar",tovar);
        req.setAttribute("Tovar1",tovar1);
        req.getRequestDispatcher("/jsp/rentForm.jsp").forward(req, resp);
    }
}
