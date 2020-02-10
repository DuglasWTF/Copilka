package app.model;

import app.dao.DAO;
import app.entities.Action;

import java.util.LinkedList;
import java.util.List;

public class DayTableModel {
    private static DayTableModel instance;
    private DAO dao;
    private List <Action> actionList;

    static {
        instance = new DayTableModel();
    }

    public DayTableModel() {
        this.dao = new DAO();
        this.actionList = new LinkedList<>();
    }

    public void addAction(Action action){
        dao.addAction(action);
    }
}
