/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.parqueDosDinossauros;

/**
 * 
 * Esta classe define o objeto Dinossauro, contendo seu id, o nome da raÃ§a, o tipo, a categoria, sua velocidade mÃ¡xima e seu peso
 * 
 */
public class Dinossauro
{
    private int idDinossauro; //corresponde ao ID do dinossauro. Cada dinossauro possui um ID Ãºnico.
    private String nomeRaca; //corresponde ao nome da raÃ§a do dinossauro
    private int tipo; //corresponde ao tipo do dinossauro. 1 para carnÃ­voros, 2 para herbÃ­voros.
    private int categoria; //corresponde a categoria do dinossauro. 1 para Pequeno Porte, 2 para MÃ©dio Porte, 3 para grande porte.
    private double velocidadeMax; //corresponde a velocidade mÃ¡xima que o dinossauro consegue atingir
    private double peso; //corresponde ao peso do dinossauro

    /**
     * MÃ©todo construtor, inicializa as variÃ¡veis
     */
    public Dinossauro(int idDinossauro, String nomeRaca, int tipo, int categoria, double velocidadeMax, double peso)
    {
        this.idDinossauro = idDinossauro;
        this.nomeRaca = nomeRaca;
        this.tipo = tipo;
        this.categoria = categoria;
        this.velocidadeMax = velocidadeMax;
        this.peso = peso;
    }
    
    
    /**
     * MÃ©todo getX, retorna a variÃ¡vel idDinossauro
     */
    public int getIdDinossauro() { return idDinossauro;}
    /**
     * MÃ©todo getX, retorna a variÃ¡vel nomeRaca
     */
    public String getNomeRaca() { return nomeRaca;}
    /**
     * MÃ©todo getX, retorna a variÃ¡vel tipo
     */
    public int getTipo() { return tipo;}
    /**
     * MÃ©todo getX, retorna a variÃ¡vel categoria
     */
    public int getCategoria() { return categoria;}
    /**
     * MÃ©todo getX, retorna a variÃ¡vel velocidadeMax
     */
    public double getVelocidadeMax() { return velocidadeMax;}
    /**
     * MÃ©todo getX, retorna a variÃ¡vel peso
     */
    public double getPeso() { return peso;}
   
    
    /**
     * MÃ©todo setX, muda o valor da variÃ¡vel idDinossauro para o informado
     */
    public void setIdDinossauro(int idDinossauro) { this.idDinossauro = idDinossauro;}
    /**
     * MÃ©todo setX, muda o valor da variÃ¡vel nomeRaca para o informado
     */
    public void setNomeRaca(String nomeRaca) {this.nomeRaca = nomeRaca;}
    /**
     * MÃ©todo setX, muda o valor da variÃ¡vel tipo para o informado
     */
    public void setTipo(int tipo) { this.tipo = tipo;}
    /**
     * MÃ©todo setX, muda o valor da variÃ¡vel categoria para o informado
     */
    public void setCategoria(int categoria) {this.categoria = categoria;}
    /**
     * MÃ©todo setX, muda o valor da variÃ¡vel velocidadeMax para o informado
     */
    public void setVelocidadeMax(double velocidadeMax) {this.velocidadeMax = velocidadeMax;}
    /**
     * MÃ©todo setX, muda o valor da variÃ¡vel peso para o informado
     */
    public void setPeso(double peso) {this.peso = peso;}
    
    
    /**
     * MÃ©todo toString, retorna uma String com todas as variÃ¡veis
     */
    public String toString()
    {
        return
        "ID Dinossauro: " + idDinossauro +
        "\nNome RaÃ§a: " + nomeRaca + 
        "\nTipo: " + tipo +
        "\nCategoria: " + categoria +
        "\nVelocidade MÃ¡xima: " + velocidadeMax +
        "\nPeso: " + peso;
    }
    
    
}
