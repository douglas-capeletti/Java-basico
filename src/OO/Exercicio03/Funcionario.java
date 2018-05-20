/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio03;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class Funcionario {

    private String nome;
    private double valorHora;
    private double cargaHoraria;
    private double salario = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Funcionario(String nome, double valorHora, double cargaHoraria) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.cargaHoraria = cargaHoraria;
    }

    public double salario() {
        if (cargaHoraria > 0 && cargaHoraria <= 44) {
            return cargaHoraria * valorHora;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Nome: \t" + nome
                + "\nValor por Hora: \t" + valorHora
                + "\nCarga Horaria: \t\t" + cargaHoraria
                + "\nSalario: R$\t" + salario;
    }
}
