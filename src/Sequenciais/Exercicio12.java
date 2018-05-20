/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\f");

        System.out.println("Informe um numero de 3 Digitos");
        int numero = in.nextInt();

        int centena = numero / 100;
        int resto = numero % 100;
        int dezena = resto / 10;
        int unidade = resto % 10;

        int numeroInvertido = (unidade * 100) + (dezena * 10) + centena;

        System.out.println("Numero Invertido: " + numeroInvertido);
    }
}
