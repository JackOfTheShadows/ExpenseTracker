package project.simple.expensetracker.helperClasses;

import android.provider.ContactsContract;

/**
 * Created by laptop on 1/31/18.
 */

public class DataBaseEntry {



    private String name;
    private String comment;
    private String date;
    private double cost;

    public DataBaseEntry (String name, String comment, String date, double cost) {
        this.name = name;
        this.comment = comment;
        this.date = date;
        this.cost = cost;
    }

    public DataBaseEntry() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


}
