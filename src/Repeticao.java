import java.util.Date;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero do exercicio: ");
        int exercicio = in.nextInt();
        switch (exercicio){
            case 1: ex2();
                break;
            case 2: ex4();
                break;
            case 3: ex6();
                break;
            case 4: ex7();
                break;
            default:
                System.out.println("exercicio ainda nao realizado");
        }
    }
    static void ex2(){
        Scanner in = new Scanner(System.in);

        System.out.println("\fInforme um nÃºmero");
        int num = in.nextInt();

        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador * num);
        }

        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador * num);
            contador++;
        }
    }
    static void ex4(){
        Scanner in = new Scanner(System.in);
        System.out.println("\f");
        System.out.println(new Date());
        for (int num = 1; num <= 1000000; num++) {
            int divisores = 0;
            for (int contador = 2; contador <= Math.sqrt(num); contador++) {
                if (num % contador == 0) {
                    divisores++;
                    break;
                }
            }
            if (divisores == 0) {
                System.out.println(num);
            }
        }
        System.out.println(new Date());
    }
    static void ex6(){
        System.out.println("\f");
        int t1 = 0;
        int t2 = 1;
        System.out.println(t2);
        for (int i = 1; i <= 20; i++) {
            int novoT = t1 + t2;
            t1 = t2;
            t2 = novoT;
            System.out.println(novoT);
        }
    }
    static void ex7(){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe BASE e EXPOENTE");
        int base = in.nextInt();
        int expoente = in.nextInt();

        int contador = 1;
        int resultado = 1;
        while (contador <= expoente) {
            resultado = resultado * base;
            contador++;
        }
        System.out.println(resultado);
    }
}
