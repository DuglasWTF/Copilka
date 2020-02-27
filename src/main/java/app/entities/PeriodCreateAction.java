package app.entities;

public class PeriodCreateAction {
    private String startDate;
    private String endDate;
    private String period;

    public PeriodCreateAction(String startDate, String endDate, String period) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.period = period;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
