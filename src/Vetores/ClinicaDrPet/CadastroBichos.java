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
public class CadastroBichos
{
    private Bicho[] cadastroBichos;
    private int proximaPosicao;
    
    public CadastroBichos(int tamanho){
        cadastroBichos = new Bicho[tamanho];
        proximaPosicao = 0;
    }
    
    public Bicho[] getCadastro(){return cadastroBichos;}
    
    public boolean adicionarBicho(Bicho b) throws ArrayIndexOutOfBoundsException{
        if(proximaPosicao < cadastroBichos.length){
            cadastroBichos[proximaPosicao] = b;
            proximaPosicao++;
            return true;
        } else { return false; }        
    }
    
    public Bicho pesquisarBicho(String cpfDono, String nomeBicho) throws ArrayIndexOutOfBoundsException{        
        for(int i=0; i<proximaPosicao; i++){
            if(cadastroBichos[i].getDono().getCpf().equals(cpfDono) &&
            cadastroBichos[i].getNome().equalsIgnoreCase(nomeBicho)){
                return cadastroBichos[i];
            }
        }
        return null;        
    }
    
    public boolean removerBicho(String cpfDono, String nomeBicho)throws ArrayIndexOutOfBoundsException{
        for(int i=0; i<proximaPosicao; i++){
            if(cadastroBichos[i].getDono().getCpf().equals(cpfDono) &&
                cadastroBichos[i].getNome().equalsIgnoreCase(nomeBicho)){
                cadastroBichos[i] = null;
                for(int j=i; j<proximaPosicao; j++){
                    cadastroBichos[j] = cadastroBichos[j+1];
                }
                cadastroBichos[proximaPosicao]= null;
                proximaPosicao--;
                return true;
            }
        }
        return false;
    }
    
    public boolean temNaLista(Pessoa[] lista, Pessoa p){
        for(Pessoa pe : lista){
            if(pe == p){
                return true;
            }
        }
        return false;
    }
    
    public Pessoa[] donosPorTipo(int tipo){
        Pessoa[] donosEncontrados = new Pessoa[proximaPosicao];
        int auxiliar = 0;
        for(int i = 0; i < proximaPosicao; i++){
            if(cadastroBichos[i].getTipo() == tipo &&
               !temNaLista(donosEncontrados, cadastroBichos[i].getDono())){
                   donosEncontrados[auxiliar] = cadastroBichos[i].getDono();
                   auxiliar++;
            }
        }
        Pessoa[] donosEncontradosL = new Pessoa[auxiliar-1];        
        for(int i=0; i<donosEncontradosL.length; i++){
            donosEncontradosL[i] = donosEncontrados[i];
        }        
        
        for(int i=0; i<donosEncontradosL.length - 1; i++){
            for(int j=0; j<donosEncontradosL.length - 1 - i; j++){
                if(donosEncontradosL[j].getNome().compareToIgnoreCase(donosEncontradosL[j+1].getNome()) > 0){
                    Pessoa aux = donosEncontradosL[j];
                    donosEncontradosL[j] = donosEncontradosL[j+1];
                    donosEncontradosL[j+1] = aux;
                }
            }            
        }
        
        return donosEncontradosL;
    }
    

}

