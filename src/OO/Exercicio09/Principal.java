/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio09;

import java.util.Scanner;

/**
 *
 * @author 17103446
 */
public class Principal {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        printCabecalho();
        waitPress();
        String nome1 = lerPlayer("1");
        String nome2 = lerPlayer("2");
        Jogo j = new Jogo(nome1, nome2);
        try {
            boolean sair = false;
            do {
                jogaga(j);
                System.out.println("Deseja continuar? [S/N]");
                char continuar = in.next().toUpperCase().charAt(0);
                if (continuar == 'N') {
                    sair = true;
                }
            } while (!sair);
        } catch (Exception e) {
            System.out.println("Sinto muito... mas parece que um erro acaba de ocorrer... Por favor, reinicie o sistema.");
        }
    }

    public static void waitPress() {
        Scanner in = new Scanner(System.in);
        System.out.println("Pressione qualquer tecla para continuar...");
        in.next();
    }

    public static void printCabecalho() {
        System.out.println("##########################################################################");
        System.out.println("#                  PEDRA-PAPEL-TESOURA-LAGARTO-SPOCK                     #");
        System.out.println("##########################################################################");
        System.out.println("############################### REGRAS ###################################");
        System.out.println("#                                                                        #");
        System.out.println("#                          OPÇÕES DE JOGADAS                             #");
        System.out.println("# Opção 0 - Pedra                                                        #");
        System.out.println("# Opção 1 - Papel                                                        #");
        System.out.println("# Opção 2 - Tesoura                                                      #");
        System.out.println("# Opção 3 - Lagarto                                                      #");
        System.out.println("# Opção 4 - Spock                                                        #");
        System.out.println("#                                                                        #");
        System.out.println("#                               ONDE:                                    #");
        System.out.println("# Tesoura corta papel                                                    #");
        System.out.println("# Papel cobre pedra                                                      #");
        System.out.println("# Pedra esmaga lagarto                                                   #");
        System.out.println("# Lagarto envenena Spock                                                 #");
        System.out.println("# Spock esmaga (ou derrete) tesoura                                      #");
        System.out.println("# Tesoura decapita lagarto                                               #");
        System.out.println("# Lagarto come papel                                                     #");
        System.out.println("# Papel refuta Spock                                                     #");
        System.out.println("# Spock vaporiza pedra                                                   #");
        System.out.println("# Pedra quebra tesoura                                                   #");
        System.out.println("##########################################################################");
    }

    public static String lerPlayer(String info) {
        Scanner in = new Scanner(System.in);
        printCabecalho();
        System.out.println("                         INFORME O NOME DO PLAYER " + info + "                     ");
        System.out.print("\t\t\t\t");
        String nome = in.nextLine();
        return nome;
    }

    public static boolean valida(int opcao) {
        if (opcao < 0 || opcao > 4) {
            return false;
        } else {
            return true;
        }
    }

    public static int lerJogada(String info) {
        Scanner in = new Scanner(System.in);
        int jog = -1;
        boolean ok = true;
        do {
            printCabecalho();
            System.out.println("\nJOGADA DE " + info.toUpperCase());
            jog = in.nextInt();
            if (!valida(jog)) {
                ok = false;
                System.out.println("VocÃª informou uma opÃ§Ã£o invÃ¡lida!");
                waitPress();
            } else {
                ok = true;
            }
        } while (!ok);
        return jog;
    }

    public static String nomeOpcao(int o) {
        switch (o) {
            case 0:
                return "PEDRA";
            case 1:
                return "PAPEL";
            case 2:
                return "TESOURA";
            case 3:
                return "LAGARTO";
            case 4:
                return "SPOCK";
        }
        return "";
    }

    public static void jogaga(Jogo j) throws Exception {
        int jog1 = lerJogada(j.getPlayer1());
        int jog2 = lerJogada(j.getPlayer2());

        String resultado = j.rodada(jog1, jog2);
        printCabecalho();
        System.out.println("\nJOGADA DE " + j.getPlayer1().toUpperCase() + ": " + nomeOpcao(jog1));
        System.out.println("JOGADA DE " + j.getPlayer2().toUpperCase() + ": " + nomeOpcao(jog2));

        System.out.print("\n\nVENCEDOR DA PARTIDA FOI... ");
        Thread.sleep(3000);
        System.out.print(resultado.toUpperCase() + "\n\n");

    }
}
