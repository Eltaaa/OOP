/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account[] acct;
    private int numOfAccount;

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }


    public Account getAccount(int index) {
        return acct[index];
    }

    public void addAccount(Account acct) {
        this.acct[this.getNumOfAccount()] = acct;
        this.numOfAccount += 1;
    }

    public int getNumOfAccount() {
        return this.numOfAccount;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.getNumOfAccount();
    }
}
