package Loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer numero inteiro entre 1 a 10.
O usuario deve informar qual numero ele deseja ver a tabuada.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada numero: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do numero: " + tabuada);

        for( int i = 1; i <= 10; i++) {
            System.out.println(tabuada + "X" + i + " = " + (tabuada * i));


        }
    }
}
