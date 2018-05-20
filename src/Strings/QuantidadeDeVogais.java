/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class QuantidadeDeVogais {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\fEscreva uma frase: ");
        String frase = in.nextLine();
        int vogais = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.toLowerCase().charAt(i);
            //System.out.println(letra);
            if (letra == 'a'
                    || letra == 'e'
                    || letra == 'i'
                    || letra == 'o'
                    || letra == 'u') {
                vogais++;
            }
        }

        System.out.println("Total de vogais: " + vogais);

    }
}
