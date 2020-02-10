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
    /*public void addUser(User user) {
        String name = user.getName();
        String passwords = user.getPassword();
        String sql = "INSERT INTO users_table (name, pass) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, passwords);
            preparedStatement.executeUpdate();
            System.out.println("Пользователь добвален");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Что-то не так");
        }
    }*/
}
