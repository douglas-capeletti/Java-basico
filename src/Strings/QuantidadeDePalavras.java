/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class QuantidadeDePalavras {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("\fEscreva uma frase: ");
        String texto = in.nextLine();

        System.out.print("\fEscreva uma palavra (sem espaÃ§os em branco): ");
        String palavra = in.next();

        int contaPalavra = 0;

        for (int i = 0; i <= texto.length() - palavra.length(); i++) {
            String pedaco = texto.substring(i, palavra.length() + i);
            if (pedaco.equalsIgnoreCase(palavra)) {
                contaPalavra++;
            }
        }

        System.out.printf("A palavra %s aparece %d vezes", palavra, contaPalavra);

    }
}
