/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio03;

import java.util.Scanner;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Por Favor insira seus dados: \n Nome do funcionário;\nO valor recebido por hora;\nSua carga horaria semana;");
        Funcionario func1 = new Funcionario(in.nextLine(), in.nextDouble(), in.nextDouble());
        System.out.println(func1.toString());
    }
}
