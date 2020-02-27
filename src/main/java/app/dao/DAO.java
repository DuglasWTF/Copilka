package app.dao;

import app.entities.Action;
import app.entities.PeriodCreateAction;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DAO {
    DBConnector dbConnector = new DBConnector();
    Connection connection = dbConnector.getConnection();


    public void addAction(Action action) {
        String date = action.getDate();
        Calendar calendar = parseDate(date);
        /*String[] chars = date.split("\\D");
        calendar.set(Calendar.YEAR, Integer.parseInt(chars[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(chars[1])-1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(chars[2]));
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(chars[3]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(chars[4]));*/

        BigDecimal sum = action.getSum();
        String comment = action.getComment();

        String sql = "INSERT INTO copilkadb.daytable (date, summ, comment) VALUES (?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, new java.sql.Date(calendar.getTimeInMillis()), calendar);
            preparedStatement.setBigDecimal(2, sum);
            preparedStatement.setString(3, comment);
            preparedStatement.executeUpdate();
            System.out.println("Запись добавлена");
        } catch (SQLException e) {
            System.out.println("Ошбика при попытке добавить запись в БЛ");
            e.printStackTrace();
        }
    }

    public void createPeriod(PeriodCreateAction periodCreateAction) {
        String startDate = periodCreateAction.getStartDate();
        String endDate = periodCreateAction.getEndDate();
        String period = periodCreateAction.getPeriod();
        Calendar startCalendar = parseDate(startDate);
        Calendar endCalendar = parseDate(endDate);

        String sql = "INSERT INTO copilkadb.period(startdate, enddate, name) VALUES(?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, new java.sql.Date(startCalendar.getTimeInMillis()), startCalendar);
            preparedStatement.setDate(2, new java.sql.Date(endCalendar.getTimeInMillis()), endCalendar);
            preparedStatement.setString(3, period);
            preparedStatement.executeUpdate();
            System.out.println("Запись добавлена");
        } catch (SQLException e) {
            System.out.println("Ошбика при попытке добавить запись в БЛ");
            e.printStackTrace();
        }

    }

    private Calendar parseDate(String date) {
        Calendar calendar = new GregorianCalendar();
        String[] chars = date.split("\\D");
        calendar.set(Calendar.YEAR, Integer.parseInt(chars[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(chars[1]) - 1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(chars[2]));
        if (chars.length > 3) {
            calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(chars[3]));
            calendar.set(Calendar.MINUTE, Integer.parseInt(chars[4]));
        }
        return calendar;
    }
}
