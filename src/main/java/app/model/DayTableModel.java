package app.model;

import app.dao.DAO;
import app.entities.Action;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DayTableModel {
    private static DayTableModel instance;
    private DAO dao;
    private List <Action> actionList;

    static {
        instance = new DayTableModel();
    }

    public static DayTableModel getInstance() {
        return instance;
    }

    public DayTableModel() {
        this.dao = new DAO();
        this.actionList = new LinkedList<>();
    }

    public void addAction(Action action) throws SQLException, ClassNotFoundException{
        dao.addAction(action);
    }
}
