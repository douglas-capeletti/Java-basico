/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Recebendo 3 valores inteiros, calculando a fórmula de baskhara
 *
 * @author Doug
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe respectivamente os valores de A, B e C");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        double x2 = (b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
}
