package app.servlets;

import app.entities.PeriodCreateAction;
import app.model.PeriodTableModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/create")
public class CreatePeriodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/mainServl.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String period = req.getParameter("period");
        PeriodCreateAction periodCreateAction = new PeriodCreateAction(startDate, endDate, period);
        PeriodTableModel periodTableModel = PeriodTableModel.getInstance();
        periodTableModel.createPeriod(periodCreateAction);

        req.setAttribute("Periods", period);
        doGet(req, resp);
        System.out.println("Сработал doPost ПЕРИОДА");
    }
}
