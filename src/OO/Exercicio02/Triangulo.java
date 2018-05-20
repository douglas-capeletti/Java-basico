/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio02;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class Triangulo {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    //construtor

    public Triangulo(double a, double b, double c) {
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }
    //mÃ©todos modificadores - setters

    public void setLadoA(double novoLadoA) {
        ladoA = novoLadoA;
    }

    public void setLadoB(double novoLadoB) {
        ladoB = novoLadoB;
    }

    public void setLadoC(double novoLadoC) {
        ladoC = novoLadoC;
    }
    //mÃ©todos de acesso - getters

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    //outros mÃ©todos
    public String tipoTriangulo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "EquilÃ¡tero";
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            return "IsÃ³sceles";
        } else {
            return "Escaleno";
        }
    }

    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }

    public double area() {
        double p = perimetro() / 2;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }
    //toString

    public String toString() {
        return "Lado A: \t" + ladoA + "\nLado B: \t" + ladoB + "\nLado C: \t" + ladoC
                + "\nTipo: \t\t" + tipoTriangulo() + "\nPerÃ­metro: \t" + perimetro()
                + "\nÃ�rea: \t\t" + area();
    }

}
