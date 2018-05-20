/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.exercicio08;

/**
 *
 * @author Doug
 */
public class Produto {
    private String id;
    private String descricao;
    private double precoCusto;
    private int quantEstoque;
    //contrutor    
    public Produto(String id, 
    String descricao, 
    double precoCusto, 
    int quantEstoque){
        this.id = id;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.quantEstoque = quantEstoque;  
        
    }
    //mÃ©todos de acesso - getters
    public String getId(){ return id;}
    public String getDescricao(){ return descricao;}
    public double getPrecoCusto(){ return precoCusto;} 
    public int getQuantEstoque(){ return quantEstoque;}
    //mÃ©todos modificadores - setters
    public void setId(String id){ this.id = id;}
    public void setDescricao(String descricao){ this.descricao=descricao;}
    public void setPrecoCusto(double precoCusto){ precoCusto = precoCusto;}    
    public void setQuantEstoque(int quantEstoque){ quantEstoque = quantEstoque;}
    /**
     * MÃ©todo que calcula o preÃ§o de venda com base no preÃ§o de custo:
     * AtÃ© 50, 55%
     * AtÃ© 100, 43%
     * AtÃ© 150, 32%
     * Acima disso, 18%
     * 
     * param NÃ£o tem parÃ¢metro
     * @return um valor double, correspondente ao preÃ§o de venda do produto.
     */
    public double calculaPrecoVenda(){
        if(precoCusto <= 50){
            return precoCusto * 1.55;
        } else if(precoCusto <= 100){
            return precoCusto * 1.43;
        } else if(precoCusto <= 150){           
            return precoCusto * 1.32;
        } else {
           return precoCusto * 1.18;
        }
    }
    
    public double calculaTotalEstoque(){
        return calculaPrecoVenda() * quantEstoque;        
    }

    public String toString(){
        return String.format("ID: %s\nDescriÃ§Ã£o: %s\nPreÃ§o custo: R$ %.2f\nQuantidade em estoque: %d\nPreÃ§o de venda: R$ %.2f\nTotal do estoque: R$ %.2f", id, descricao, precoCusto, quantEstoque, calculaPrecoVenda(), calculaTotalEstoque());               
               
    }
}
