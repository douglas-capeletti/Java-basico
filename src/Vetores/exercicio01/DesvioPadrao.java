/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.exercicio01;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class DesvioPadrao
{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("\f");        
        System.out.println("O tamanho da amostra: ");
        int tam=in.nextInt();        
        double numeros[] = new double[tam];  
        int i;
        double soma=0;
        for(i=0;i<numeros.length;i++){
            System.out.println("Informe um numero " + i );           
            numeros[i] = in.nextDouble();
            if(numeros[i]< 0 || numeros[i]>10){
                System.out.println("NÃºmero invÃ¡lido. Tente novamente.");   
                i--;
            } else {
                soma += numeros[i];           
            }
        }        
        double media = soma/numeros.length;
        double somaDv = 0;
        for(i=0;i<numeros.length;i++){
            somaDv += Math.pow((numeros[i] - media),2);
        }
        double desvioPadrao = Math.sqrt(somaDv / (numeros.length - 1));        
        System.out.println("MÃ©dia: " + media);
        System.out.println("Desvio: " + desvioPadrao);
    }
}

