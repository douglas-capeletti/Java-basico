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
public class CadastroConsultas
{
    private Consulta[] cadastroConsultas;
    private int proximaPosicao;
    
    public CadastroConsultas(int tamanho){
        cadastroConsultas = new Consulta[tamanho];
        proximaPosicao = 0;
    }
    
    public boolean adicionarConsulta(Consulta c){
        if(proximaPosicao < cadastroConsultas.length){
            cadastroConsultas[proximaPosicao] = c;
            proximaPosicao++;
            return true;
        }
        return false;
    }
    
    public Consulta[] pesquisaConsultas(String cpfDono, String nomeBicho){
        Consulta[] consultasEncontradas = new Consulta[proximaPosicao];
        int tamanhoRealDoArray = 0;
        
        for(int i=0; i<proximaPosicao; i++){
            if(cadastroConsultas[i].getBicho().getDono().getCpf().equals(cpfDono)&&
            cadastroConsultas[i].getBicho().getNome().equalsIgnoreCase(nomeBicho)){
                consultasEncontradas[tamanhoRealDoArray] = cadastroConsultas[i];
                tamanhoRealDoArray++;
            }
        }
        
        Consulta[] consultasEncontrasL = new Consulta[tamanhoRealDoArray-1];
        for(int i=0; i<tamanhoRealDoArray; i++){
            consultasEncontrasL[i] = consultasEncontradas[i];
        }
        return consultasEncontrasL;
    }
    
    public boolean temNaLista(Bicho[] lista, Bicho b){
        for(Bicho bicho : lista){
            if(bicho == b){
                return true;
            }
        }
        return false;
    }
    
    public Bicho[] atendimentosPorTipo(int tipo){
        Bicho[] bichosEncontrados = new Bicho[proximaPosicao];
        int auxiliar = 0;
        for(int i = 0; i < proximaPosicao; i++){
            if(cadastroConsultas[i].getBicho().getTipo() == tipo &&
               !temNaLista(bichosEncontrados, cadastroConsultas[i].getBicho())){
                bichosEncontrados[auxiliar] = cadastroConsultas[i].getBicho();
                auxiliar++;
            }            
        }
        Bicho[] bichosEncontradosL = new Bicho[auxiliar-1];
        for(int i=0; i < bichosEncontradosL.length; i++){
            bichosEncontradosL[i] = bichosEncontrados[i];
        }
        return bichosEncontradosL;
    }
    
    public int tipoMaisAtendido(){
        int cachorros = 0; //tipo 1
        int gatos = 0; //tipo 2     
        int outros = 0;//tipo 3
        for(int i = 0; i < proximaPosicao; i++){
            if(cadastroConsultas[i].getBicho().getTipo() == 1){
                cachorros++;
            } else if(cadastroConsultas[i].getBicho().getTipo() == 2){
                gatos++;
            } else {
                outros++;
            }            
        }     
        if(cachorros > gatos && cachorros > outros){
            return 1;
        } else if(gatos > outros) {
            return 2;
        } else {
            return 3;
        }        
    }
    
    
    
    
    
    
    
    
}

