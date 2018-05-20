/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Cálculo do volume de uma esfera sabendo somente o seu raio
 *
 * @author Doug
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio da esfera:");
        double raio = in.nextDouble();
        
        double volume = (12.56 * Math.pow(raio, 3)) / 3;
        System.out.printf("Volume da esfera: %.2f \n",volume);
    }

}
