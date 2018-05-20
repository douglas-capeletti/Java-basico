/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.exercicio11;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class Principal {
    public static void sop(String texto){
        System.out.print(texto);
    }
    public static Comodo criaComodo(String info){
        Scanner in = new Scanner(System.in);
        sop("Informe as medidas do(a) " + info + "\n");
        sop("Largura: ");
        int larg = in.nextInt();
        sop("Comprimento: ");
        int comp = in.nextInt();
        
        Comodo c = new Comodo(larg, comp);
        return c;        
    }
    
    public static Casa criaCasa(){
        Scanner in = new Scanner(System.in);
        sop("Criando uma casa:\n\n");
        Comodo sala = criaComodo("sala");
        Comodo cozinha = criaComodo("cozinha");
        Comodo banheiro = criaComodo("banheiro");
        Comodo quarto1 = criaComodo("quarto 1");
        Comodo quarto2 = criaComodo("quarto 2");
        
        Casa c = new Casa(sala,cozinha,banheiro,quarto1,quarto2);
        return c;
    }
    
    public static void main(String [] args){
        Casa c = criaCasa();               
        sop(c.toString());
    }
}
