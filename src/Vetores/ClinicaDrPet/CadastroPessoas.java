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
public class CadastroPessoas
{
    private Pessoa[] cadastroPessoas;
    private int proximaPosicao;
    
    public CadastroPessoas(int tamanho){
        cadastroPessoas = new Pessoa[tamanho];
        proximaPosicao = 0;
    }
    
    public Pessoa[] getCadastro(){return cadastroPessoas;}
    
    public boolean adicionarPessoa(Pessoa p) throws ArrayIndexOutOfBoundsException{
        if(proximaPosicao < cadastroPessoas.length){
            cadastroPessoas[proximaPosicao] = p;
            proximaPosicao++;
            return true;
        } else { return false; }        
    }
    
    public Pessoa pesquisarPessoa(String cpf) throws ArrayIndexOutOfBoundsException{        
        for(int i=0; i<proximaPosicao; i++){
            if(cadastroPessoas[i].getCpf().equals(cpf)){
                return cadastroPessoas[i];
            }
        }
        return null;        
    }
    
    public boolean removerPessoa(String cpf) throws ArrayIndexOutOfBoundsException{
        for(int i=0; i<proximaPosicao; i++){
            if(cadastroPessoas[i].getCpf().equals(cpf)){
                cadastroPessoas[i] = null;
                for(int j=i; j<proximaPosicao; j++){
                    cadastroPessoas[j] = cadastroPessoas[j+1];                    
                }
                cadastroPessoas[proximaPosicao]=null;
                proximaPosicao--;
                return true;
            }
        }
        return false;
    }
}

