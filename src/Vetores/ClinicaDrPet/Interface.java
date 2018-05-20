/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores.ClinicaDrPet;

import java.util.Scanner;

/**
 *
 * @author Doug
 */
public class Interface {

    private CadastroPessoas cadPessoas;
    private CadastroBichos cadBichos;
    private CadastroConsultas cadConsultas;
    private Scanner in;

    public Interface() {
        cadPessoas = new CadastroPessoas(1000);
        cadBichos = new CadastroBichos(3000);
        cadConsultas = new CadastroConsultas(30000);
        in = new Scanner(System.in);
    }

    public void executa() {
        System.out.println("CLINICA DR. PET");
        int opcao = 1000;
        do {
            System.out.println("\fMenu");
            System.out.println("Informe 1 para Cliente");
            System.out.println("Informe 2 para Bichos");
            System.out.println("Informe 3 para Consultas");
            System.out.println("Informe 0 para SAIR");
            opcao = in.nextInt();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    menuPessoas();
                case 2:
                    menuBichos();
                case 3:
                    menuConsultas();
                default:
                    System.out.println("OpÃ§Ã£o inexistÃªnte");
            }
            System.out.print("\n\tDigite 0 para sair do sistema\t");
            in.nextInt();
        } while (opcao != 0);

    }

    public void menuPessoas() {
        int opcao = 1000;
        do {
            System.out.println("\fInforme 1 cadastro");
            System.out.println("Informe 2 pesquisa");
            System.out.println("Informe 3 remoÃ§Ã£o");
            System.out.println("Informe 0 para voltar ao menu anterior");
            opcao = in.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    cadastroPessoas();
                    break;
                case 2:
                    pesquisaPessoas();
                    break;
                case 3:
                    removerPessoas();
                    break;
                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida");
            }
        } while (opcao != 0);
    }

    public void menuBichos() {
        int opcao = 1000;
        do {
            System.out.println("\fInforme 1 cadastro");
            System.out.println("Informe 2 pesquisa");
            System.out.println("Informe 3 remoÃ§Ã£o");
            System.out.println("Informe 0 para voltar ao menu anterior");

            opcao = in.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    cadastroBichos();
                    break;
                case 2:
                    pesquisarBichos();
                    break;
                case 3:
                    removerBichos();
                    break;
                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida");
            }
        } while (opcao != 0);
    }

    public void menuConsultas() {
        int opcao = 1000;
        do {
            System.out.println("\fInforme 1 cadastro");
            System.out.println("Informe 2 pesquisa");
            System.out.println("Informe 3 ediÃ§Ã£o de parecer");
            System.out.println("Informe 0 para voltar ao menu anterior");

            opcao = in.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    cadastroConsulta();
                    break;
                case 2:
                    pesquisarConsulta();
                    break;
                case 3:
                    editarParecer();
                    break;
                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida");
            }
        } while (opcao != 0);
    }

    public void pesquisarConsulta() {
        System.out.println("Informe o CPF do dono: ");
        String cpf = in.next();
        System.out.println("Informe o nome do bixo: ");
        String nome = in.next();

        Consulta[] consultasEncontradas = cadConsultas.pesquisaConsultas(cpf, nome);
        if (consultasEncontradas.length == 0) {
            System.out.println("NÃ£o existem consultas cadastradas para este CPF e este Bicho");
        } else {
            System.out.println("Foram encontradas " + consultasEncontradas.length + " consultas.");

            for (int i = 0; i < consultasEncontradas.length; i++) {
                System.out.println("\nNÃºmero da consulta = " + i);
                System.out.println(consultasEncontradas[i].toString());
            }
            System.out.println("Informe o nÃºmero da consulta");
            int numeroConsulta = in.nextInt();
            if (numeroConsulta < consultasEncontradas.length) {
                System.out.println("Consulta encontrada");
                System.out.println(consultasEncontradas[numeroConsulta].toString());

                System.out.println("\nInforme o novo parecer: ");
                String novoParecer = in.nextLine();
                consultasEncontradas[numeroConsulta].setParecer(novoParecer);
            }
        }
    }

    public void editarParecer() {
        System.out.println("Informe o CPF do dono: ");
        String cpf = in.next();
        System.out.println("Informe o nome do bixo: ");
        String nome = in.next();

        Consulta[] consultasEncontradas = cadConsultas.pesquisaConsultas(cpf, nome);
        if (consultasEncontradas.length == 0) {
            System.out.println("NÃ£o existem consultas cadastradas para este CPF e este Bicho");
        } else {
            if (consultasEncontradas.length == 1) {
                System.out.println("Consulta encontrada");
                System.out.println(consultasEncontradas[0].toString());

                System.out.println("\nInforme o novo parecer: ");
                String novoParecer = in.nextLine();
                consultasEncontradas[0].setParecer(novoParecer);
            } else {
                System.out.println("Foram encontradas " + consultasEncontradas.length + " consultas.");

                for (int i = 0; i < consultasEncontradas.length; i++) {
                    System.out.println("\nNÃºmero da consulta = " + i);
                    System.out.println(consultasEncontradas[i].toString());
                }
                System.out.println("Informe o nÃºmero da consulta");
                int numeroConsulta = in.nextInt();
                if (numeroConsulta < consultasEncontradas.length) {
                    System.out.println("Consulta encontrada");
                    System.out.println(consultasEncontradas[numeroConsulta].toString());

                    System.out.println("\nInforme o novo parecer: ");
                    String novoParecer = in.nextLine();
                    consultasEncontradas[numeroConsulta].setParecer(novoParecer);
                }
            }

        }
    }

    public void removerPessoas() {
        System.out.println("Informe o CPF: ");
        String cpf = in.next();

        if (cadPessoas.pesquisarPessoa(cpf) == null) {
            System.out.println("Esse CPF nÃ£o se encontra cadastrado no sistema. Verifique.");
        } else {
            if (cadPessoas.removerPessoa(cpf)) {
                System.out.println("Cliente removido com sucesso");
            } else {
                System.out.println("Erro ao remover cliente");
            }
        }
        System.out.print("\n\tDigite 0 para voltar\t");
        in.nextInt();
    }

    public void pesquisaPessoas() {
        System.out.println("Informe o CPF: ");
        String cpf = in.next();

        if (cadPessoas.pesquisarPessoa(cpf) == null) {
            System.out.println("Esse CPF nÃ£o se encontra cadastrado no sistema. Verifique.");
        } else {
            Pessoa p = cadPessoas.pesquisarPessoa(cpf);
            System.out.println("Cliente encontrado com sucesso");
            System.out.println(p.toString());
        }
        System.out.print("\n\tDigite 0 para voltar\t");
        in.nextInt();
    }

    public void cadastroPessoas() {
        System.out.println("Informe o nome: ");
        String nome = in.next();
        System.out.println("Informe o telefone: ");
        String telefone = in.next();
        System.out.println("Informe o endereÃ§o: ");
        String endereco = in.next();
        System.out.println("Informe o CPF: ");
        String cpf = in.next();

        if (cadPessoas.pesquisarPessoa(cpf) != null) {
            System.out.println("Esse CPF jÃ¡ se encontra cadastrado no sistema. Verifique.");
        } else {
            Pessoa p = new Pessoa(cpf, nome, telefone, endereco);
            if (cadPessoas.adicionarPessoa(p)) {
                System.out.println("Cliente cadastrado com sucesso");
            } else {
                System.out.println("Erro ao cadastrar pessoa. Verifique se banco de dados nÃ£o se encontra cheio");
            }
        }
        System.out.print("\n\tDigite 0 para voltar\t");
        in.nextInt();
    }

    public void removerBichos() {
        System.out.println("Informe o CPF do dono: ");
        String cpf = in.next();
        System.out.println("Informe o nome do bicho: ");
        String nome = in.next();
        Bicho bichoEncontrado = cadBichos.pesquisarBicho(cpf, nome);
        if (bichoEncontrado != null) {
            if (cadBichos.removerBicho(cpf, nome)) {
                System.out.println("Bicho removido com sucesso.");
            } else {
                System.out.println("Erro ao remover bicho.");
            }
        } else {
            System.out.println("Este bicho nÃ£o se encontra cadastrado no cinema.");
        }
        System.out.print("\n\tDigite 0 para voltar\t");
        in.nextInt();
    }

    public void pesquisarBichos() {
        System.out.println("Informe o CPF do dono: ");
        String cpf = in.next();
        System.out.println("Informe o nome do bicho: ");
        String nome = in.next();
        Bicho bichoEncontrado = cadBichos.pesquisarBicho(cpf, nome);
        if (bichoEncontrado != null) {
            System.out.println("Bicho encontrado com sucesso.");
            System.out.println(bichoEncontrado.toString());

        } else {
            System.out.println("NÃ£o existem bichos cadastrados com este nome para este CPF");

        }
        System.out.print("\n\tDigite 0 para voltar\t");
        in.nextInt();
    }

    public void cadastroBichos() {
        System.out.println("Informe o CPF do dono: ");
        String cpf = in.next();

        Pessoa dono = cadPessoas.pesquisarPessoa(cpf);
        if (dono != null) {
            System.out.println("Cliente encontrado");
            System.out.println(dono.toString());
            System.out.println("\nInformaÃ§Ãµes sobre o bicho:");
            System.out.println("Informe o nome: ");
            String nome = in.next();
            Bicho bichoEncontrado = cadBichos.pesquisarBicho(cpf, nome);
            if (bichoEncontrado == null) {
                System.out.println("Informe o tipo (1-cachorro, 2-gato, 3-outros): ");
                int tipo = in.nextInt();
                System.out.println("Informe a raÃ§a: ");
                String raca = in.next();
                System.out.println("Informe a idade: ");
                int idade = in.nextInt();

                Bicho b = new Bicho(nome, tipo, raca, idade, dono);
                if (cadBichos.adicionarBicho(b)) {
                    System.out.println("Bicho cadastrado com sucesso.");
                } else {
                    System.out.println("Erro ao cadastrar bicho. Verifique se banco de dados nÃ£o se encontra cheio");
                }
            } else {
                System.out.println("JÃ¡ existe um bicho com o nome " + nome + " cadastrado para o cliente. Verifique.");
            }
        } else {
            System.out.println("Cliente nÃ£o encontrado. Cadastre o cliente antes de cadastrar o Bicho.");
            System.out.println("Deseja ser redirecionado para o cadastro de Cliente? [S/N]");
            String redireciona = in.next();
            if (redireciona.equalsIgnoreCase("S")) {
                cadastroPessoas();
            }
        }
        System.out.print("\n\tDigite 0 para voltar\t");
        in.nextInt();
    }

    public void cadastroConsulta() {
        System.out.println("Informe o CPF do dono: ");
        String cpf = in.next();
        System.out.println("Informe o nome do bixo: ");
        String nome = in.next();
        Bicho bichoEncontrado = cadBichos.pesquisarBicho(cpf, nome);
        if (bichoEncontrado != null) {
            System.out.println("Informe a data da consulta (DD/MM/AAA): ");
            String data = in.next();
            System.out.println("Informe o parecer da consulta: ");
            String parecer = in.nextLine();

            Consulta c = new Consulta(bichoEncontrado, data, parecer);
            if (cadConsultas.adicionarConsulta(c)) {
                System.out.println("Consulta cadastrada com sucesso.");
            } else {
                System.out.println("Erro ao cadastrar consulta. Verifique se banco de dados nÃ£o se encontra cheio");
            }
        } else {
            System.out.print("Bicho nÃ£o encontrado. Verifique.");
            System.out.println("Deseja ser redirecionado para o cadastro de Bichos? [S/N]");
            String redireciona = in.next();
            if (redireciona.equalsIgnoreCase("S")) {
                cadastroBichos();
            }
        }

        System.out.print("\n\tDigite 0 para voltar\t");
        in.nextInt();
    }
}
