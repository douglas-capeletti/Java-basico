/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.parqueDosDinossauros;

/**
 *
 * @author Doug
 */
public class ParqueDosDinossauros
{
    Dinossauro[][] matriz;

    /**
     * MÃ©todo construtor, inicializa a matriz
     */
    public ParqueDosDinossauros()
    {
        matriz = new Dinossauro[100][100];
    }

    /**
     * Este mÃ©todo adiciona um objeto Dinossauro em uma posiÃ§Ã£o definida pelo usuÃ¡rio na matriz
     */
    public boolean adicionarDinossauro(Dinossauro d, int l, int c)
    {
        if(validarPosic(l, c))
        {
            if(matriz[l][c] == null)
            {
                boolean diag1 = temOposto(d, l-1, c-1);
                boolean colunC = temOposto(d, l, c-1);
                boolean diag2 = temOposto(d, l+1, c+1);
                boolean linhaE = temOposto(d, l-1, c);
                boolean linhaD = temOposto(d, l+1, c);
                boolean diag3 = temOposto(d, l-1, c+1);
                boolean colunB = temOposto(d, l, c+1);
                boolean diag4 = temOposto(d, l+1, c+1);

                if(diag1 || colunC || diag2 || linhaE || linhaD || diag3 || colunB || diag4)
                    return false;
                else
                {
                    matriz[l][c] = d;
                    return true;
                }
            }
            else
                return false;
        }
        else
            return false;
    }

    /**
     * Este mÃ©todo verifica se a posiÃ§Ã£o informada Ã© vÃ¡lida
     */
    public boolean validarPosic(int l, int c)
    {
        if(l < 0 || 1 >= matriz.length || c < 0 || c >= matriz[0].length)
            return false;
        else
            return true;
    }

    /**
     * este mÃ©todo verifica se, no espaÃ§o informado, existe um objeto Dinossauro com variÃ¡vel tipo diferente do informado
     */
    public boolean temOposto(Dinossauro d, int l, int c)
    {
        if(validarPosic(l, c))
        {
            if(matriz[l][c] != null && matriz[l][c].getTipo() != d.getTipo())
                return true;
            else
                return false;
        }
        else
        {
            return false;
        }
    }

