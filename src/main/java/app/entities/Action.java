package app.entities;

import java.math.BigDecimal;
import java.sql.Date;

public class Action {
    private String date;
    private BigDecimal sum;
    private String comment;

    public Action(String date, BigDecimal sum) {
        this.date = date;
        this.sum = sum;
    }

    public Action(String date, String sum, String comment) {
        this.date = date;
        this.sum = new BigDecimal(sum);
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
