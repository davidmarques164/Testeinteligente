package br.com.dio.calculador;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite um: ");
        a = scan.nextInt();
        System.out.println("Digite outro: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println(somar);
        System.out.println(subtrair);
        System.out.println(dividir);
        System.out.println(multiplicar);


    }



    public static int somar (int a, int b){
        return a + b;
    }
    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
    public static int dividir (int a, int b){
        return a / b;
    }
}
