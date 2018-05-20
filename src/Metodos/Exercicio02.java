/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos.Lista;

/**
 *
 * @author Doug
 */
public class Exercicio02 {

    public static void main(String args[]) {

        int valorA = Hub.leituraInt();
        int valorB = Hub.leituraInt();

        if (valorB < valorA) {
            int aux = valorA;
            valorA = valorB;
            valorB = aux;
        }

        int somaTudo = 0;
        //Indo do ValorA ao ValorB caculando durante o intervalo
        for (int i = valorA; i <= valorB; i++) {
            //qual a soma dos divisores e i, e
            // juntar isso no somaTudo;                      
            somaTudo += Hub.somaDivisores(i);
        }

        System.out.println("Soma Ã© " + somaTudo);

    }

}
