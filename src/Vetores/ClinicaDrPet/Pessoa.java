/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.ClinicaDrPet;

/**
 *
 * @author Doug
 */
public class Pessoa {

    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;

    public Pessoa(String cpf, String nome, String telefone, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    //sem setter de CPF e Nome, pois estou definindo que uma pessoa nÃ£o pode trocar
    //de nome ou de nÃºmero de CPF
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "CPF: " + cpf
                + "\nNome: " + nome
                + "\nTelefone: " + telefone
                + "\nEndereÃ§o: " + endereco;
    }
}
