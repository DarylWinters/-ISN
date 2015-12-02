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
public class Exercice_RechercheSeq {

    /**
     * Recherche séquentielle
     *
     * @param cible unentier
     * @param table un tableau non vide d'entiers
     * @return - un entier i où table[i] = cible si cible est présente dans
     * table - -1 sinon .
     */
    static int rechercheSec(int[] table, int cible) {
        int res;
        int i = 0;
        while (i < table.length && table[i] != cible) {
            i++;
        }
        if (i < table.length) {
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
        // TODO code application logic here
        int[] desEntiers;
        desEntiers = new int[]{12, 1, 17, 14, 13, 7, 99, 2, 123};

        System.out.println(rechercheSec(desEntiers, 1200));

    }

}
