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
public class Comodo {

    private int largura;
    private int comprimento;

    public Comodo(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public String toString() {
        return "Largura: " + largura + "\nComprimento: " + comprimento
                + "\nÃ�rea: " + getArea();
    }

    public int getArea() {
        return largura * comprimento;
    }
}