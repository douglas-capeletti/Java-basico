/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio09;

/**
 *
 * @author 17103446
 */
public class Jogo {

    private String player1;
    private String player2;

    public Jogo(String p1, String p2) {
        player1 = p1;
        player2 = p2;
    }

    public void setPlayer1(String p1) {
        player1 = p1;
    }

    public void setPlayer2(String p2) {
        player2 = p2;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    /**
     * Recebe as opÃ§Ãµes de jogadas e retorna o nome do vencedor da rodada.
     *
     * parametro Dois inteiros que correspondem as opÃ§Ãµes do player 1 e do player
     * 2. OpÃ§Ã£o 0 - Pedra OpÃ§Ã£o 1 - Papel OpÃ§Ã£o 2 - Tesoura OpÃ§Ã£o 3 -
     * Lagarto OpÃ§Ã£o 4 - Spock
     *
     * Onde: Tesoura corta papel Papel cobre pedra Pedra esmaga lagarto Lagarto
     * envenena Spock Spock esmaga (ou derrete) tesoura Tesoura decapita lagarto
     * Lagarto come papel Papel refuta Spock Spock vaporiza pedra Pedra quebra
     * tesoura
     *
     * @return O nome do vencedor da rodada ou "Empate" em caso de empate.
     */
    public String rodada(int opt1, int opt2) {
        if (opt1 == opt2) {
            return "Empate";
        }

        switch (opt1) {
            case 0:
                if (opt2 == 3 || opt2 == 2) {
                    return player1;
                } else {
                    return player2;
                }
            case 1:
                if (opt2 == 0 || opt2 == 4) {
                    return player1;
                } else {
                    return player2;
                }
            case 2:
                if (opt2 == 1 || opt2 == 3) {
                    return player1;
                } else {
                    return player2;
                }
            case 3:
                if (opt2 == 4 || opt2 == 1) {
                    return player1;
                } else {
                    return player2;
                }
            case 4:
                if (opt2 == 2 || opt2 == 0) {
                    return player1;
                } else {
                    return player2;
                }
        }
        return "";
    }
}
