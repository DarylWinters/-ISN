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
public class Exercice5_6 {

    static long Fibonacci (long n) {
    if (n <= 1)
        return 1;
    else
    return Fibonacci(n-1) + Fibonacci(n-2);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Fibonacci(35));
        System.out.println(Fibonacci(45)); // C'est long
        System.out.println(Fibonacci(46)); // Si on utilise int: valeur erronée car on dépasse la limite du int
    }
    
}
