
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package javaapplication8;
/**
 *
 * @author user
 */
public class Customer {

    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer() {
        this("", "", null);
    }

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public CheckingAccount getAcct() {
        return this.acct;
    }

//    public String toString() {
//        if (this.acct == null) {
//            return this.firstName + " " + this.lastName + " doesn't have account.";
//        } else {
//            return "The " + this.firstName + " account has " + this.getAcct().getBalance() + " baht and " + this.getAcct().getCredit() + " credits.";
//        }
//    }
    public String toString() {
        if (this.acct != null) {
            return "The " + this.firstName + " account has " + this.getAcct().getBalance() + " baht and " + this.getAcct().getCredit() + " credits.";
        } else {
            return this.firstName + " " + this.lastName + " doesn’t have account.";
        }
    }

    public boolean equals(Customer c) {
        return this.firstName.equals(c.getFirstName()) && this.lastName.equals(c.getLastName());
    }
}
