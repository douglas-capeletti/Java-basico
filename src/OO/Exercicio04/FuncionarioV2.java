/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio04;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class FuncionarioV2 {

    private String nome;
    private double valorHora;
    private double cargaHoraria;
    private double anosTrabalho;

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

    public double getAnosTrabalho() {
        return anosTrabalho;
    }

    public void setAnosTrabalho(double anosTrabalho) {
        this.anosTrabalho = anosTrabalho;
    }

    public FuncionarioV2(String nome, double valorHora, double cargaHoraria, double anosTrabalho) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.cargaHoraria = cargaHoraria;
        this.anosTrabalho = anosTrabalho;
    }

    public double salario() {
        if (cargaHoraria > 0 && cargaHoraria <= 44) {
            return cargaHoraria * valorHora;
        } else {
            return -1;
        }
    }
    
    public double adicional(){
        double bonus = 0;
        if (anosTrabalho >= 10) {
            bonus = salario() * 1.08;
            return bonus;
        } else if (anosTrabalho >= 5 ) {
            bonus = salario() * 1.05;
            return bonus;
        } else {return bonus;}     
    }

    @Override
    public String toString() {
        return "Nome: \t" + nome
                + "\nValor por Hora: \t" + valorHora
                + "\nCarga Horaria: \t" + cargaHoraria
                + "\nSalario: R$\t" + salario()
                + "\nAdicional: R$\t" + adicional();
    }
}
