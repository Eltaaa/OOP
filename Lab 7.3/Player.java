/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package labseventhree;

/**
 *
 * @author user
 */
public abstract class Player {

    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;

    public void setHP(double HP) {
        this.HP = HP;
        if (this.getHP() < 0) {
            this.HP = 0;
        }
    }

    public void setMP(double MP) {
        this.MP = MP;
    }

    public void setEXP(double EXP) {
        this.EXP = EXP;
    }

    public void setMoney(double Money) {
        this.Money = Money;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }
    

    public double getHP() {
        return HP;
    }

    public double getMP() {
        return MP;
    }

    public double getEXP() {
        return EXP;
    }

    public double getMoney() {
        return Money;
    }

    public double getATK() {
        return ATK;
    }

    public String toString() {
        //HP : [ค่าแอททริบิว HP] MP : [ค่าแอททริบิว MP]  ATK :  [ค่าแอททริบิว ATK]        
        return "HP : " + this.getHP() + " MP : " + this.getMP() + " ATK : " + this.getATK();
    }
    
    public abstract void attack(Player p);
    public abstract void attacked(double n);
}
