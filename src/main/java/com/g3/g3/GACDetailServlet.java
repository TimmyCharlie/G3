package com.g3.g3;

import bean.GAC;
import bean.Age;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "gacDetailServlet", value = "/GACDetail")
public class GACDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try {
            String id = req.getParameter("id");
            GAC gac = LoginServlet.gacDao.getGACById(Integer.parseInt(id));
            ArrayList<Age> ages = LoginServlet.ageDao.getAgesByGeographicAreaIdAndYear(Integer.parseInt(id),1);

            Age totalAge = ages.parallelStream().filter(x->x.getAgeGroup()==1).findAny().orElse(null);
            int population = totalAge.getCombined();

            req.setAttribute("gac", gac);
            req.setAttribute("population", population);
            req.getRequestDispatcher("GACDetail.jsp").forward(req, resp);
        } catch (Exception e) {
            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1>Invalid operation</h1>");
            out.println("</body></html>");
        }
    }

}
