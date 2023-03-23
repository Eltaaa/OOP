/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
public class Customer extends ArrayList{

    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }


    public Account getAccount(int index) {
        Account x = (Account) acct.get(index);
        return x;
    }

    public void addAccount(Account acct) {
        this.add(acct);
        this.numOfAccount += 1;
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.getNumOfAccount();
    }
}