    /**
     * Este mÃ©todo pesquisa, a partir da variÃ¡vel id, se existe um objeto Dinossauro com a variÃ¡vel idDinossauro igual, e se existir, o retorna
     */
    public Dinossauro pesquisarDinossauro(int id)
    {
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] != null)
                    if(matriz[i][j].getIdDinossauro() == id)
                        return matriz[i][j];
            }
        }

        return null;
    }

    /**
     * Este mÃ©todo remove da matriz, o objeto com id informado pelo usuÃ¡rio
     */
    public boolean removerDinossauro(int id)
    {
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] != null)
                    if(matriz[i][j].getIdDinossauro() == id)
                    {
                        matriz[i][j] = null;
                        return true;
                    }
            }
        }

        return false;
    }

    /**
     * Este mÃ©todo transfere um objeto de um lugar ao outro da matriz. O objeto e o local sÃ£o informados pelo usuÃ¡rio
     */
    public boolean transferirDinossauro(int id, int l, int c)
    {
        Dinossauro d = pesquisarDinossauro(id);

        int linha, coluna;

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] == d)
                {
                    linha = l;
                    coluna = c;
                    break;
                }
            }
        }

        boolean s_n = adicionarDinossauro(d, l, c);
        if(s_n == false)        
            return false;
        else
        {
            s_n = removerDinossauro(id);
            if(s_n == false)
                return false;
            else
                return true;
        }
    }

    /**
     * Este mÃ©todo retorna uma String contendo a quantidade de Dinossauros, divididos entre tipo e categoria
     */
    public String quantTC()
    {
        int cP = 0, cM = 0, cG = 0, hP = 0, hM = 0, hG = 0;

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] != null)
                    if(matriz[i][j].getTipo() == 1)
                    {
                        if(matriz[i][j].getCategoria() == 1)
                            cP++;
                        else if(matriz[i][j].getCategoria() == 2)
                            cM++;
                        else
                            cG++;
                    }
                    else
                    {
                        if(matriz[i][j].getCategoria() == 1)
                            hP++;
                        else if(matriz[i][j].getCategoria() == 2)
                            hM++;
                        else
                            hG++;
                    }
            }
        }

        return
        "CarnÃ­voros\nPequeno Porte: " + cP +
        "\nMÃ©dio Porte: " + cM +
        "\nGrande Porte" + cG +
        "\n\nHerbÃ­voros\nPequeno Porte: " + hP +
        "\nMÃ©dio Porte: " + hM +
        "\nGrande Porte: " + hG;
    }

    /**
     * Este mÃ©todo recebe um tipo e categoria de Dinossauro, e retorna o objeto com maior peso entre eles
     */
    public Dinossauro pesoPesado(int tipo, int categoria)
    {
        Dinossauro dino = null;

        double peso = 0;
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] != null)
                    if(matriz[i][j].getTipo() == tipo)
                        if(matriz[i][j].getCategoria() == categoria)
                            if(matriz[i][j].getPeso() > peso)
                            {
                                dino = matriz[i][j];
                                peso = dino.getPeso();
                            }
            }
        }

        return dino;
    }

    /**
     * Este mÃ©todo recebe um tipo e categoria de Dinossauro, e retorna o objeto com maior velocidadeMax entre eles
     */
    public Dinossauro rapidao(int tipo, int categoria)
    {
        Dinossauro dino = null;

        double velocidade = 0;
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] != null)
                    if(matriz[i][j].getTipo() == tipo)
                        if(matriz[i][j].getCategoria() == categoria)
                            if(matriz[i][j].getVelocidadeMax() > velocidade)
                            {
                                dino = matriz[i][j];
                                velocidade = dino.getVelocidadeMax();
                            }
            }
        }

        return dino;
    }

    /**
     * Este mÃ©todo retorna uma String com a quantidade de carne necessÃ¡ria para alimentar os objetos Dinossauro com tipo igual a 1, por um mÃªs
     */
    public double quantCarne()
    {
        double quantP = 0, quantM = 0, quantG = 0;

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] != null)
                    if(matriz[i][j].getCategoria() == 1)
                        quantP = quantP + ((matriz[i][j].getPeso() / 10) * 30);
                    else if(matriz[i][j].getCategoria() == 2)
                        quantM = quantM + (((3 * matriz[i][j].getPeso()) / 20) * 30);
                    else
                        quantG = quantG + ((matriz[i][j].getPeso() / 5) * 30);
            }
        }

        return quantP + quantM + quantG;
    }

    /**
     * Este mÃ©todo verifica se, com os valores definidos, Ã© possivel fugir do Dinossauro a tempo ou nÃ£o
     */
    public boolean fugir(int distDB, int distPB, int id)
    {
        double tempoD = 0, tempoP = 0;

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] != null)
                    if(matriz[i][j].getIdDinossauro() == id)
                    {
                        tempoD = distDB / matriz[i][j].getVelocidadeMax();
                        break;
                    }
            }
        }

        tempoP = distPB / 20;
        if(tempoD > tempoP)
            return true;
        else
            return false;
    }

    /**
     * Este mÃ©todo retorna uma string contendo qual zona do parque Ã© a mais perigosa no momento
     */
    public String zonaP()
    {
        int no = 0, nl = 0, so = 0, sl = 0;

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                if(matriz[i][j] != null)
                    if(i < 500 && j < 500)
                    {
                        if(matriz[i][j].getCategoria() == 1)
                            no++;
                    }
                    else
                    {
                        if(i < 500 && j >= 500)
                        {
                            if(matriz[i][j].getCategoria() == 1)
                                nl++;
                        }
                        else
                        {
                            if(i >= 500 && j < 500)
                            {
                                if(matriz[i][j].getCategoria() == 1)
                                    so++;
                            }
                            else
                            {
                                if(matriz[i][j].getCategoria() == 1)
                                    sl++;
                            }
                        }
                    }
            }
        }

        if(no == 0 && nl == 0 && so == 0 && sl == 0)
            return "Parque vazio .-.";
        else
        {
            if(no > nl && no > so && no > sl)
                return "Noroeste";
            else
            {
                if(nl > no && nl > so && nl > sl)
                    return "Nordeste";
                else
                {
                    if(so > no && so > nl && so > sl)
                        return "Sudoeste";
                    else
                        return "Sudeste";
                }
            }
        }
    }

    public void printPark(){

        for(int i = 0; i < matriz.length; i++){
            System.out.print("|");
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j] != null){
                    System.out.print(matriz[i][j].getTipo() == 1 ? "c" : "h");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
            System.out.print("\n");
        }
    }

}
