/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        double a, b, c;
        double x1, x2;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);

        double temp = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        x1 = (-b + temp) / (2 * a);
        x2 = (-b - temp) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);

    }
}
