/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequenciais.Lista;

import java.util.Scanner;

/**
 * Cálculo do salário final do funcionário, recebendo o valor da comissão, o
 * fixo, e o total de vendas
 *
 * @author Doug
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        String vendedor = in.nextLine();

        System.out.println("salÃ¡rio fixo do vendedor:");
        double fixo = in.nextDouble();

        System.out.println("Comissao:");
        double comissao = in.nextDouble();

        System.out.println("Total de vendas:");
        double vendas = in.nextDouble();

        double salario = (vendas * (comissao / 100) + fixo);

        System.out.print("\t O Vendedor: " + vendedor + "\n\t ReceberÃ¡: " + salario);

    }
}
