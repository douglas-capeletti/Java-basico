/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Calculo da expressão = D = (R + S) / 2, onde R = (A+B)² e S = (B + C)²
 * recebendo tres numeros
 *
 * @author Doug
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe A:\t");
        double a = in.nextDouble();

        System.out.println("Informe B:\t");
        double b = in.nextDouble();

        System.out.println("Informe c:\t");
        double c = in.nextDouble();

        double r = Math.pow(a + b, 2);
        double s = Math.pow(b + c, 2);

        double d = (r + s) / 2;

        System.out.println("Resultado = " + d);
    }
}
