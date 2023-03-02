/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package labseventhree;

/**
 *
 * @author user
 */
public class Mage extends Player {

    public Mage() {
        this.setHP(10);
        this.setMP(20);
        this.setATK(5);
    }

    public void addEquipment(Item i) {
        i.use(this);
    }

    public void attack(Player p) {
        p.attacked(2.5 * this.getATK());
        this.setMP(this.getMP() - 5);
    }

    public void attacked(double n) {
        this.setHP(this.getHP() - n);
    }
}
