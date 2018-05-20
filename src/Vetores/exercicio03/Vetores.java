/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.exercicio03;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class Vetores {
    
    public static void main(String[] args) {
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorF[] = new int[10];
        int soma = 0;
        
        Scanner in = new Scanner (System.in);
        System.out.println("Informe 10 valores inteiros do vetor 1:");
        for (int i = 0; i<vetor1.length; i++){
            vetor1[i] = in.nextInt();
        }

        System.out.println("Informe 10 valores inteiros do vetor 2:");
        for (int i = 0; i<vetor2.length; i++){
            vetor2[i] = in.nextInt();
        }
        
        //Soma os dois vetores
        for(int j = 0; j<vetorF.length; j++){
             soma = vetor1[j] + vetor2[j];
             vetorF[j] = soma;
        }
        
        //Imprime vetor 1
        System.out.println("Vetor 1");
        for(int i = 0; i<vetor1.length; i++){
            System.out.print(vetor1[i]+ ", ");
        }
        
        System.out.println("\n");
        
        //Imprime vetor 2
        System.out.println("Vetor 2");
        for(int i = 0; i<vetor2.length; i++){
            System.out.print(vetor2[i]+ ", ");
        }
        
        System.out.println("\n");
        
        //Imprime vetor final
        System.out.println("Soma vetores");
        for(int i = 0; i<vetorF.length; i++){
            System.out.print(vetorF[i]+ ", ");
        }
        
        //Inverte vetores 
        int aux = 0;
        for(int j = 0; j<vetorF.length; j++){
            aux = vetor1[j];
            vetor1[j] = vetor2[j];
            vetor2[j] = aux;
        }
        
        System.out.println("\n");
        
        //Imprime vetor 1
        System.out.println("Vetor 1");
        for(int i = 0; i<vetor1.length; i++){
            System.out.print(vetor1[i]+ ", ");
        }
        
        System.out.println("\n");
        
        //Imprime vetor 2
        System.out.println("Vetor 2");
        for(int i = 0; i<vetor2.length; i++){
            System.out.print(vetor2[i]+ ", ");
        }
        
       
        
    }
    
}
