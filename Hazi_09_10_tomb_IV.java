/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi_09_10_tomb_IV;

/**
 *
 * @author bodnart
 */
public class Hazi_09_10_tomb_IV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// páros-páratlan kiválogatása
        int[] szamok = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int paros = 0;
        int paratlan = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] % 2 == 0) {
                paros = paros + 1;
            } else {
                paratlan = paratlan + 1;
            }
        }
        int[] parosTomb = new int[paros];
        int[] paratlanTomb = new int[paratlan];
        int j = 0;
        int k = 0;
        for (int i = 0; i < szamok.length; i++) {

            if (szamok[i] % 2 == 0) {
                parosTomb[j] = szamok[i];
                j++;
            } else {
                paratlanTomb[k] = szamok[i];
                k++;
            }
        }
        System.out.println("A páros számok: ");
        for (int szam : parosTomb) {
            System.out.print(szam + ", ");
        }
        System.out.println("");
        System.out.println("A páratlan számok: ");
        for (int szam : paratlanTomb) {
            System.out.print(szam + ", ");
        }
// két tömb metszete

        int[] tomb1 = {2, 4, 6, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] tomb2 = {1, 3, 5, 7, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int metszet = 0;
        int unio = 0;
        int m = 0;
        int l = 0;
        for (int i = 0; i < tomb1.length; i++) {
            for (int szam : tomb2) {
                if (tomb1[i] == szam) {
                    metszet = metszet + 1;
                }
            }
        }
        int[] metszetTomb = new int[metszet];
        for (int i = 0; i < tomb1.length; i++) {
            for (int szam : tomb2) {
                if (tomb1[i] == szam) {
                    metszetTomb[m] = szam;
                    m++;
                }
            }
        }
        System.out.println("");
        System.out.println("A két tömb metszete: ");
        for (int szam : metszetTomb) {
            System.out.print(szam + ", ");
        }
        System.out.println("");
//ket tömb uniója
        for (int i = 0; i < tomb1.length; i++) {
            unio = unio + 1;
        }
        for (int i = 0; i < tomb2.length; i++) {
            unio = unio + 1;
        }

        for (int i = 0; i < tomb1.length; i++) {
            boolean vanMindketTombben = false;
            for (int szam : tomb2) {
                if (tomb1[i] == szam) {
                    vanMindketTombben = true;
                }
            }
            if (vanMindketTombben) {
                unio = unio - 1;
            }
        }

        int[] unioTomb = new int[unio];

        for (int i = 0; i < tomb1.length; i++) {
            unioTomb[l] = tomb1[i];
            l++;
        }

        for (int i = 0; i < tomb2.length; i++) {
            boolean vanBenne = false;
            for (int szam : unioTomb) {
                if (tomb2[i] == szam) {
                    vanBenne = true;
                }
            }
            if (!vanBenne) {
                unioTomb[l] = tomb2[i];
                l++;
            }
        }

        System.out.println("A két tömb uniója: ");
        for (int szam : unioTomb) {
            System.out.print(szam + ", ");
        }
    }
}
