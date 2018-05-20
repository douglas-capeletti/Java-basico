/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class PalavrasShakespeare {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        File a = new File("obrasshake.txt");
        Scanner arquivo = new Scanner(a);

        StringBuilder texto = new StringBuilder();
        while (arquivo.hasNext()) {
            texto.append(arquivo.nextLine());
        }

        System.out.print("\fEscreva uma palavra (sem espaÃ§os em branco): ");
        String palavra = in.next();

        int contaPalavra = 0;

        for (int i = 0; i <= texto.length() - palavra.length(); i++) {
            String pedaco = texto.substring(i, palavra.length() + i);
            if (pedaco.equalsIgnoreCase(palavra)) {
                contaPalavra++;
            }
        }

        System.out.printf("A palavra %s aparece %d vezes nas obras de Shakespeare", palavra, contaPalavra);

    }
}
