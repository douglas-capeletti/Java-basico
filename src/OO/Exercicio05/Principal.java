/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio05;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class Principal {

    public static void main() {
        System.out.println("\f");
        ContaBancaria c1 = new ContaBancaria("Maria", 1);
        ContaBancaria c2 = new ContaBancaria("JoÃ£o", 1);
        ContaBancaria c3 = new ContaBancaria("Juca", 1);

        c1.depositar(500);
        c1.transferir(200, c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
