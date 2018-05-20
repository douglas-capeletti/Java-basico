import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero do exercicio: ");
        int exercicio = in.nextInt();
        switch (exercicio){
            case 0: testModulo();
                break;
            case 1: ex1();
                break;
            case 2: ex2();
                break;
            case 3: ex3();
                break;
            case 4: ex4();
                break;
            case 8: ex8();
                break;
            case 12: ex12();
                break;
            case 15: ex15();
                break;
            case 17: ex17();
                break;
            case 27: ex27();
                break;
            default:
                System.out.println("exercicio ainda nao realizado");
        }
    }

    static void ex1(){
        Scanner in = new Scanner(System.in);
        System.out.print("\f");

        System.out.println("Escreva 3 numeros separadamente:");
        int primeiro = in.nextInt();
        int segundo = in.nextInt();
        int terceiro = in.nextInt();

        if (1 < 2) {

        }
    }
    static void ex2(){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme uma data no formato dd mm aaaa: ");
        int dia = in.nextInt();
        int mes = in.nextInt();
        int ano = in.nextInt();

        if ((mes == 1
                || mes == 3
                || mes == 5
                || mes == 7
                || mes == 8
                || mes == 10
                || mes == 12)
                && (dia >= 1 && dia <= 31)) {
            System.out.print("Data valida!");
        } else if ((mes == 4
                || mes == 6
                || mes == 9
                || mes == 11)
                && (dia >= 1 && dia <= 30)) {
            System.out.print("Data valida!");
        } else if (mes == 2) {
            if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                if (dia >= 1 && dia <= 29) {
                    System.out.print("Data valida!");
                } else {
                    System.out.print("Data invalida!");
                }
            } else {
                if (dia >= 1 && dia <= 28) {
                    System.out.print("Data valida!");
                } else {
                    System.out.print("Data invalida!");
                }
            }
        } else {
            System.out.print("Data invalida!");
        }
    }
    static void ex3(){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor 1: ");
        int valor1 = in.nextInt();

        System.out.println("Informe o valor 2: ");
        int valor2 = in.nextInt();

        if (valor1 / valor2 > 0) {
            double resultado = valor1 / valor2;
            System.out.printf("Divisivel resultado: %.2f \n", resultado);

        } else if (valor1 / valor2 <= 0) {
            System.out.println("Indivisivel");
        } else {
            System.out.println("ERRO");
        }
    }
    static void ex4(){
        Scanner in = new Scanner(System.in);
        System.out.println("\f");

        System.out.println(" Informe um Ano: ");
        int ano = in.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Este Ano Ã© Bissexto");
        } else {
            System.out.println("Este Ano NÃƒO Ã© Bissexto");
        }

        System.out.println("FIM");
    }
    static void ex8(){
            Scanner in = new Scanner(System.in);
            System.out.println("\f");

            System.out.println("Informe seu dia de nascimento: ");
            int dia = in.nextInt();

            System.out.println("Informe seu mes de nascimento: ");
            int mes = in.nextInt();

            if (mes == 3 && dia >= 21 || mes == 4 && dia <= 20) {
                System.out.println("Seu signo e ARIES");

            } else if (mes == 4 && dia <= 21 || mes == 5 && dia <= 20) {
                System.out.println("Seu signo e TOURO");

            } else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
                System.out.println("Seu signo e GEMEOS");

            } else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 21) {
                System.out.println("Seu signo e CANCER");

            } else if (mes == 7 && dia >= 22 || mes == 8 && dia <= 22) {
                System.out.println("Seu signo e LEAO");

            } else if (mes == 8 && dia >= 23 || mes == 9 && dia <= 21) {
                System.out.println("Seu signo e VIRGEM");

            } else if (mes == 9 && dia >= 22 || mes == 10 && dia <= 22) {
                System.out.println("Seu signo e LIBRA");

            } else if (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) {
                System.out.println("Seu signo e ESCORPIAO");

            } else if (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) {
                System.out.println("Seu signo e SAGITARIO");

            } else if (mes == 12 && dia >= 22 || mes == 1 && dia <= 20) {
                System.out.println("Seu signo e CAPRICORNIO");

            } else if (mes == 1 && dia >= 21 || mes == 2 && dia <= 19) {
                System.out.println("Seu signo e AQUARIO");

            } else if (mes == 2 && dia >= 20 || mes == 3 && dia <= 20) {
                System.out.println("Seu signo e PEIXES");

            }
    }
    static void ex12(){
        Scanner in = new Scanner(System.in);
        System.out.println("\f");

        System.out.println("Informe seu saldo mÃ©dio: ");
        double saldo = in.nextDouble();
        double credito;

        if (saldo < 0 && saldo <= 500) {
            System.out.println("Nenhum crÃ©dito disponÃ­vel");

        } else if (saldo >= 501 && saldo <= 1000) {
            credito = (saldo * 0.3);
            System.out.printf("CrÃ©dito disponivel de: %.2f", credito);

        } else if (saldo >= 1001 && saldo <= 3000) {
            credito = (saldo * 0.4);
            System.out.printf("CrÃ©dito disponivel de: %.2f", credito);

        } else if (saldo > 3001 && saldo <= 100000) {
            credito = (saldo * 0.5);
            System.out.printf("CrÃ©dito disponivel de: %.2f", credito);

        } else if (saldo > 100000) {
            credito = (saldo * 0.5);
            System.out.println("Tu tÃ¡ traficando nÃ© querido, sÃ³ pode!");

        } else {
            System.out.println("ERRO");
        }
    }
    static void ex15(){
        Scanner in = new Scanner(System.in);
        System.out.print("\f");

        System.out.print("Sexo [F ou M]: ");
        char sexo = in.next().toUpperCase().charAt(0);
        System.out.print("Altura: ");
        double altura = in.nextDouble();
        System.out.print("Peso: ");
        double peso = in.nextInt();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC Ã© %.2f, vocÃª estÃ¡ ", imc);
        if (sexo == 'F') {
            if (imc < 19) {
                System.out.println("abaixo do normal");
            } else if (imc < 24) {
                System.out.println("normal");
            } else if (imc < 29) {
                System.out.println("com obesidade leve");
            } else if (imc < 39) {
                System.out.println("com obesidade moderada");
            } else {
                System.out.println("com obesidade mÃ³rbida");
            }
        } else if (sexo == 'M') {
            if (imc < 20) {
                System.out.println("abaixo do normal");
            } else if (imc < 25) {
                System.out.println("normal");
            } else if (imc < 30) {
                System.out.println("com obesidade leve");
            } else if (imc < 40) {
                System.out.println("com obesidade moderada");
            } else {
                System.out.println("com obesidade mÃ³rbida");
            }
        } else {
            System.out.println("[nÃ£o foi possÃ­vel verificar. Sexo invÃ¡lido.]");
        }
    }
    static void ex17(){
        System.out.println("               :");
        System.out.println("               :");
        System.out.println("               :");
        System.out.println("               :");
        System.out.println(".              :");
        System.out.println(" '.            :           .'");
        System.out.println("   '.          :         .'");
        System.out.println("     '.   .-\"\"\"\"\"\"-.   .'                                   .'':");
        System.out.println("       '.\"          \".'                               .-\"\"\"\"-.'         .---.          .----.        .-\"\"\"-.");
        System.out.println("        :            :                _    _        .\"     .' \".    ...\"     \"...    .\"      \".    .\"       \".");
        System.out.println(".........            .........    o  (_)  (_)  ()   :    .'    :   '..:.......:..'   :        :    :         :   o");
        System.out.println("        :            :                              :  .'      :       '.....'       '.      .'    '.       .'");
        System.out.println("         :          :                             .'.'.      .'                        `''''`        `'''''`");
        System.out.println("          '........'                              ''   ``````");
        System.out.println("         .'    :   '.");
        System.out.println("       .'      :     '.");
        System.out.println("     .'        :       '.");
        System.out.println("   .'          :         '.");
        System.out.println("               :");
        System.out.println("               :");
        System.out.println("               :");
        System.out.println("               :");

        Scanner in = new Scanner(System.in);
        System.out.print("\n\tInforme seu peso em Newtons:");
        double peso = in.nextDouble();
        System.out.println("\tPlanetas Disponiveis:");
        System.out.println("\t1\tMercurio");
        System.out.println("\t2\tVenus");
        System.out.println("\t3\tMarte");
        System.out.println("\t4\tJupiter");
        System.out.println("\t5\tSaturno");
        System.out.println("\t6\tUrano");
        System.out.println("\t7\tNetuno");
        System.out.println("\t8\tPlutao");
        System.out.print("\tInforme o planeta para onde ir:");
        int planeta = in.nextInt();
        double pi = 0;
        switch (planeta) {
            case 1:
                pi = (peso / 10) * 0.365;
                break;
            case 2:
                pi = (peso / 10) * 0.904;
                break;
            case 3:
                pi = (peso / 10) * 0.381;
                break;
            case 4:
                pi = (peso / 10) * 2.651;
                break;
            case 5:
                pi = (peso / 10) * 1.139;
                break;
            case 6:
                pi = (peso / 10) * 1.069;
                break;
            case 7:
                pi = (peso / 10) * 1.351;
                break;
            case 8:
                pi = (peso / 10) * 0.225;
                break;
            default:
                System.out.print("\tPlaneta Invalido");
        }

        System.out.print("\tSeu peso sera: " + pi);
    }
    static void ex27(){
        Scanner in = new Scanner(System.in);
        System.out.println("\f");

        System.out.println("Estados DisponÃ­veis: \n\t1 \n\t2 \n\t3 \n\t4 \n\t5");
        System.out.println("cÃ³digo do estado de origem: ");
        int origem = in.nextInt();

        System.out.println("Informe o Peso em toneladas!");
        System.out.println("Peso da carga: ");
        double peso = in.nextDouble();

        System.out.println("CÃ³digos validos entre 10 e 40");
        System.out.println("cÃ³digo da carga: ");
        int codigo = in.nextInt();

        double pesoKg = (peso * 1000);
        System.out.println("Peso do caminhÃ£o " + pesoKg + " Kilogramas");

        double precoBase = 0;

        if (codigo >= 10 && codigo <= 20) {
            precoBase = pesoKg * 100;
            System.out.println("Valor da carga sem imposto: R$" + precoBase);

        } else if (codigo >= 21 && codigo <= 30) {
            precoBase = pesoKg * 250;
            System.out.println("Valor da carga sem imposto: R$" + precoBase);

        } else if (codigo >= 31 && codigo <= 40) {
            precoBase = pesoKg * 340;
            System.out.println("Valor da carga sem imposto: R$" + precoBase);

        } else if (codigo < 10 || codigo > 40) {
            System.out.println("CÃ“DIGO INFORMADO INVÃ�LIDO");

        }

        double imposto = 0;
        switch (origem) {
            case 1:
                imposto = ((precoBase * 0.35) - precoBase);
                System.out.println("Valor do Imposto: R$" + imposto);
                break;

            case 2:
                imposto = ((precoBase * 0.25) - precoBase);
                System.out.println("Valor do Imposto: R$" + imposto);
                break;

            case 3:
                imposto = ((precoBase * 0.15) - precoBase);
                System.out.println("Valor do Imposto: R$" + imposto);
                break;

            case 4:
                imposto = ((precoBase * 0.05) - precoBase);
                System.out.println("Valor do Imposto: R$" + imposto);
                break;

            case 5:
                imposto = 0;
                System.out.println("Valor do Imposto: ISENTO");
                break;

            default:
                System.out.println("CÃ“DIGO DE ORIGEM INVÃ�LIDO");
        }

        double precoTotal = precoBase + imposto;
        System.out.println("PreÃ§o total da carga: R$" + precoTotal);
    }

    static void testModulo(){
        //Usando módulo para encontrar o maior e menor de 4 números
        int v1 = 5;
        int v2 = 8;
        int v3 = 3;
        int v4 = 1;

        int maior = (v1 + v2 + Math.abs(v1 - v2)) / 2;
        maior = (maior + v3 + Math.abs(maior - v3)) / 2;
        maior = (maior + v4 + Math.abs(maior - v4)) / 2;

        int menor = (v1 + v2 - Math.abs(v1 - v2)) / 2;
        menor = (menor + v3 - Math.abs(menor - v3)) / 2;
        menor = (menor + v4 - Math.abs(menor - v4)) / 2;

        System.out.println(maior);
        System.out.println(menor);

    }


}
