package Loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Nota {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida\n");
            System.out.println("Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
