    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.exercicio02;

/**
 *
 * @author Doug
 */
public class Exercicio02
{
    public static void main(String [] args){
        System.out.println("\f");        
        int [] vetor = new int[10];

        for(int i=0;i<vetor.length;i++){
            vetor[i]=Mine.leInteiro();  
        }

        Mine.sop("Pesquisa de valores");        
        int pesquisa = Mine.leInteiro();
        boolean esta=false;
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]==pesquisa){
                esta=true;                
                break;
            } 
        }
        if(esta){
            Mine.sop("EstÃ¡ no vetor");
        } else {
            Mine.sop("NÃ£o estÃ¡ no vetor");           
        }
        
        int contaPares=0;
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]%2==0){
                contaPares++;
            }
        }
        Mine.sop("Quantidade de pares: " + contaPares);  
        
        /*
        for(int i=0;i<vetor.length;i++){
        Mine.sop(""+vetor[i]);  
        }*/

    }
}

