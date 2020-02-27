package app.model;

import app.dao.DAO;
import app.entities.PeriodCreateAction;

import java.util.LinkedList;
import java.util.List;

public class PeriodTableModel {
    private static PeriodTableModel instance;
    private DAO dao;
    private List<PeriodTableModel> createTableActions;

    static {
        instance = new PeriodTableModel();
    }

    public static PeriodTableModel getInstance(){
        return instance;
    }

    public PeriodTableModel(){
        this.dao = new DAO();
        this.createTableActions = new LinkedList<>();
    }

    public void createPeriod(PeriodCreateAction periodCreateAction){
        dao.createPeriod(periodCreateAction);
    }
}
