/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.exercicio04;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de termos da seguencia Fibonacci: ");
        int n = in.nextInt();
        int fibonacci[] = new int[n];
        int sequencia = 1;
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci[i] = sequencia;
            } else {
                fibonacci[i] = sequencia;
                sequencia += fibonacci[i - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}
