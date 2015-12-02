/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Les_Tableaux;

/**
 *
 * @author guilhem
 */
public class Exercice_rechercheDic {

    static int rechercheDic(int[] table, int cible) {
        int i = 0;
        int j = table.length - 1;
        int m, res;

        while (i < j) {
            m = (i + j) / 2;
            if (table[m] == cible) {
                i = m;
                j = m;
            } else {
                if (table[m] < cible) {
                    i = m + 1;
                } else { // c'est à dire que table[m]>cible
                    j = m - 1;
                }
            }

        }
        if (table[i] == cible) {
            res = i;
        } else {
            res = -1;
        }
        return res;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] desEntiers;
        desEntiers = new int[]{12, 23, 34, 56, 67, 78, 89, 90, 123};
        System.out.println(rechercheDic(desEntiers, 90));

    }

}
