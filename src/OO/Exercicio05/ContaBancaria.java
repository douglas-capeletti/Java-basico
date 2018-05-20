/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Exercicio05;

/**
 *
 * @author douglas.da.rosa.paz
 */
public class ContaBancaria {

    private static int CONTAS = 1;

    private String titular;
    private int numAgencia;
    private int numConta;
    private double saldo;

    //mÃ©todo construtor
    public ContaBancaria(String titular, int numAgencia) {
        this.titular = titular;
        this.numAgencia = numAgencia;
        this.numConta = CONTAS;
        CONTAS++;
        saldo = 0;
    }

    //mÃ©todos modificadores
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    //mÃ©todo de acesso
    public String getTitular() {
        return titular;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //toString
    public String toString() {
        return "Titular: \t" + titular
                + "\nAgÃªncia: \t" + numAgencia
                + "\nConta: \t\t" + numConta
                + "\nSaldo: R$\t" + saldo;
    }

    //outros mÃ©todos
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void transferir(double valor, ContaBancaria destino) {
        destino.depositar(valor);
        sacar(valor);
        //saldo = saldo - valor;
    }

}
