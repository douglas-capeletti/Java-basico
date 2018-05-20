/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Cálculo do valor do carro recebendo o valor do cursto e aplicando o lucro do
 * vendedor e dos impostos
 *
 * @author Doug
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informa o valor de custo do carro:  ");
        double custo = in.nextDouble();

        // Lucro do vendedor 28%
        // O ".0" serve para identificar que a variavel é um double
        double lucroVend = custo * (28.0 / 100);
        // Impostos 45%
        double imposto = custo * (45.0 / 100);
        /**
         * Exemplo usando CAST de valor double LucroVend = custo * ((double)
         * 28/100); double imposto = custo * ((double)45/100);
         *
         * Exemplo usando somente uma linha double valorFinal = custo +
         * (custo*0.28) + (custo*0.45);
         */
        double valorFinal = custo + lucroVend + imposto;

        System.out.printf("Valor final = \t %.2f", valorFinal);

    }
}
