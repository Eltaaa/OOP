/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package labseventhree;

/**
 *
 * @author user
 */
public class Rod extends Item{
    public void use(Player P) {
        P.setATK(P.getATK() + 5);
    }
}
