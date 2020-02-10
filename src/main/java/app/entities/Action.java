package app.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Action {
    private Date date;
    private BigDecimal sum;
    private String comment;

    public Action(Date date, BigDecimal sum, String comment) {
        this.date = date;
        this.sum = sum;
        this.comment = comment;
    }

    public Action(Date date, BigDecimal sum) {
        this.date = date;
        this.sum = sum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
