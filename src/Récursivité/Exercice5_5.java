/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Récursivité;

/**
 *
 * @author guilh
 */
public class Exercice5_5 {

    
    public static int pgcd(int a, int b) {
        if (b == 0) return a;
        else return pgcd(b, a % b);
    }

    public static void main(String[] args) {
        int p = 4;
        int q = 3;
        int d  = pgcd(p, q);
        System.out.println("pgcd(" + p + ","+ q + ") = " + d);
    }
}
