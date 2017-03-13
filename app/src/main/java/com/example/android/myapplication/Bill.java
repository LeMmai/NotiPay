package com.example.android.myapplication;

/**
 * Created by User on 2/25/2017.
 */

public class Bill{

    private String agencyName;
    private String customerAccountNo;
    private double amountDue;
    private String dueDate;
    private String customerName;



    public Bill(String agencyName, String customerAccountNo, double amountDue, String dueDate, String customerName) {
        this.agencyName = agencyName;
        this.customerAccountNo = customerAccountNo;
        this.amountDue = amountDue;
        this.dueDate = dueDate;
        this.customerName = customerName;
    }

    //setters

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setCustomerAccountNo(String customerAccountNo) {
        this.customerAccountNo = customerAccountNo;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    //end of setters

    //getters
    public String getAgencyName() {
        return agencyName;
    }

    public String getCustomerAccountNo() {
        return customerAccountNo;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getCustomerName() { return customerName; }
    //end of getters


}
