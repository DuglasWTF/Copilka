package app.dao;

import app.entities.Action;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class DAO {
    DBConnector dbConnector = new DBConnector();
    Connection connection = dbConnector.getConnection();


    public void addAction(Action action) {
        Date date = action.getDate();
        BigDecimal sum = action.getSum();
        String comment = action.getComment();

        String sql = "INSERT INTO copilkadb.daytable (date, summ, comment) VALUES (?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, (java.sql.Date) date);
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
