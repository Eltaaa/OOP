
public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        super(0, "");
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return this.credit;
    }

    @Override
    public void withdraw(double a) {
        if (balance - a >= 0) {
            this.balance = (this.getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        } else if (this.balance - a < 0 && this.balance - a + this.credit >= 0) {
            this.setCredit(this.getCredit() - (a - this.getBalance()));
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        } else if (this.balance - a < 0 && this.balance - a + this.credit < 0) {
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }

    public String toString() {
        return "The " + this.name + " account has " + this.balance + " baht and " + this.credit + " credits.";
    }
}
