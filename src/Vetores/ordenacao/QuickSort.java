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
public class QuickSort {
        public static void quickSort(int v[], int esquerda, int direita) {  
        int esq = esquerda;  
        int dir = direita;  
        int pivo = v[(esq + dir) / 2];  
        int troca;  
  
        while (esq <= dir) {  
            while (v[esq] < pivo) {  
                esq = esq + 1;  
            }  
            while (v[dir] > pivo) {  
                dir = dir - 1;  
            }  
            if (esq <= dir) {  
                troca = v[esq];  
                v[esq] = v[dir];  
                v[dir] = troca;  
                esq = esq + 1;  
                dir = dir - 1;  
            }  
        }  
        if (dir > esquerda)  
            quickSort(v, esquerda, dir);  
  
        if (esq < direita)  
            quickSort(v, esq, direita);  
  
    }  
  
    public static void main(String args[]) {  
     System.out.println("\f");
        int vetor[] = { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };  
        System.out.println("\n Vetor Desordenado");
        for (int i = 0; i < vetor.length; i++) {  
            System.out.println(" " + vetor[i]);  
        } 
        
        quickSort(vetor, 0, vetor.length - 1);  
    System.out.println("\n Vetor Ordenado");
        for (int i = 0; i < vetor.length; i++) {  
            System.out.println(" " + vetor[i]);  
        }  
  
    }
}
