package app.servlets;

import app.entities.Action;
import app.model.DayTableModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/mainServl")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/mainServl.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date = req.getParameter("calendar");
        System.out.println(date);
        String spend = req.getParameter("spendInp");
        String comment = req.getParameter("comment");
        Action action = new Action(date, spend, comment);
        DayTableModel dayTableModel = DayTableModel.getInstance();
        try {
            dayTableModel.addAction(action);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        req.setAttribute("Dates", date);
        doGet(req, resp);
       /* String path = "views/mainServl.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(req, resp);*/
        //resp.sendRedirect();
        /*req.setAttribute("Actions", action.toString());
        doGet(req, resp);*/
        System.out.println("Сработал doPost");

    }
}
