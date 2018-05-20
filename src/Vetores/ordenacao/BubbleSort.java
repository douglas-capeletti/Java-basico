/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.ordenacao;

/**
 *
 * @author Doug
 */
public class BubbleSort {
  
    public static void main(String[] args) {
          System.out.println("\f");
         int[] vet = {8, 19, 0, 25, 1};
            int aux = 0;
            int i = 0;
            System.out.println("\n Vetor desordenado: ");
            for (i = 0; i < vet.length;i++) {
                System.out.println(" " + vet[i]);
            }

            for (i = 0; i < vet.length; i++) {
                for (int j = 0; j <vet.length-1; j++) {
                    if (vet[j]> vet[j+1]) {
                        aux = vet[j];
                        vet[j] = vet[j+1];
                        vet[j+1] = aux;
                    }
                }
            }
            System.out.println("Vetor organizado:");
            for (i = 0; i < vet.length;i++) {
                System.out.println(" " + vet[i]);
            } 
      }

  
}
