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
public class InsertionSort {
    public static void main(String[] args) {
    // valores a serem ordenados
    System.out.println("\f");
    int vetor[] = {7,3,9,1,10};
     int i, j, valorAtual;
   int tam=vetor.length;
    System.out.println("Vetor original:");
    for (  i = 0; i < tam;i++) {
        System.out.println(" " + vetor[i]);
    } 
    
   for( j=1; j < tam; j++ ) 
   {
      valorAtual = vetor[j];
      i = j-1;
      
      while(i >= 0 && vetor[i] > valorAtual)
      {
        vetor[i+1] = vetor[i];
        i--;
      } 
              
      vetor[i+1] = valorAtual;
   }

        System.out.println("Vetor organizado:");
        for (  i = 0; i < vetor.length;i++) {
            System.out.println(" " + vetor[i]);
        } 
        
    }
}
