/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Ler dois inteiros e apresentar a soma, a diferença e a média entre os dois
 * numeros
 *
 * @author Doug
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o 1Âº valor:");
        double valor1 = in.nextDouble();

        System.out.println("Informe o 2Âº valor:");
        double valor2 = in.nextDouble();

        double soma = (valor1 + valor2);

        double diferenca = (valor1 - valor2);

        double media = ((valor1 + valor2) / 2);

        System.out.print("\t Soma dos valores: " + soma + "\n\t DiferenÃ§a dos valores: " + diferenca + "\n\t MÃ©dia dos valores:" + media);

    }
}
