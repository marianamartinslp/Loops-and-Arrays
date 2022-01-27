package Loops;

/*
Faça um programa que leia 5 numeros
e informe o maior numero e a media desses numeros
 */

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}

