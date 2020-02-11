package app.servlets;

import app.entities.Action;
import app.model.DayTableModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/mainServl.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date = req.getParameter("calendar");
        String spend = req.getParameter("spendInp");
        String comment = req.getParameter("comment");
        Action action = new Action(date, spend, comment);
        DayTableModel dayTableModel =DayTableModel.getInstance();
        dayTableModel.addAction(action);

        /*req.setAttribute("Actions", action.toString());
        doGet(req, resp);*/
        System.out.println("Сработал doPost");
    }
}
