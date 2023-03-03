package com.g3.g3;

import dao.AgeGroupDao;
import dao.GACDao;
import dao.AgeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    public static GACDao gacDao;
    public static AgeDao ageDao;
    public static AgeGroupDao ageGroupDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        gacDao = new GACDao(username,password);
        ageDao = new AgeDao(username,password);
        ageGroupDao = new AgeGroupDao(username,password);
        boolean isConnValid = false;
        try {
            isConnValid = gacDao.isConnectionValid();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (isConnValid){
            response.sendRedirect("./GACList");
        } else {
            response.sendRedirect(request.getContextPath());
        }
    }

}
