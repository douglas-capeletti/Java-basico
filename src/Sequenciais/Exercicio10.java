/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Cálculo de autonomia de conbustível
 *
 * @author Doug
 */
public class Exercicio10 {

    public static void main(String[] Args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Informe a distância percorrica: ");
        double distancia = in.nextDouble();
        
        System.out.println("Informe o combustível gasto: ");
        double ComGasto = in.nextDouble();
        
        double autonomia = distancia/ComGasto;
        System.out.printf("Autonomia de: %.2f Km/l", autonomia);
    }
}
