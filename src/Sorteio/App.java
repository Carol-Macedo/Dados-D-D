package Sorteio;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        Random random = new Random();


        System.out.println("Digite a quantidade de lados: ");
        int lados = sc.nextInt();

        System.out.println("Digite a quatidade de vezes: ");
        int vezes = sc.nextInt();

        int soma = 0;
        for(int i = 0; i < vezes; i++){
          int numero = random.nextInt(lados) + 1;

            soma +=numero;
            System.out.println(numero);

        }
        System.out.println("A soma é:  " + soma);
    }
}
