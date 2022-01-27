package Arrays;

import java.util.Random;

/*
Faça um programa que leia 20 numeros inteiros aleatorios armazene-s num vetor.
Ao final mostre os numeros.
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosaleatorios = new int[20];

        for (int i = 0; i <numerosaleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosaleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatórios: ");
        for (int numero : numerosaleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nAntecessor dos Numeros Aleatorios");
        for (int numero: numerosaleatorios) {
            System.out.print((numero-1) + " ");

        }

        System.out.println("\nSucessores dos Numeros Aleatórios");
        for (int numero : numerosaleatorios) {
            System.out.print((numero + 1) + " ");

        }


    }

}