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
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        System.out.println("Digite a 1º coordenadas X, Depois Y");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        
        System.out.println("Digite a 2º coordenadas X, Depois Y");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        
        double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((x1 - y2), 2));
        
        System.out.printf("Distância entre os pontos = %.2f", distancia);
    }
}
