/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio06;

/**
 *
 * @author 17103446
 */
public class Carros {

    private double quilometragem, capacidadeTanque, estadoTanque, consumoMedio;

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getEstadoTanque() {
        return estadoTanque;
    }

    public void setEstadoTanque(double estadoTanque) {
        this.estadoTanque = estadoTanque;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public Carros(double quilometragem, double capacidadeTanque, double estadoTanque) {
        this.quilometragem = quilometragem;
        this.capacidadeTanque = capacidadeTanque;
        this.estadoTanque = estadoTanque;
    }

    public void abastecer(double estadoTanque, double gasolina){
        if (estadoTanque + gasolina <= capacidadeTanque) {
            
        }
    
    
    } 
     
}
