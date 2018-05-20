/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio01;

/**
 *
 * @author 17103446
 */
public class Retangulo {

    //declaraÃ§Ã£o dos atributos
    private double base;
    private double altura;

    //mÃ©todo construtor
    public Retangulo(double b, double a) {
        base = b;
        altura = a;
    }

    //mÃ©todos getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    //mÃ©todos setters
    public void setAltura(double novaAltura) {
        altura = novaAltura;
    }

    public void setBase(double novaBase) {
        base = novaBase;
    }

    //toString
    public String toString() {
        return "Base:\t" + base + "\nAltura:\t" + altura
                + "\nÃ�rea:\t" + calculaArea() + "\nPerÃ­metro:\t"
                + calculaPerimetro() + "\nDiagonal:\t" + calculaDiagonal();
        //return String.format("Base:\t %f\nAltura:\t %f", base, altura);        
    }

    public double calculaArea() {
        return base * altura;
    }

    public double calculaPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public double calculaDiagonal() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

}
