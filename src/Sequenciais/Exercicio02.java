/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Calculo do tempo restante para o final do dia
 *
 * @author Doug
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe as horas:\t");
        int horas = in.nextInt();

        System.out.println("Informe as minutos:\t");
        int minutos = in.nextInt();

        System.out.println("Informe as segundos:\t");
        int segundos = in.nextInt();

        int horasR = 23 - horas;
        int minutosR = 59 - minutos;
        int segundosR = 60 - segundos;

        System.out.println("Tempo restante: " + horasR + ":" + minutosR + ":" + segundosR);

    }
}
