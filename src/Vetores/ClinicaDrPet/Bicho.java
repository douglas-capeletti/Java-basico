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
public class Bicho
{
    private String nome;
    private int tipo;
    private String raca;
    private int idade;
    private Pessoa dono;
    
    public Bicho(String nome, int tipo, String raca, int idade, Pessoa dono){
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
    }
    
    public String getNome(){return nome;}
    public int getTipo(){return tipo;}
    public String getRaca(){return raca;}
    public int getIdade(){return idade;}
    public Pessoa getDono(){return dono;}
    
    public void setIdade(int idade){this.idade=idade;}
    public void setDono(Pessoa dono){this.dono=dono;}
       
    public String toString(){
        return "Bicho: " + nome + 
        "\nTipo: " + (tipo == 1 ? "Cachorro" : tipo == 2 ? "Gato" : "Outros") + 
        "\nRaÃ§a: " + raca + 
        "\nIdade: " + idade + 
        "\nNome do dono: " + dono.getNome() + 
        "\nCPF do dono: " + dono.getCpf();        
    }
    
}

