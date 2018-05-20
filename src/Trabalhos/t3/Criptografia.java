/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalhos.t3;

/**
 *
 * @Autores Guilherme Deconto & Douglas Paz
 */
public class Criptografia {

    public static String criptografar(String palavra, int chave) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String resultado = "";

        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == ' ') {             //Angelo Caleb ajudou a criação da condição do if (tivemos problemas com o 'backspace'
                char novaletra = '#';
                resultado = resultado + novaletra;
            } else {
                int posicaodaletra = alfabeto.indexOf(palavra.charAt(i));
                int novaposicao = posicaodaletra + chave;
                if (novaposicao > 25) {
                    char novaletra = alfabeto.charAt(posicaodaletra + chave - 26);
                    resultado = resultado + novaletra;
                } else {
                    char novaletra = alfabeto.charAt(novaposicao);
                    resultado = resultado + novaletra;
                }
            }
        }
        return resultado;
    }

    public static String descriptografar(String palavra, int chave) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String resultado = "";
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == '#') {               //condição do if deve ser o oposto da criptografia
                char novaletra = ' ';
                resultado = resultado + novaletra;
            } else {
                int posicaodaletra = alfabeto.indexOf(palavra.charAt(i));
                int novaposicao = posicaodaletra - chave;
                if (novaposicao < 0) {
                    char novaletra = alfabeto.charAt(posicaodaletra - chave + 26);
                    resultado = resultado + novaletra;
                } else {
                    char novaletra = alfabeto.charAt(novaposicao);
                    resultado = resultado + novaletra;
                }

            }
        }
        return resultado;
    }
}
