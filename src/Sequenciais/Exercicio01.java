/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Conversão de Fahrenheit para celcius
 *
 * @author Doug
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\f Informe a temperatura em Fahrenheit: \t");
        double far = in.nextDouble();
        double celsius = (5 * (far - 32)) / 9;
        System.out.printf("Temperatura em celsius: %.2f \n", celsius);
    }
}
