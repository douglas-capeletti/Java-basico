/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio02;

import java.util.Scanner;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class Principal {

    public static Triangulo criaTriangulo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe os 3 lados: ");
        double la = in.nextDouble();
        double lb = in.nextDouble();
        double lc = in.nextDouble();

        return new Triangulo(la, lb, lc);
    }

    public static void main(String[] args) {
        System.out.println("\f");

        Triangulo t1 = criaTriangulo();
        Triangulo t2 = criaTriangulo();

        System.out.println(t1);
        System.out.println("------------------");
        System.out.println(t2);

    }
}
