/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalhos.t3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @Autores Guilherme Deconto & Douglas Paz
 */
public class principal {

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {

        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Informe o caminho do arquivo: ");
            String nomeArquivo = in.nextLine();

            File arquivoInput = new File(nomeArquivo);
            Scanner entrada = new Scanner(arquivoInput);

            System.out.println("informe o nome do arquivo de saida: ");
            String arquivoOutput = in.nextLine();

            PrintWriter saida = new PrintWriter(arquivoOutput);

            int cifra = 0;
            int chave;
            do {
                System.out.println("Digite 1 para criptografar o arquivo");
                System.out.println("Digite 2 para descriptografar o arquivo");
                cifra = in.nextInt();
                if (cifra != 1 && cifra != 2) {
                    System.out.println("Opção inválida.");
                    inicio();
                } else {
                    System.out.println("informe a chave de 2 até 25");
                    chave = in.nextInt();
                    if (chave < 2 || chave > 25) {
                        System.out.println("Chave inválida");
                        inicio();
                    }
                    readWrite(entrada, saida, cifra, chave);
                }
            } while (cifra != 1 && cifra != 2);
        } catch (IOException e) {
            System.out.println("Erro com o arquivo. Tente novamente");
            inicio();
        }
    }

    public static void readWrite(Scanner entrada, PrintWriter saida, int cifra, int chave) {

        while (entrada.hasNext()) {
            String palavra = entrada.nextLine().toUpperCase();  //nextline deve ser usado para verificar linhas diferentes

            String resultado = "";
            int key = chave;
            if (cifra == 1) {
                resultado = Criptografia.criptografar(palavra, key);
            } else {
                resultado = Criptografia.descriptografar(palavra, key);
            }

            saida.println(resultado);  //println creditos angelo calebe   -  //println imprimira cada linha com seu respectivo codigo

        }
        saida.close();
        entrada.close();
        System.out.println("Saída gerada com sucesso.");
    }
}
