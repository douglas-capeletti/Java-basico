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
public class Goldbach {

    public static boolean ehPrimo(int numero) {
        int div = 0;
        if (numero == 1) {
            div++;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                div++;
                break;
            }
        }
        if (div > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\fInforme um valor par, maior ou igual a 4: ");
        int n = in.nextInt();

        while (n < 4 || n % 2 != 0) {
            System.out.print("NÃºmero invÃ¡lido. Informe novamente: ");
            n = in.nextInt();
        }

        for (int i = 2; i < n; i++) {
            if (ehPrimo(i) == true && ehPrimo(n - i) == true) {
                System.out.printf("%d + %d = %d\n", i, n - i, n);
            }
        }
    }
}
