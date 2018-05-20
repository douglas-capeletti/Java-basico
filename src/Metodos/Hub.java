/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos.Lista;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class Hub {

    public static int leituraInt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int numero = in.nextInt();
        return numero;
    }

    public static int somaDivisores(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma = soma + i;
            }
        }
        return soma;
    }
    
    public static boolean numPar(int numero) {
        return (numero % 2 == 0);
    }

    public static boolean numPerfeito(int numero) {
        int soma = Hub.somaDivisores(numero);
        if (soma == numero) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean numPrimo(int numero) {
        int div = Hub.somaDivisores(numero);
        if (div == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
}
