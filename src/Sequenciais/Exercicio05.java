/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Cálculo de média aritmética recebendo a nota de 3 provas sabendo que a nota1
 * e a nota2 valem a metade do valor da notaTF
 *
 * @author Doug
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o nome do aluno: ");
        String nome = in.next();

        System.out.println("Informe a nota 1");
        double nota1 = in.nextDouble();

        System.out.println("Informe a nota 2");
        double nota2 = in.nextDouble();

        System.out.println("Infome a nota do Trabalho Final");
        double notaTF = in.nextDouble();

        double notaFinal = ((2 * nota1) + (2 * nota2) + notaTF) / 5;

        System.out.print("\t O aluno: " + nome + "\n\t Obteve a nota final: " + notaFinal);

    }
}
