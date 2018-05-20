/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio01;

import java.util.Scanner;

/**
 *
 * @author 17103446
 */
public class Principal {

    public static Retangulo criaObjeto() {
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme a base: ");
        double base = in.nextDouble();
        System.out.println("Informe a altura: ");
        double altura = in.nextDouble();
        Retangulo r = new Retangulo(base, altura);
        return r;

        //OUUUUUUU
        //return new Retangulo(base,altura);
    }

    public static void main(String[] args) {
        Retangulo r1 = criaObjeto();
        Retangulo r2 = criaObjeto();
        System.out.println(r1);
        System.out.println(r2);
    }
}
