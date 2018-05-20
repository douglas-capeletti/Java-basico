/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.exercicio11;

/**
 *
 * @author Doug
 */
public class Casa {

    private Comodo sala;
    private Comodo cozinha;
    private Comodo banheiro;
    private Comodo quarto1;
    private Comodo quarto2;

    public Casa(Comodo sala,
            Comodo cozinha,
            Comodo banheiro,
            Comodo quarto1,
            Comodo quarto2) {
        this.sala = sala;
        this.cozinha = cozinha;
        this.banheiro = banheiro;
        this.quarto1 = quarto1;
        this.quarto2 = quarto2;
    }

    public Comodo getSala() {
        return sala;
    }

    public Comodo getCozinha() {
        return cozinha;
    }

    public Comodo getBanheiro() {
        return banheiro;
    }

    public Comodo getQuarto1() {
        return quarto1;
    }

    public Comodo getQuarto2() {
        return quarto2;
    }

    public String toString() {
        String retorno = "Dados da casa: \n";
        retorno += "Ã�rea da sala: " + sala.getArea() + "\n";
        retorno += "Ã�rea da cozinha: " + cozinha.getArea() + "\n";
        retorno += "Ã�rea do banheiro: " + banheiro.getArea() + "\n";
        retorno += "Ã�rea do quarto 1: " + quarto1.getArea() + "\n";
        retorno += "Ã�rea do quarto 2: " + quarto2.getArea() + "\n";
        retorno += "Ã�rea total: " + getArea();
        return retorno;
    }

    public int getArea() {
        return sala.getArea() + cozinha.getArea() + banheiro.getArea()
                + quarto1.getArea() + quarto2.getArea();
    }
}
