/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ExemploIO
{
    public static void main(String [] args){
		leitura();
		escrita();
    }
	
	static void leitura(){
		try{
            File arquivo = new File("saida.txt");
            Scanner in = new Scanner(arquivo);            
            while(in.hasNextInt()){
                System.out.println(in.nextInt());
            }          
            in.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo nÃ£o encontrado");
        } catch (Exception e){
            System.out.println("Erro!");
            System.out.println(e.getMessage());
        }
	}
	
	static void escrita(){
		try{
            System.out.print("\f"); 
            Scanner in = new Scanner(System.in);            
            System.out.println("Informe um nome para o arquivo");
            String nome = in.next();            
            PrintWriter saida = new PrintWriter(nome);
            for(int i=1; i<=100; i++){
                saida.println(i);
            }       
            saida.close();
        } catch(Exception e){
            System.out.println("Erro");
        }	
	}	
	
}
