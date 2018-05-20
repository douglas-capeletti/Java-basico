/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doug
 */
public class Matrizes
{
    public static void imprimeMatriz(int [][] matriz){
        for(int i=0;i<matriz.length;i++){           
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        } 
    }
    
    public static void imprimeVetor(int [] vetor){
        for(int i=0;i<vetor.length;i++){ 
                System.out.print(vetor[i] + " ");
        } 
    }

    public static void inicializaMatriz(int [][] m){
        for(int i=0;i<m.length;i++){           
            for(int j=0; j<m[i].length; j++){               
                m[i][j] = (int) (Math.random() * 10);
            }           
        }         
    }

    public static int[] imprimeDiagSecundaria(int [][] m){            
        int [] resultado = new int[m.length];
        for(int i=0;i<m.length;i++){ 
            resultado[i] = m[i][m[0].length - 1 - i];               
        }  
        return resultado;
    }
    
    public static int[] imprimeDiagPrincipal(int [][] m){   
        int [] resultado = new int[m.length];
        for(int i=0;i<m.length;i++){
            resultado[i] = m[i][i];
        } 
         return resultado;
    }

    public static void imprimeSomaColunas(int [][] m){        
        for(int j=0; j<m[0].length; j++){  
            int soma = 0;
            for(int i=0;i<m.length;i++){   
                soma += m[i][j];
            }     
            System.out.print(soma + " ");
        }          
    }

    public static void imprimeSomaLinhas(int [][] m){        
        for(int i=0;i<m.length;i++){   
            int soma = 0;
            for(int j=0; j<m[i].length; j++){               
                soma += m[i][j];
            }     
            System.out.print(soma + " ");
        }          
    }

    public static void main(String [] args){        
        System.out.println("\f");
        int [][] matriz = new int[5][5];
        inicializaMatriz(matriz);
        System.out.println("\nValores da Matriz: ");
        imprimeMatriz(matriz); 
        System.out.println("\nSoma das linhas: ");
        imprimeSomaLinhas(matriz);
        System.out.println("\nSoma das colunas: ");
        imprimeSomaColunas(matriz);
        System.out.println("\nElementos da diagonal principal: ");
        imprimeVetor(imprimeDiagPrincipal(matriz));     
        System.out.println("\nElementos da diagonal secundÃ¡ria: ");
        imprimeVetor(imprimeDiagSecundaria(matriz));
    }
}

