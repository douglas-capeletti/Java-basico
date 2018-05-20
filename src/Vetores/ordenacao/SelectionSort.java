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
public class SelectionSort {
    public static void main(String[] args) {
        // valores a serem ordenados
        System.out.println("\f");
        int vetor[] = {7,3,9,1,10};
        // armazenam o menor valor e o Ã­ndice do menor valor
        int menor, indiceMenor;
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length;i++) {
            System.out.println(" " + vetor[i]);
        } 

        for (int i = 0; i < vetor.length - 1; i++) {
            // antes de comparar, considera-se menor o valor atual do laÃ§o
            menor = vetor[i];
            indiceMenor = i;

            // compara com os outros valores do vetor
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }

            // troca os valores menor e maior
            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }

        
        System.out.println("Vetor organizado:");
        for (int i = 0; i < vetor.length;i++) {
            System.out.println(" " + vetor[i]);
        } 
        
    }
}
