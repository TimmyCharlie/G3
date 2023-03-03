package com.g3.g3;

import bean.Age;
import bean.AgeGroup;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet(name = "ageListServlet", value = "/AgeList")
public class AgeListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try {
            String year = req.getParameter("year");

            ArrayList<Age> ageArrayList = LoginServlet.ageDao.getAgesByGeographicAreaIdAndYear(1, Integer.parseInt(year));
            HashMap<Age, String> ageDescriptionDict = new HashMap<>();
            for (Age i :
                    ageArrayList) {
                AgeGroup ageGroup = LoginServlet.ageGroupDao.getAgeGroupById(i.getAgeGroup());
                ageDescriptionDict.put(i, ageGroup.getDescription());
            }

            req.setAttribute("year", year.equals("1") ? 2021 : 2016);
            req.setAttribute("list", ageDescriptionDict);
            req.getRequestDispatcher("AgeList.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1>Invalid operation</h1>");
            out.println("</body></html>");
        }
    }
}
