package Trabalhos.t2;

import java.util.Scanner;

public class Dragoes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de dias que os dragÃµes tem: ");
        int dias = in.nextInt();
        System.out.println("Informe o peso que RHAEGAL nasceu: ");
        double dragao1 = in.nextDouble();
        double dragao2 = dragao1 * 0.2 + dragao1;
        double dragao3 = dragao2 * 0.3 + dragao2;
        for (int i = 0; i <= dias; i++) {
            dragao1 += dragao1 * 0.005;
            dragao2 += dragao2 * 0.005;
            dragao3 += dragao3 * 0.005;
            if (i >= 2555) {
                System.out.println("AmeaÃ§a de dragÃ£o");
                break;
            }
        }
        double fogoD1 = dragao1 * 0.01;
        double fogoD2 = dragao2 * 0.01;
        double fogoD3 = dragao3 * 0.01;
        System.out.printf("Capacidade da bola de fogo dos dragÃµes:\n  Rheagal %.2f Metros Quadrados | Visorion %.2f Metros Quadrados | Drogon %.2f Metros Quadrados", fogoD1, fogoD2, fogoD3);
        System.out.printf("\nPeso dos dragoes:\n Rheagal %.2f KG | Visorion %.2f KG | Drogon %.2f KG", dragao1, dragao2, dragao3, "\n");
    }
}
