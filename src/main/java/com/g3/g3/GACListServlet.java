package com.g3.g3;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "gacListServlet", value = "/GACList")
public class GACListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setAttribute("List0",LoginServlet.gacDao.getGACByLevel(0));
            req.setAttribute("List1",LoginServlet.gacDao.getGACByLevel(1));
            req.setAttribute("List2",LoginServlet.gacDao.getGACByLevel(2));
            req.setAttribute("List3",LoginServlet.gacDao.getGACByLevel(3));

            req.getRequestDispatcher("GACList.jsp").forward(req, resp);

        } catch (Exception e) {
            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1>Invalid operation</h1>");
            out.println("</body></html>");
        }
    }
}
