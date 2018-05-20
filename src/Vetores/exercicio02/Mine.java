/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.exercicio02;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class Mine {

    public static int somaDivisores(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma = soma + i;
            }
        }
        return soma;
    }

    public static boolean ehPrimo(int numero) {
        int div = somaDivisores(numero);
        return div == 1;
    }

    public static boolean ehPerfeito(int numero) {
        int soma = somaDivisores(numero);
        return soma == numero;
    }

    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public static boolean ehTriangular(int n) {
        int acumulador = 0;
        for (int i = 1; i < n; i++) {
            acumulador += i;
            if (acumulador == n) {
                return true;
            } else if (acumulador > n) {
                return false;
            }
        }
        return false;
    }

    public static boolean ehTriangularV2(int n) {
        for (int i = 1; i < n; i++) {
            int valor = (i * (i + 1)) / 2;
            if (valor == n) {
                return true;
            } else if (valor > n) {
                return false;
            }
        }
        return false;
    }

    public static int leInteiro() {
        Scanner in = new Scanner(System.in);
        sop("Informe um valor: ");
        int numero = in.nextInt();
        return numero;
    }

    public static void sop(String texto) {
        System.out.println(texto);
    }

}
