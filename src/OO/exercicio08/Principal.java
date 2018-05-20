/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.exercicio08;

/**
 *
 * @author Doug
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("\f");

        Produto p = new Produto("1Abc", "Sabonete", 2.50, 25);
        System.out.println(p);
        p.setPrecoCusto(2.80);
        System.out.println(p);

    }
}
