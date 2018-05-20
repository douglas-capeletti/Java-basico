/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio04;

import java.util.Scanner;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class PrincipalV2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Por Favor insira seus dados: \n Nome do funcionário: \n Valor da hora trabalhada: \n Carga horaria semanal: \n Total de anos trabalhados: ");
        FuncionarioV2 func1 = new FuncionarioV2(in.nextLine(), in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println(func1.toString());
    }
}
