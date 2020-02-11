package app.dao;

import app.entities.Action;

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
        Calendar calendar = new GregorianCalendar();
        String[] chars = date.split("\\D");
        calendar.set(Calendar.YEAR, Integer.parseInt(chars[2]));
        calendar.set(Calendar.MONTH, Integer.parseInt(chars[1])-1);
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(chars[0]));
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(chars[3]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(chars[4]));




        BigDecimal sum = action.getSum();
        String comment = action.getComment();

        String sql = "INSERT INTO copilkadb.daytable (date, summ, comment) VALUES (?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, new java.sql.Date(calendar.getTimeInMillis()));
            preparedStatement.setBigDecimal(2, sum);
            preparedStatement.setString(3, comment);
            preparedStatement.executeUpdate();
            System.out.println("Запись добавлена");
        } catch (SQLException e) {
            System.out.println("Ошбика при попытке добавить запись в БЛ");
            e.printStackTrace();
        }
    }

}
