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
import java.util.Scanner;

public class Interface
{
    Scanner input;
    ParqueDosDinossauros parque;

    public Interface()
    {
        input = new Scanner(System.in);
        parque = new ParqueDosDinossauros();
    }

    public void menu()
    {  
        int opcao;
        do
        {
            System.out.println("\f");
            System.out.println("MENU");
            System.out.println("\nDigite a opÃ§Ã£o correspondente a sua escolha:");
            System.out.println("1 - Cadastrar um dinossauro no parque");
            System.out.println("2 - Pesquisar um dinossauro no parque");
            System.out.println("3 - Remover um dinossauro do parque");
            System.out.println("4 - Transferir um dinossauro no parque");
            System.out.println("5 - RelatÃ³rios");
            System.out.println("6 - Mapa do parque");
            System.out.println("0 - Encerrar o programa");
            do
            {
                opcao = input.nextInt();
                switch(opcao)
                {
                    case 0:
                    System.out.println("\f");
                    System.out.println("Programa encerrado.");
                    input.nextLine();
                    break;

                    case 1:
                    cadastrar();
                    break;

                    case 2:
                    pesquisar();
                    break;

                    case 3:
                    remover();
                    break;

                    case 4:
                    transferir();
                    break;

                    case 5:
                    relatorios();
                    break;

                    case 6:
                    parque.printPark();
                    input.next();
                    break;

                    default:                    
                    System.out.println("OpÃ§Ã£o invÃ¡lida, selecione novamente");                    
                }
            }while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6);

        }while(opcao != 0);
    }

    public void relatorios()
    {
        int opcao;

        do
        {
            System.out.println("\f");
            System.out.println("RELATÃ“RIOS");
            System.out.println("\nDigite a opÃ§Ã£o correspondente a sua escolha:");
            System.out.println("1 - RelatÃ³rio Quantidade de animais de cada tipo e categoria");
            System.out.println("2 - RelatÃ³rio Peso-pesado");
            System.out.println("3 - RelatÃ³rio O rapidÃ£o");
            System.out.println("4 - RelatÃ³rio Quantidade de carne para carnÃ­voros");
            System.out.println("5 - RelatÃ³rio DÃ¡ tempo de fugir?");
            System.out.println("6 - RelatÃ³rio Zonas perigosas do parque");
            System.out.println("0 - Voltar ao outro menu");
            do
            {
                opcao = input.nextInt();
                switch(opcao)
                {
                    case 0:
                    System.out.println("Retornando ao menu anterior...");
                    input.nextLine();
                    break;

                    case 1:
                    relatQuant();
                    break;

                    case 2:
                    relatPeso();
                    break;

                    case 3:
                    relatRapido();
                    break;

                    case 4:
                    relatQuantC();
                    break;

                    case 5:
                    relatFugir();
                    break;

                    case 6:
                    relatZonasP();
                    break;

                    default:                    
                    System.out.println("OpÃ§Ã£o invÃ¡lida, selecione novamente");                    
                }
                input.nextLine();
            }while(opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6);
        }while(opcao != 0);
    }

    public void cadastrar()
    {
        int id, tipo, categoria, linha, coluna, repetir;
        String nome;
        double velocidade, peso;
        boolean s_n;

        do
        {
            System.out.println("\f");
            System.out.println("CADASTRO DE DINOSSAUROS");
            System.out.println("\nDigite as informaÃ§Ãµes que serÃ£o pedidas:");
            input.nextLine();
            System.out.println("ID:");
            id = input.nextInt();
            System.out.println("Nome da raÃ§a:");
            nome = input.next();
            System.out.println("Tipo do dinossauro:");
            tipo = input.nextInt();
            System.out.println("Categoria do dinossauro:");
            categoria = input.nextInt();
            System.out.println("Velocidade MÃ¡xima do dinossauro:");
            velocidade = input.nextDouble();
            System.out.println("Peso do dinossauro:");
            peso = input.nextDouble();
            System.out.println("VocÃª deseja adicionar o dinossauro em qual posiÃ§Ã£o?");
            System.out.println("Linha: ");
            linha = input.nextInt();
            System.out.println("Coluna: ");
            coluna = input.nextInt();

            Dinossauro dino = new Dinossauro(id, nome, tipo, categoria, velocidade, peso);
            s_n = parque.adicionarDinossauro(dino, linha, coluna);

            if(s_n == false)
            {
                System.out.println("Erro no cadastro, deseja tentar novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - NÃ£o");
                do
                {
                    repetir = input.nextInt();
                }while(repetir != 1 && repetir != 2);

                if(repetir == 2)
                {
                    System.out.println("Cadastro encerrado");
                    input.nextLine();
                }
            }
            else
            {
                System.out.println("Cadastro concluÃ­do, deseja cadastrar outro?");
                System.out.println("1 - Sim");
                System.out.println("2 - NÃ£o");
                do
                {
                    repetir = input.nextInt();
                }while(repetir != 2 && repetir != 1);

            }
        }while(repetir == 1);

    }

    public void pesquisar()
    {
        int id, repetir;
        Dinossauro dino;

        do
        {
            System.out.println("\f");
            System.out.println("PESQUISA");
            System.out.println("\nDigite o ID do dinossauro:");
            id = input.nextInt();

            dino = parque.pesquisarDinossauro(id);
            if(dino == null)
            {
                System.out.println("Nenhum dinossauro foi encontrado com esse ID, deseja tentar novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - NÃ£o");
                do
                {
                    repetir = input.nextInt();
                }while(repetir != 2 && repetir != 1);
            }
            else
            {
                System.out.println(dino.toString());
                System.out.println("\nDeseja pesquisar outro dinossauro?");
                System.out.println("1 - Sim");
                System.out.println("2 - NÃ£o");
                do
                {
                    repetir = input.nextInt();
                }while(repetir != 2 && repetir != 1);
            }
        }while(repetir == 1);
    }

    public void remover()
    {
        int id, repetir;
        boolean s_n;

        do
        {
            System.out.println("\f");
            System.out.println("REMOVER DINOSSAURO");
            System.out.println("\nDigite o ID do dinossauro:");
            id = input.nextInt();

            s_n = parque.removerDinossauro(id);
            if(s_n == false)
            {
                System.out.println("Nenhum dinossauro foi encontrado com esse ID, deseja tentar novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - NÃ£o");
                do
                {
                    repetir = input.nextInt();
                }while(repetir != 2 && repetir != 1);
            }
            else
            {
                System.out.println("Dinossauro removido, deseja remover outro?");
                System.out.println("1 - Sim");
                System.out.println("2 - NÃ£o");
                do
                {
                    repetir = input.nextInt();
                }while(repetir != 2 && repetir != 1);
            }
        }while(repetir == 1);
    }

    public void transferir()
    {
        int id, linha, coluna, repetir;
        boolean s_n;

        do
        {
            System.out.println("\f");
            System.out.println("TRANSFERÃŠNCIA");
            System.out.println("\nDigite o ID do dinossauro a ser transferido:");
            id = input.nextInt();
            System.out.println("Digite a posiÃ§Ã£o nova do dinossauro");
            System.out.println("Linha:");
            linha = input.nextInt();
            System.out.println("Coluna:");
            coluna = input.nextInt();

            s_n = parque.transferirDinossauro(id, linha, coluna);

            if(s_n == false)
            {
                System.out.println("Erro na transferÃªncia, deseja tentar novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - NÃ£o");
                do
                {
                    repetir = input.nextInt();
                }while(repetir != 2 && repetir != 1);
            }
            else
            {
                System.out.println("Dinossauro transferido, deseja transferir outro dinossauro?");
                System.out.println("1 - Sim");
                System.out.println("2 - NÃ£o");
                do
                {
                    repetir = input.nextInt();
                }while(repetir != 2 && repetir != 1);
            }
        }while(repetir == 1);
    }

    public void relatQuant()
    {
        System.out.println("\f");
        System.out.println("RELATÃ“RIO DE QUANTIDADE DE ANIMAIS");
        System.out.println("\n" + parque.quantTC());
    }

    public void relatPeso()
    {
        Dinossauro dino;
        int tipo, categoria;

        System.out.println("\f");
        System.out.println("RELATÃ“RIO DE PESO");
        System.out.println("\nDigite o tipo do Dinossauro: ");
        tipo = input.nextInt();
        System.out.println("Digite a categoria do Dinossauro: ");
        categoria = input.nextInt();

        dino = parque.pesoPesado(tipo, categoria);
        if(dino == null)
            System.out.println("Erro, nÃ£o existe um dinossauro com estes parÃ¢metros");
        else
            System.out.println(dino.toString());
    }

    public void relatRapido()
    {
        Dinossauro dino;
        int tipo, categoria;

        System.out.println("\f");
        System.out.println("RELATÃ“RIO DE VELOCIDADE");
        System.out.println("\nDigite o tipo do Dinossauro: ");
        tipo = input.nextInt();
        System.out.println("Digite a categoria do Dinossauro: ");
        categoria = input.nextInt();

        dino = parque.rapidao(tipo, categoria);
        if(dino == null)
            System.out.println("Erro, nÃ£o existe um dinossauro com estes parÃ¢metros");
        else
            System.out.println(dino.toString());
    }

    public void relatQuantC()
    {
        double quant;

        System.out.println("\f");
        System.out.println("RELATÃ“RIO DE ALIMENTAÃ‡ÃƒO");

        quant = parque.quantCarne();

        System.out.println("Quantidade de carne necessÃ¡ria para o mÃªs: " + quant + "Kg");
    }

    public void relatFugir()
    {
        int distDB, distPB, id;
        boolean s_n;

        System.out.println("\f");
        System.out.println("RELATÃ“RIO DE ZONAS DE PROTEÃ‡ÃƒO");
        System.out.println("\nDigite a distÃ¢ncia entre o dinossauro e o bunker:");
        distDB = input.nextInt();
        System.out.println("Digite a distÃ¢ncia entre a pessoa e o bunker:");
        distPB = input.nextInt();
        System.out.println("Digite o ID do dinossauro:");
        id = input.nextInt();

        s_n = parque.fugir(distDB, distPB, id);
        if(s_n == true)
            System.out.println("A distÃ¢ncia Ã© o suficiente para a pessoa escapar");
        else
            System.out.println("Nessa distÃ¢ncia, Ã© impossivel a pessoa escapar do dinossauro");
    }

    public void relatZonasP()
    {
        System.out.println("\f");
        System.out.println("RELATÃ“RIO DA ZONA MAIS PERIGOSA");
        System.out.println("\nA zona mais perigosa no momento Ã© a Zona" + parque.zonaP());
    }

}

